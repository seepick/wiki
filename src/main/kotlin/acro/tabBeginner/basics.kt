package acro.tabBeginner

import acro.AcroRef.*
import common.image
import common.ref
import common.ulDefinition
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun AcroBeginnerSections.basics(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Basics") {
            html {
                p {
                    +"There are two types of AcroYoga: L-shape (L-basing) on the ground (more common), and standing."
                }
            }
            subSection("Terminology") {
                html {
                    ulDefinition(
                        "Base" to "To person on the bottom.",
                        "Flyer" to "To person flying on top. ",
                        "Spotter" to "A third person for safe guarding.",
                        "To mount" to "To enter a pose as a flyer; like mounting on a horse.",
                        "Inversion" to "Basically a fancy way of saying upside-down.",
                        "Hot Potato" to "The way a spotter only sparely touches to (not over-)support.",
                        "Peace Grip" to "Hands of both connected with middle and index fingers on forearms.",
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
                        p {
                            +"For the ";b{+"flyer"};+", there are different positions each with a name useful to be familiar with. "
                            +"The video for ";ref(Candlestick);+" has at the end a demonstration of those positions."
                        }
                        ul {
                            li { +"";b{+"Tuck"};+": Knees bent and close to the chest, like a little ball. " }
                            li { +"";b{+"Straddle Pike"};+": Legs fully extended and spread to the side (90 degrees). " }
                            li { +"";b{+"Straddle"};+": Legs extended and 45 degrees diagonally." }
                            li { +"";b{+"Straight"};+": Extended legs together and straight up (like a candle). " }
                            li { +"";b{+"Double Stag"};+": Both legs slightly bent, one front other back (like running). " }
                        }
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
            subSection("Warming up") {
                html {
                    p { +"Solo: "}
                    ul {
                        li { +"Wrist strengthening, shifting weight onto them in table top" }
                        li { +"Planking, to fire up the core (esp. for flyers)" }
                    }
                    p { +"Partnered: "}
                    ul {
                        li { +"Counter balancing, weight shifting movements" }
                    }
                }
            }
        }
    }
}
