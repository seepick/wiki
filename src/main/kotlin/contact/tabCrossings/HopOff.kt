package contact.tabCrossings

import common.olDefinition
import contact.ContactAnimalSections
import kotlinx.html.*
import tabs.SectionedTabDsl

fun ContactAnimalSections.hopOff(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Hop Off") {
            content {
                p { +"Learn how to get back on the ground to a side-by-side position, once you are on your little animal." }
                tableHopOff()
                olDefinition(
                    "Body Contact" to "Are you on your partner with your belly, or with your back?",
                    "Going Down" to "Are your arms, or your legs landing first on the ground?",
                    "Face Direction" to "Are both facing in the same, or the opposite direction at the end?",
                )
            }
            subSection("Belly and arms") {
                content {
                    p { +"TODO" }
                }
            }
            subSection("Belly and legs") {
                content {
                    p { +"TODO" }
                }
            }
            subSection("Back and arms") {
                content {
                    p { +"TODO" }
                }
            }
            subSection("Back and legs") {
                content {
                    p { +"TODO" }
                }
            }
        }
    }
}
