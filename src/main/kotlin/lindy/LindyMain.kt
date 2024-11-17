package lindy

import Wiki
import kotlinx.html.*
import kotlinx.html.dom.*
import kotlinx.html.js.onClickFunction
import org.w3c.dom.HTMLElement
import youtube

object LindyWiki : Wiki() {
    override val titleText = "Lindy Hop Cheatsheet"
    override fun renderContentIn(root: HtmlBlockTag) {
        root.div {
            p { +"Lindy Hop Cheatsheet" }
            section1("my section title") {
                p { +"sub text" }
                youtube(id = "7e2SjRIfD4U?si=R4WWwPD0DGrYyjdX", caption = "some caption")
            }
        }
    }
}
@HtmlTagMarker
fun FlowContent.section1(title: String, action: FlowContent.() -> Unit) {
    div {
        h1(classes = "a b") {
            +title
            onClickFunction = { _ ->
                println("clicked title")
            }
        }
        action()
    }
}