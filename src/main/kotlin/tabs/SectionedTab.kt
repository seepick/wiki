package tabs

import Section
import SubSection
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
            ol {
                sections.forEach { section ->
                    section.renderListItem(this)
                }
            }
        }
    }
    private fun renderContentContainer(root: HtmlBlockTag) {
        root.div {
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
                        subSection.renderer(this)
                        subSection.subSubSections.forEach { subSubSection ->
                            h3 {
                                id = subSubSection.fullId(section, subSection)
                                +subSubSection.title
                            }
                            subSubSection.renderer(this)
                        }
                    }
                }
            }
        }
    }
}

private fun Section.renderListItem(root: OL) {
    val section = this
    root.li {
        a {
            href = "#${section.id}"
            +section.title
        }
        if (subSections.isNotEmpty()) {
            ol {
                subSections.filter { it.showInToc }.forEach { subSection ->
                    subSection.renderListItem(this, section)
                }
            }
        }
    }
}

private fun SubSection.renderListItem(root: OL, section: Section) {
    val subSection = this
    root.li {
        a {
            href = "#${subSection.fullId(section)}"
            +subSection.title
        }
    }
}
