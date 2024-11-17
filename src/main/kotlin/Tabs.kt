import kotlinx.browser.document
import kotlinx.html.FlowContent
import kotlinx.html.HtmlBlockTag
import kotlinx.html.a
import kotlinx.html.button
import kotlinx.html.classes
import kotlinx.html.div
import kotlinx.html.h1
import kotlinx.html.h2
import kotlinx.html.id
import kotlinx.html.js.onClickFunction
import kotlinx.html.li
import kotlinx.html.ol
import kotlinx.html.p
import org.w3c.dom.HTMLCollection
import org.w3c.dom.get

private const val TAB_DIV_ID_PREFIX = "tab-"
private const val TAB_BTN_ID_PREFIX = "tabButton-"

abstract class Tab {
    abstract val tabId: String
    abstract val title: String

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

class SubSection(
    id: String,
    val title: String,
) {
    val partialId: String = "subsection_$id"
}
class Section(
    id: String,
    val title: String,
    val subSections: List<SubSection>,
    val renderer: (FlowContent) -> Unit,
) {
    val id: String = "section_$id"
}

abstract class SectionedTab : Tab() {

    abstract val sections: List<Section>
    override fun renderContentIn(root: HtmlBlockTag) {
        root.div {
            div {
                id = "navigationContainer"
                p {
                    id = "tocTitle"
                    +"Content:"
                }
                ol {
                    sections.forEach { section ->
                        li {
                            a {
                                href = "#${section.id}"
                                +section.title
                            }
                            if(section.subSections.isNotEmpty()) {
                                ol {
                                    section.subSections.forEach { subSection ->
                                        li {
                                            a {
                                                href = "#${subSection.fullId(section)}"
                                                +subSection.title
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            div {
                id = "contentContainer"
                sections.forEach { section ->
                    div {
                        h1 {
                            id = section.id
                            +section.title
                        }
                        section.renderer(this)
                        section.subSections.forEach { subSection ->
                            h2 {
                                id = subSection.fullId(section)
                                +subSection.title
                            }
                        }
                    }
                }
            }
        }
    }
}

private fun SubSection.fullId(section: Section) = "${section.id}_$partialId"

fun renderTabBar(tabs: List<Tab>, root: HtmlBlockTag, recentTabId: String?) {
    root.div(classes = "tabBar center") {
        tabs.forEachIndexed { index, tab ->
            button(classes = "tabButton") {
                id = "$TAB_BTN_ID_PREFIX${tab.tabId}"
                if (recentTabId != null) {
                    if (recentTabId == tab.tabId) {
                        classes += "tabActive"
                    }
                } else if(index == 0) {
                    classes += "tabActive"
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
    Cookies.write(CookieKey.RECENT_TAB_ID, tabIdToOpen)

    val buttons: HTMLCollection = document.getElementsByClassName("tabButton")
    (0..<buttons.length).forEach { i ->
        val button = buttons[i]!!
        val currentButtonsTabId = button.id.removePrefix(TAB_BTN_ID_PREFIX)
        val currentTabId = TAB_DIV_ID_PREFIX + currentButtonsTabId
        val tab = document.getElementById(currentTabId) ?: error("Tab not found by ID [$currentTabId]!")
        if (button.id == "$TAB_BTN_ID_PREFIX$tabIdToOpen") {
            button.classList.add("tabActive")
            if(tab.classList.contains("invisible")) {
                tab.classList.remove("invisible")
            }
        } else {
            if(button.classList.contains("tabActive")) {
                button.classList.remove("tabActive")
            }
            tab.classList.add("invisible")
        }
    }
}