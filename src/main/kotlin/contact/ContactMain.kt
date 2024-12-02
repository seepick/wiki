package contact

import Wiki
import defineList
import image
import kotlinx.html.*
import tabs.sectionedTab
import video

object ContactWiki : Wiki() {
    override val titleText = "Contact Improvisation Wiki"
    override val tabs = listOf(
        sectionedTab("Animal Crossings") {
            section("Introduction") {
                content {
                    p { +"A little animal is basically a more dynamic (alive) table top position. "
                        +"This section will describe how we can cross such a little animal, meaning going over to the other side. "
                        +"The parts of going onto (hop on) and coming off (hop off) are separated as they can be freely combined." }
                    p { +"General advice: (TODO: refine)" } // TODO: refine general advice
                    ul {
                        li { +"oompf quality (from very beginning, maintain throughout)" }
                        li { +"little animal is living/active/supporting/helping" }
                    }
                }
            }
            // TODO section = part 1 ... subSection = hop on ... subSubSection = specific technique ==> for that we need subSubSection (h3) support
            section("Hop On") {
                content {
                    p { +"TODO: some intro text ..." } // TODO intro text
                    p { +"Going onto your partner with your side (instead with belly or back) will not be covered here and is left for the individual exploration (or for an additional part II)." }
                    // TODO redo image as HTML table
                    image("images/animal_crossings-hop_on.jpg", "All 8 simple versions on how to hop on a little animal")
                    defineList(
                        "Face Direction" to "Are both facing in the same / or the opposite direction at the beginning?",
                        "First Crossing" to "Are your arms / or your legs going over first?",
                        "Body Contact" to "Are you on your partner with your belly / or with your back?",
                    )
                    p { +"General advice: (TODO: refine)" } // TODO: refine general advice
                    ul {
                        li { +"Reach for standard position, 90 degrees/perpendicular" }
                        li { +"superman to verify balanced" }
                        li { +"use chicken leg if unbalanced" }
                        li { +"octopus quality" }
                        li { +"Be really, really precise with the landing position to stay balanced. Avoid cheating by sliding your position or lifting yourself up." }
                    }
                }
                subSection("Same - Arms - Belly") {
                    content {
                        p { +"This is the most simple one to get on your partner." }
                        ol {
                            li { +"Start by moving your outer leg diagonally to the front, replacing the outer (preferred) or sometimes inner hand. "
                                 +"Where to place the foot depends on height/length differences: When climbing bigger animals, replace the inner hand. "
                                 +"Experiment yourself and replace the hand which leads to the most stable position and allowing you a centered landing (distance)." }
                            li { +"Tuck the toes of your inner leg, and externally rotate the leg, pivoting on your knee, so that your foot is placed further away." }
                            li { +"Lift and rotate your upper body, while maintaining the connection with your partner. "
                                 +"Continue doing a knee-lifted lunge, pushing your knee off the ground to raise the level of your pelvis (adjust depending on where you need to land centered)." }
                            li { +"Put your hands diagonally onto your partner for support (if needed): One on the closer shoulder blade, the other on the further away pelvis bone." }
                            li { +"Rotate both legs so your whole body is facing 90 degrees perpendicular towards your partner, your legs in a V-shape." }
                        }
                        video("nZLkRjtiH-c?si=_l_4Z4Vqxlc2w_yd", "Crossing same direction, with arms first, landing on your belly")
                    }
                }
            }
            section("Hop Off") {
                content {
                    p { +"Learn how to get back on the ground once you are on your little animal." }
                    image("images/animal_crossings-hop_off.jpg", "All 8 simple versions on how to hop off a little animal")
                    defineList(
                        "Body Contact" to "Are you on your partner with your belly / or with your back?",
                        "Going Down" to "Are your arms / or your legs landing first on the ground?",
                        "Face Direction" to "Are both facing in the same / or the opposite direction at the end?",
                    )
                }
                subSection("TODO") {
                    content {
                        p { +"TODO" }
                    }
                }
            }
        }
    )
}
