package acro.tabBeginner

import common.youtube
import kotlinx.html.p
import tabs.SectionedTabDsl


fun AcroBeginnerSections.trio(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Trio") {
            html {
                youtube("ULBAk3U_4Jo", "Some visual impression of a trio flow")
            }
            subSection("Seated Shoulder-stand") {
                html {
                    p {
                        +"The lower base is in tabletop position, the second base sitting on the other's sacrum, facing away. "
                        +"The flyer is now doing a shoulder-stand on the upper legs, near the knees. "
                        +"From there, a transition to a counterbalance is possible, by grabbing one of the flyer's ankle and lean back. "
                    }
                }
            }
        }
    }
}
