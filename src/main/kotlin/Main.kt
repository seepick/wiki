import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.html.*
import kotlinx.html.dom.*
import lindy.LindyWiki
import org.w3c.dom.HTMLElement
import zouk.ZoukWiki

abstract class Wiki {
    protected abstract val titleText: String
    fun renderIn(root: HTMLElement) {
        root.append.wikiTitle(titleText)
        root.append.div {
            id = "middleWrapper"
            div {
                id = "middleCentered"
                renderContentIn(this)
            }
        }
    }
    protected abstract fun renderContentIn(root: HtmlBlockTag)
}

fun main() {
    val wiki = parseWikiType()
    println("Starting ${wiki::class.simpleName} ...")
    window.onload = { e ->
        val root = document.getElementById("root") as? HTMLElement ?: error("Main container 'root' not found!")
        wiki.renderIn(root)
        e
    }
}
private fun parseWikiType() = when (val raw = js("wikiType")) {
    "lindy" -> LindyWiki
    "zouk" -> ZoukWiki
    else -> error("Invalid wiki type [$raw]!")
}
