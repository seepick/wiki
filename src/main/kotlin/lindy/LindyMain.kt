package lindy

import Wiki
import kotlinx.html.*
import tabs.sectionedTab
import video

object LindyWiki : Wiki() {
    override val titleText = "Lindy Hop Wiki"
    override val tabs = listOf(
        sectionedTab("Introduction") {
            section("Resources") {
                subSection("Music") {
                    content {
                        p { +"Some music list" }
                    }
                }
            }
        },
        sectionedTab("Beginner") {
            section("General Advice") {
                subSection("Butterfly") {
                    content {
                        p { +"Some description" }
                        video(id = "7e2SjRIfD4U?si=R4WWwPD0DGrYyjdX", caption = "some caption")
                    }
                }
            }
            section("Techniques") {
                content {
                    p { +"Some notes" }
                }
            }
        }
    )
}
