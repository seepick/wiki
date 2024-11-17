package zouk

import Wiki
import kotlinx.html.*
import tabs.sectionedTab

object ZoukWiki : Wiki() {
    override val titleText = "Zouk Wiki"
    override val tabs = listOf(
        sectionedTab("Beginner") {
            section("Circly") {
                render {
                    p { +"It's good" }
                }
                subSection("Viranhina") {
                    render {
                        p { +"Go jumping" }
                    }
                }
            }
        }
    )
}
