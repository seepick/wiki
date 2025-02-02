package tabs

import CookieKey
import Cookies
import common.setAnchor
import kotlinx.browser.document
import kotlinx.html.*
import kotlinx.html.js.onClickFunction
import org.w3c.dom.HTMLCollection
import org.w3c.dom.get

private const val TAB_DIV_ID_PREFIX = "tab-"
private const val TAB_BTN_ID_PREFIX = "tabButton-"

abstract class Tab(
    val tabId: String,
    val title: String,
) {

    fun render(root: HtmlBlockTag, visible: Boolean) {
        root.div {
            id = "$TAB_DIV_ID_PREFIX$tabId"
            classes += ""
            if (!visible) {
                classes += "invisible"
            }
            renderContentIn(this)
        }
    }

    protected abstract fun renderContentIn(root: HtmlBlockTag)
}

fun renderTabBar(tabs: List<Tab>, root: HtmlBlockTag, preselectedTabId: String?) {
    root.div(classes = "tabBar center") {
        tabs.forEachIndexed { index, tab ->
            button(classes = "tabButton") {
                id = "$TAB_BTN_ID_PREFIX${tab.tabId}"
                if (preselectedTabId != null) {
                    if (preselectedTabId == tab.tabId) {
                        classes += "tabActive"
                        disabled = true
                    }
                } else if (index == 0) { // preselect first by default
                    classes += "tabActive"
                    disabled = true
                }
                +tab.title
                onClickFunction = {
                    openTab(tab.tabId)
                }
            }
        }
    }
}

fun openTab(tabIdToOpen: String) {
    console.log("openTab($tabIdToOpen)")
    Cookies.write(CookieKey.RECENT_TAB_ID, tabIdToOpen)
    setAnchor("#$tabIdToOpen")

    val buttons: HTMLCollection = document.getElementsByClassName("tabButton")
    (0..<buttons.length).forEach { i ->
        val button = buttons[i]!!
        val currentButtonsTabId = button.id.removePrefix(TAB_BTN_ID_PREFIX)
        val currentTabId = TAB_DIV_ID_PREFIX + currentButtonsTabId
        val tab = document.getElementById(currentTabId) ?: error("Tab not found by ID [$currentTabId]!")
        if (button.id == "$TAB_BTN_ID_PREFIX$tabIdToOpen") {
            button.classList.add("tabActive")
            button.setAttribute("disabled", "")
            if (tab.classList.contains("invisible")) {
                tab.classList.remove("invisible")
            }
        } else {
            if (button.classList.contains("tabActive")) {
                button.classList.remove("tabActive")
                button.removeAttribute("disabled")
            }
            tab.classList.add("invisible")
        }
    }
}
