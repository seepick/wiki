package contact

import Wiki
import kotlinx.html.p
import tabs.sectionedTab

object ContactWiki : Wiki() {
    override val titleText = "Contact Improvisation Wiki"
    override val tabs = listOf(
        sectionedTab("Introduction") {
            section("Resources") {
                subSection("Music") {
                    render {
                        p { +"Some music list" }
                    }
                }
            }
        },
        sectionedTab("Beginner") {
            section("General Advice") {
                subSection("Butterfly") {
                    render {
                        p { +"Some description" }
                    }
                }
            }
            section("Techniques") {
                render {
                    p { +"Some notes" }
                }
            }
        }
    )
}
