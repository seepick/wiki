import kotlinx.browser.document
import kotlinx.browser.window
import lindy.LindyWiki
import org.w3c.dom.Element
import zouk.ZoukWiki

interface Wiki {
    fun renderIn(root: Element)
}

private fun parseWikiType() = when (val raw = js("wikiType")) {
    "lindy" -> LindyWiki
    "zouk" -> ZoukWiki
    else -> error("Invalid wiki type [$raw]!")
}

fun main() {
    val wiki = parseWikiType()
    println("Starting app [${wiki::class.simpleName}]...")
    window.onload = { e ->
        val root = document.getElementById("root") ?: error("Main container 'root' not found!")
        wiki.renderIn(root)
        e
    }
}
