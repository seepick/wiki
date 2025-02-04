package common

import kotlinx.html.*

interface Ref {
    val label: String
    val id: String
}

fun <REF : Ref> FlowOrInteractiveOrPhrasingContent.ref(ref: REF, label: String = ref.label) {
    a("#${ref.id}") { +label }
}

data class Topic(val key: String, val html: FlowContent.() -> Unit)

fun FlowContent.topics(vararg topics: Topic) {
    dl {
        topics.forEach { (key, html) ->
            dt { b { +key } }
            dd(block = html)
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

fun FlowContent.image(
    source: String,
    size: Pair<Int, Int>,
    caption: String? = null,
    id: String? = null,
    link: String? = null,
    ) {
    div(classes = "imageContainer") {
        val content = {
            img {
                if(id != null) this.id = id
                src = source
                width = size.first.toString()
                height = size.second.toString()
            }
            if(caption != null) p(classes = "caption") { +caption }
        }
        if(link == null) content()
        else {
            div(classes = "imageLinkContainer") {
               style = "width:${size.first}px"
                a(link, target = "_blank") {
                    content()
                }
            }
        }
    }
}

@HtmlTagMarker
inline fun FlowOrHeadingContent.sectionTitle(classes: String? = null, crossinline block: H2.() -> Unit) =
    h2(classes, block)

@HtmlTagMarker
inline fun FlowOrHeadingContent.subSectionTitle(classes: String? = null, crossinline block: H3.() -> Unit) =
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
