import kotlinx.html.FlowContent
import kotlinx.html.HtmlTagMarker
import kotlinx.html.TagConsumer
import kotlinx.html.div
import kotlinx.html.id
import kotlinx.html.iframe
import kotlinx.html.p

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
            attributes["allow"] = "accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
            attributes["referrerpolicy"] = "strict-origin-when-cross-origin"
            attributes["allowfullscreen"] = ""
        }
        p(classes = "caption") { +caption }
    }
}

external fun encodeURIComponent(str: String): String
external fun decodeURIComponent(str: String): String
