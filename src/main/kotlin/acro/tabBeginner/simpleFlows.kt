package acro.tabBeginner

import acro.AcroRef.*
import common.ref
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun AcroBeginnerSections.simpleFlows(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Beginner Flows") {
            subSection("Three in One") {
                html {
                    youtube("sYM4GrsJcRo", "Acro Connection - Simple and beautiful flow for beginners")
                    p {
                        +"";b{+"First sequence"};+" from 0:00 until 0:46"
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
                        +"";b{+"Second sequence"};+" from 0:47 until 1:10"
                    }
                    ol {
                        li { +"Start into a ";ref(Candlestick);+"." }
                        li { +"Step down to a ";ref(StraddleBat);+"." }
                        li { +"Transition to a ";ref(FloatingPaschi);+"." }
                        li { +"Exit with a front flip via a Back Bird." }
                    }
                    p {
                        +"";b{+"Third sequence"};+" from 1:11 until 1:52"
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
