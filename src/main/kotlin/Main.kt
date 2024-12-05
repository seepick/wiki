import common.parseAnchor
import common.setTimeout
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
        val anchor = parseAnchor().navigationalId
        if (anchor != null) {
            val scrollTo = document.getElementById(anchor) ?: error("Element by ID via anchor not found: '$anchor'!")
            setTimeout({ scrollTo.scrollIntoView() }, 1) // bit of a hack ;)
        }
        e
    }
}

private fun parseWikiType() = when (val raw = js("wikiType")) {
    "lindy" -> LindyWiki
    "zouk" -> ZoukWiki
    "contact" -> ContactWiki
    else -> error("Invalid wiki type [$raw]!")
}
