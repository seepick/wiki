import common.parseAnchor
import common.setAnchor
import common.wikiTitle
import kotlinx.html.div
import kotlinx.html.dom.append
import kotlinx.html.id
import org.w3c.dom.HTMLElement
import tabs.Tab
import tabs.renderTabBar

abstract class Wiki {

    protected abstract val titleText: String
    protected abstract val tabs: List<Tab>

    fun renderIn(root: HTMLElement) {
        root.append.wikiTitle(titleText)
        root.append.div {
            id = "middleWrapper"
            div {
                id = "middleCentered"
                val recentTabId = calculateRecentTabId()
                if(recentTabId != null && parseAnchor().tabId != recentTabId) {
                    setAnchor("#$recentTabId")
                }
                renderTabBar(tabs, this, recentTabId)
                tabs.forEachIndexed { index, tab ->
                    val visible = if (recentTabId != null) tab.tabId == recentTabId else index == 0
                    tab.render(this, visible)
                }
            }
        }
    }
}

private fun calculateRecentTabId(): String? {
    val cookieTabId = Cookies.read(CookieKey.RECENT_TAB_ID)
    val anchorTabId = parseAnchor().tabId
    return if (anchorTabId != null && anchorTabId != cookieTabId) { // give precedence to anchor over cookie
        Cookies.write(CookieKey.RECENT_TAB_ID, anchorTabId)
        anchorTabId
    } else cookieTabId
}
