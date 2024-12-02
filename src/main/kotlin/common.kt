import kotlinx.html.*

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
fun FlowContent.video(id: String, caption: String) {
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

external fun encodeURIComponent(str: String): String
external fun decodeURIComponent(str: String): String

fun buildId(string: String): String =
    string.replace(" ", "_")
        .filter { it.isLetterOrDigit() || it == '_' }
        .lowercase()

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