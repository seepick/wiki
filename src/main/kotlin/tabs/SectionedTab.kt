package tabs

import Section
import SubSection
import common.Columnizer
import common.DoubleColumn
import common.SingleColumn
import fullId
import kotlinx.html.*

abstract class SectionedTab(
    tabId: String,
    title: String,
) : Tab(tabId, title) {
    abstract val sections: List<Section>

    override fun renderContentIn(root: HtmlBlockTag) {
        root.div {
            renderNavigationContainer(this)
            renderContentContainer(this)
        }
    }

    private fun renderNavigationContainer(root: HtmlBlockTag) {
        root.div {
            id = "navigationContainer"
            p {
                id = "tocTitle"
                +"Content:"
            }
            val columns = Columnizer.columnize(sections)
            fun renderOl(secs: List<Section>, startAt: Int = 1) {
                ol {
                    attributes["type"] = "I"
                    start = startAt.toString()
                    secs.forEach { section ->
                        section.renderTocItem(this)
                    }
                }
            }
            when (columns) {
                is DoubleColumn -> {
                    div("tocRow") {
                        div("tocCol") {
                            renderOl(columns.tops1)
                        }
                        div("tocCol") {
                            renderOl(columns.tops2, startAt = columns.tops1.size + 1)
                        }
                    }
                }

                is SingleColumn -> renderOl(columns.tops)
            }
        }
    }

    private fun renderContentContainer(root: HtmlBlockTag) {
        root.div {
            id = "contentContainer"
            sections.forEach { section ->
                div {
                    h1 {
                        id = section.fullId(this@SectionedTab)
                        +section.title
                    }
                    section.renderer(this)
                    section.subSections.forEach { subSection ->
                        h2 {
                            id = subSection.fullId(this@SectionedTab, section)
                            +subSection.title
                        }
                        subSection.renderer(this)
                        subSection.subSubSections.forEach { subSubSection ->
                            h3 {
                                id = subSubSection.fullId(this@SectionedTab, section, subSection)
                                +subSubSection.title
                            }
                            subSubSection.renderer(this)
                        }
                    }
                }
            }
        }
    }

    private fun Section.renderTocItem(root: OL) {
        val section = this
        root.li {
            a {
                href = "#${section.fullId(this@SectionedTab)}"
                +section.title
            }
            if (subSections.isNotEmpty()) {
                ol {
                    attributes["type"] = "1"
                    subSections.filter { it.showInToc }.forEach { subSection ->
                        subSection.renderTocItem(this, section)
                    }
                }
            }
        }
    }

    private fun SubSection.renderTocItem(root: OL, section: Section) {
        val subSection = this
        root.li {
            a {
                href = "#${subSection.fullId(this@SectionedTab, section)}"
                +subSection.title
            }
        }
    }

}
