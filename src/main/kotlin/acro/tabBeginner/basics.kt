package acro.tabBeginner

import common.image
import common.ulDefinition
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun AcroBeginnerSections.basics(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Basics") {
            html {
                p {
                    +"There are two types of AcroYoga: L-shape on the ground (more common), and standing."
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
                subSubSection("Gymnastics") {
                    html {
                        p {
                            +"In acrobatics (and AcroYoga as a simplified version of partner acrobatics) it is common to reuse vocabulary from gymnastics. "
                            +"Make yourself familiar with those to be able to clearly communicate with your partner. "
                        }
                        image("images/gymnastics.jpg", 700 to 500)
                        youtube("odtTxfO0k6k", "Demonstration and of 10 beginner gymnastic moves/positions")
                    }
                }
            }
            subSection("General Advice") {
                subSubSection("Universally") {
                    html {
                        ul {
                            li {
                                +"We help the base ";b{+"going down and getting up"};+" (to and from the mat), by reaching a firm grip with the hands as an act of support, care, and respect. "
                            }
                        }
                    }
                }
                subSubSection("Base") {
                    html {
                        ul {
                            li {
                                +"Stop to lift, start to ";b { +"carry" };+", be (like) the ground (my friend). "
                                +"Meaning to use architecture/structure to allow bone stacking, instead of muscular effort. "
                                +"The flyer can then feel the ground through the base. "
                            }
                        }
                    }
                }
            }
        }
    }
}
