package common

import kotlinx.html.*
import lindy.LindyRef

fun FlowOrInteractiveOrPhrasingContent.ref(ref: LindyRef) {
    a("#${ref.id}") { +ref.label }
}

fun FlowContent.ulDefinition(vararg keys: Pair<String, String>) {
    ul {
        keys.forEach { (key, value) ->
            li {
                b { +"${key}: " }
                +value
            }
        }
    }

}
fun FlowContent.olDefinition(vararg keys: Pair<String, String>) {
    ol {
        keys.forEach { (key, value) ->
            li {
                b { +"${key}: " }
                +value
            }
        }
    }
}

fun FlowContent.image(source: String, caption: String, size: Pair<Int, Int>) {
    div(classes = "imageContainer") {
        img {
            src = source
            width = size.first.toString()
            height = size.second.toString()
        }
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
