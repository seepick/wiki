package zouk

import Wiki
import kotlinx.browser.document
import org.w3c.dom.Element

object ZoukWiki : Wiki {
    override fun renderIn(root: Element) {
        val p = document.createElement("p")
        p.innerHTML = "Zouk wiki"
        root.append(p)
    }
}