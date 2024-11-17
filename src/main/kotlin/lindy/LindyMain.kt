package lindy

import Section
import tabs.SectionedTab
import SubSection
import tabs.Tab
import Wiki
import kotlinx.html.*
import youtube

object LindyWiki : Wiki() {
    override val titleText = "Lindy Hop Cheatsheet"
    override val tabs = listOf(IntroTab, BeginnerTab, IntermediateTab)
}

object IntroTab : Tab(tabId = "intro", title = "Intro") {
    override fun renderContentIn(root: HtmlBlockTag) {
        root.p { +"Some intro disclaimer" }
    }
}
/*
// infer IDs by title (filter A-Za-z and lowercase first, remove whitespace and uppercase first)
listOf(
    sectionedTab("Beginner") {
        section("Techniques") {
            render {
                p { +"Some description" }
            }
            subSection("Butterfly") {
                render {
                    p { +"Some description" }
                    youtube(id = "7e2SjRIfD4U?si=R4WWwPD0DGrYyjdX", caption = "some caption")
                }
            }
        }
    }
)
 */
object BeginnerTab : SectionedTab(tabId = "beginner", title = "Beginner") {
    override val sections = listOf(
        Section(id = "first", title = "My first section",
            renderer = { root ->
                root.div {
                    p { +"section text" }
                }
            },
            subSections = listOf(
                SubSection(id = "foo", title = "Foo",
                    renderer = { root ->
                        root.div {
                            p { +"sub section text" }
                            youtube(id = "7e2SjRIfD4U?si=R4WWwPD0DGrYyjdX", caption = "some caption")
                        }
                    })
            ),
        ),
        Section(id = "second", title = "Second",
            renderer = { root ->
                root.div {
                    p { +"haha" }
                }
            },
            subSections = emptyList()
        )
    )
}

object IntermediateTab : SectionedTab(tabId = "intermediate", title = "Intermediate") {
    override val sections = emptyList<Section>()
}
