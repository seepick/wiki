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
