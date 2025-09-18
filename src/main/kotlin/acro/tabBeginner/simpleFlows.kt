package acro.tabBeginner

import acro.AcroRef.*
import common.ref
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun AcroBeginnerSections.simpleFlows(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Beginner Flows") {
            subSection("ClapYourWings Beginner") {
                subSubSection("Class 1") {
                    html {
                        ol {
                            li { +"Regular bird" }
                            li { +"Shoulder stand" }
                            li { +"Butt-to-shin" }
                            li { +"Whale" }
                            li { +"Hand-Bird (via butt-to-shin)" }
                            li { +"Bird (via handstand-drop)" }
                        }
                        youtube("WXU28K3NrHc", "Strong flyer core sequence")
                    }
                }
                subSubSection("Class 2") {
                    html {
                        p {
                            +"Coming soon..."
                        }
                    }
                }
            }
            subSection("Whale-Chair") {
                html {
                    youtube("0dGS_6KFf4s", "Christoph and Stefanie practicing this simple sequence")
                    p {
                        +"Transition from ";ref(WhalePose);+" to "; ref(ThronePose); +":"
                    }
                    ol {
                        li { +"Once the flyer is in Whale Pose, spread the arms sideways in a Jesus arm position" }
                        li { +"The base changes both hand positions sequentially from below carves to underneath the feet" }
                        li { +"Then change also feet positions, further towards the knee (crucial repositioning!)" }
                        li { +"When 2nd foot moves, do a bicycle move to keep her over your center; flyer doing a strong sit-up (super crucial moment!)" }
                    }
                    p {
                        +"Transition from ";ref(ThronePose);+" to ";b{+"Reverse Low Foot-to-Hand"};+":"
                    }
                    ol {
                        li { +"The base's hands grab the flyer's feet (if not already doing so)" }
                        li { +"Flyer's forearms on feet of base (needs repositioning)" }
                        li { +"Base lowering arms, close to the torso (more stable, like one compact unit)" }
                        li { +"Base pronate arms to push weight more towards heel (more stable for flyer)" }
                        li { +"Flyer stands up; can use base's legs for support; base can then cheat a bit with legs to support more" }
                        li { +"Fingers of base wrapped more stability (at least psychological help), but don't lose center of palm surface contact" }
                    }
                }
            }
            subSection("Three in One") {
                html {
                    youtube("sYM4GrsJcRo", "Acro Connection - Simple and beautiful flow for beginners")
                    p {
                        +"";b { +"First sequence" };+" from 0:00 until 0:46"
                    }
                    ol {
                        li { +"Both on their backs, lift her with hands on her hips." }
                        li { +"Transition with a flip into a ";ref(WhalePose);+"." }
                        li { +"Jump or step into a ";ref(ThronePose);+"." }
                        li { +"Stand up into a Foot-to-Shin (his shins)." }
                        li { +"Jump or into a regular front bird." }
                        li { +"Step into a Shin-to-Foot (her shins)." }
                        li { +"Back into a bird." }
                        li { +"Flip forward to exit." }
                    }
                    p {
                        +"";b { +"Second sequence" };+" from 0:47 until 1:10"
                    }
                    ol {
                        li { +"Start into a ";ref(Candlestick);+"." }
                        li { +"Step down to a ";ref(StraddleBat);+"." }
                        li { +"Transition to a ";ref(FloatingPaschi);+"." }
                        li { +"Exit with a front flip via a Back Bird." }
                    }
                    p {
                        +"";b { +"Third sequence" };+" from 1:11 until 1:52"
                    }
                    ol {
                        li { +"Step into a ";ref(ThronePose);+"." }
                        li { +"Jump or step into a Bird." }
                        li { +"Transition to a ";ref(Candlestick);+"." }
                        li { +"Ending up in a reverse Straddle Bat, but then turn in a regular Bat." }
                        li { +"Step up to a ";ref(Candlestick);+"." }
                        li { +"Backflip through a Back Bird to exit." }
                    }
                }
            }
            subSection("Birds and Feet and Hands") {
                html {
                    ol {
                        li { +"Starting from Bird." }
                        li { +"Transition to a low Foot-to-Hand." }
                        li { +"Sit back into a Back Bird." }
                        li { +"Via Throne go into an extended Foot-to-Hand." }
                        li { +"Ending in Throne." }
                    }
                    youtube("jso09dengAA", "Acrodicted - Bird, Foot-to-Hand, Bird, Foot-to-Hand")
                }
            }
        }
    }
}
