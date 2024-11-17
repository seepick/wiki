import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.html.*
import kotlinx.html.dom.*
import lindy.LindyWiki
import org.w3c.dom.HTMLElement
import zouk.ZoukWiki

abstract class Wiki {
    protected abstract val titleText: String
    protected abstract val tabs: List<Tab>
    fun renderIn(root: HTMLElement) {
        root.append.wikiTitle(titleText)
        root.append.div {
            id = "middleWrapper"
            div {
                id = "middleCentered"
                val recentTabId = Cookies.read(CookieKey.RECENT_TAB_ID)
                renderTabBar(tabs, this, recentTabId)

                tabs.forEachIndexed { index, tab ->
                    val visible = if(recentTabId != null) tab.tabId == recentTabId else index == 0
                    tab.render(this, visible)
                }
            }
        }
    }
}

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
    else -> error("Invalid wiki type [$raw]!")
}
