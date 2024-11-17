import contact.ContactWiki
import kotlinx.browser.document
import kotlinx.browser.window
import lindy.LindyWiki
import org.w3c.dom.HTMLElement
import zouk.ZoukWiki

fun main() {
    window.onload = { e ->
        val root = document.getElementById("root") as? HTMLElement ?: error("Main container 'root' not found!")
        parseWikiType().renderIn(root)
        e
    }
}

private fun parseWikiType() = when (val raw = js("wikiType")) {
    "lindy" -> LindyWiki
    "zouk" -> ZoukWiki
    "contact" -> ContactWiki
    else -> error("Invalid wiki type [$raw]!")
}
