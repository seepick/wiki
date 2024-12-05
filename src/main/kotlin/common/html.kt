package common

import kotlinx.html.FlowContent
import kotlinx.html.FlowOrHeadingContent
import kotlinx.html.FlowOrInteractiveOrPhrasingContent
import kotlinx.html.H2
import kotlinx.html.H3
import kotlinx.html.HtmlTagMarker
import kotlinx.html.TagConsumer
import kotlinx.html.a
import kotlinx.html.b
import kotlinx.html.div
import kotlinx.html.h2
import kotlinx.html.h3
import kotlinx.html.id
import kotlinx.html.iframe
import kotlinx.html.img
import kotlinx.html.li
import kotlinx.html.ol
import kotlinx.html.p

fun FlowContent.defineList(vararg keys: Pair<String, String>) {
    ol {
        keys.forEach { (key, value) ->
            li {
                b { +"${key}: " }
                +value
            }
        }
    }
}

fun FlowContent.image(source: String, caption: String) {
    div(classes = "imageContainer") {
        img { src = source }
        p(classes = "caption") { +caption }
    }
}

@HtmlTagMarker inline fun FlowOrHeadingContent.sectionTitle(classes: String? = null, crossinline block: H2.() -> Unit) =
    h2(classes, block)

@HtmlTagMarker inline fun FlowOrHeadingContent.subSectionTitle(classes: String? = null, crossinline block: H3.() -> Unit) =
    h3(classes, block)

fun <R> TagConsumer<R>.wikiTitle(text: String) {
    div {
        id = "titleContainer"
        p {
            id = "title"
            +text
        }
    }
}

@HtmlTagMarker
fun FlowContent.youtube(id: String, caption: String) {
    div(classes = "videoContainer") {
        iframe {
            src = "https://www.youtube.com/embed/$id"
            attributes["allow"] =
                "accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
            attributes["referrerpolicy"] = "strict-origin-when-cross-origin"
            attributes["allowfullscreen"] = ""
        }
        p(classes = "caption") { +caption }
    }
}

fun FlowOrInteractiveOrPhrasingContent.externalLink(href: String, label: String) {
    a(href) {
        +label
        target = "_blank"
    }
}
