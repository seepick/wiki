package lindy

import Section
import SectionedTab
import SubSection
import Tab
import Wiki
import kotlinx.html.*
import kotlinx.html.dom.*
import kotlinx.html.js.onClickFunction
import org.w3c.dom.HTMLElement
import youtube

object LindyWiki : Wiki() {
    override val titleText = "Lindy Hop Cheatsheet"
    override val tabs = listOf(
        IntroTab, BeginnerTab, IntermediateTab
    )
}

object IntroTab : Tab() {
    override val tabId = "intro"
    override val title = "Intro"
    override fun renderContentIn(root: HtmlBlockTag) {
        root.p { +"Some intro disclaimer" }
    }
}

object BeginnerTab : SectionedTab() {
    override val tabId = "beginner"
    override val title = "Beginner"
    override val sections = listOf(
        Section(id = "first", title = "My first section",
            renderer = { root ->
                root.div {
                    p { +"sub text" }
                    youtube(id = "7e2SjRIfD4U?si=R4WWwPD0DGrYyjdX", caption = "some caption")
                }
            },
            subSections = listOf(
                SubSection(id = "foo", title = "Foo")
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

object IntermediateTab : SectionedTab() {
    override val tabId = "intermediate"
    override val title = "Intermediate"
    override val sections = emptyList<Section>()
}

@HtmlTagMarker
fun FlowContent.section1(title: String, action: FlowContent.() -> Unit) {
    div {
        h1(classes = "a b") {
            +title
            onClickFunction = { _ ->
                println("clicked title")
            }
        }
        action()
    }
}