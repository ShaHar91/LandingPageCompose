package com.christiano.bolla.components

import androidx.compose.runtime.*
import com.christiano.bolla.models.Section
import com.christiano.bolla.styles.NavigationItemStyle
import com.christiano.bolla.utils.Constants
import com.christiano.bolla.utils.Res
import com.varabyte.kobweb.compose.css.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Color.Companion.argb
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.icons.fa.FaXmark
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.components.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.*

@Composable
fun OverlowMenu(onMenuClosed: () -> Unit) {
    val scope = rememberCoroutineScope()
    val breakpoint = rememberBreakpoint()
    var translateX by remember { mutableStateOf((-100).percent) }
    var opacity by remember { mutableStateOf(0.percent) }

    fun CoroutineScope.closeMenu() {
        launch {
            translateX = (-100).percent
            opacity = 0.percent
            delay(500)
            onMenuClosed()
        }
    }

    LaunchedEffect(breakpoint) {
        translateX = 0.percent
        opacity = 100.percent

        if (breakpoint > Breakpoint.MD) {
            scope.closeMenu()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.vh)
            .position(Position.Fixed)
            .zIndex(2)
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
                .opacity(opacity)
                .backgroundColor(argb(0.5f, 0.0f, 0.0f, 0.0f))
                .transition(
                    CSSTransition("opacity", 500.ms)
                )
                .onClick { scope.closeMenu() }
                .onTouchMove { scope.closeMenu() }
                .onScroll { scope.closeMenu() }
                .onWheel { scope.closeMenu() }
        )

        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(all = 25.px)
                .width(if (breakpoint < Breakpoint.MD) 50.percent else 25.percent)
                .overflow(Overflow.Auto)
                .scrollBehavior(ScrollBehavior.Smooth)
                .backgroundColor(Colors.White)
                .translateX(tx = translateX)
                .transition(CSSTransition("translate", 500.ms))
        ) {
            Row(
                modifier = Modifier
                    .margin(bottom = 25.px),
                verticalAlignment = Alignment.CenterVertically
            ) {
                FaXmark(
                    modifier = Modifier
                        .cursor(Cursor.Pointer)
                        .margin(right = 20.px, bottom = 3.px)
                        .onClick {
                            scope.closeMenu()
                        },
                    size = IconSize.LG
                )

                Image(
                    modifier = Modifier.size(80.px),
                    src = Res.Image.logo,
                    desc = "Logo Image"
                )
            }

            Section.values().dropLast(2).forEach { section ->
                Link(
                    modifier = NavigationItemStyle.toModifier()
                        .padding(bottom = 10.px)
                        .fontFamily(Constants.FONT_FAMILY)
                        .fontSize(16.px)
                        .fontWeight(FontWeight.Normal)
                        .textDecorationLine(TextDecorationLine.None)
                        .onClick {
                            scope.closeMenu()
                        },
                    path = section.path,
                    openExternalLinksStrategy = OpenLinkStrategy.IN_PLACE,
                    text = section.title
                )
            }
        }
    }
}