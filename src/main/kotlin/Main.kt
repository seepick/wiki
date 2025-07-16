import acro.AcroWiki
import common.onAnchorChanged
import common.showAlertIfInvalidRefsFound
import common.parseAnchor
import common.setTimeout
import contact.ContactWiki
import kotlinx.browser.document
import kotlinx.browser.window
import lindy.LindyWiki
import org.w3c.dom.HTMLElement
import org.w3c.dom.HashChangeEvent
import zouk.ZoukWiki

fun main() {
    window.onload = { e ->
        val root = document.getElementById("root") as? HTMLElement ?: error("Main container 'root' not found!")
        val wiki = parseWikiType()
        wiki.renderIn(root)
        val elementId = parseAnchor().navigationalId
        if (elementId != null) {
            val scrollTo = document.getElementById(elementId) ?: error("Element by ID via anchor not found: '$elementId'!")
            setTimeout({ scrollTo.scrollIntoView() }, 1) // a bit of a hack ;)
        }
        window.addEventListener("hashchange", { e ->
            onAnchorChanged(e as HashChangeEvent)
            e
        })

        showAlertIfInvalidRefsFound(wiki)
        e
    }
}

private fun parseWikiType() = when (val raw = js("wikiType")) {
    "lindy" -> LindyWiki
    "zouk" -> ZoukWiki
    "contact" -> ContactWiki
    "acro" -> AcroWiki
    else -> error("Invalid wiki type [$raw]!")
}
