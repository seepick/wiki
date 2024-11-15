package lindy

import Wiki
import kotlinx.browser.document
import org.w3c.dom.Element

object LindyWiki : Wiki {
    override fun renderIn(root: Element) {
        val p = document.createElement("p")
        p.innerHTML = "Lindy wiki"
        root.append(p)
    }
}