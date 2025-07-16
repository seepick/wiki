package acro.tabBeginner

import common.ulDefinition
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun AcroBeginnerSections.basics(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Basics") {
            html {
                p {
                    +"There are two types of acroyoga: L-shape on the ground (more common), and standing."
                }
            }
            subSection("Terminology") {
                html {
                    ulDefinition(
                        "Base" to "To person on the bottom.",
                        "Flyer" to "To person flying on top. ",
                        "Spotter" to "A third person for safe guarding.",
                        "To mount" to "To enter a pose as a flyer; like mounting on a horse."
                    )
                }
            }
        }
    }
}
