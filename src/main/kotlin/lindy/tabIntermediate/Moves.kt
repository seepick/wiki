package lindy.tabIntermediate

import common.ref
import common.youtube
import kotlinx.html.*
import lindy.LindyRef
import tabs.SectionedTabDsl

fun LindyIntermediateSections.moves(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Moves") {
            content {
                p {
                    +"Now that you have the basic footwork pattern, your frame and the connection, and a few basic moves, "
                    +"let's add onto that and learn a few more complex techniques."
                }
            }
            subSection("Swing-Out") {
                content {
                    p {
                        +"This is probably THE signature move of Lindy Hop, which resembles a bit of a yoyo movement. "
                        +"As such, it maintains a linear motion, expanding and contracting like an accordion. "
                        +"The hips of the follower are swinging instead of making a circular movement. "
                    }
                    p {
                        +"It's basically a more dynamic 'bring-in' in the open position, which can also be initiated from the follower. "
                        +"Or the follower can initiate it from a ";ref(LindyRef.Circle);+" by 'throwing herself out'. "
                        +"The Swing-Out can also be ";b{+"extended"};+" which feels a bit like a Circle as well. "
                        +"This is done by the follower by holding onto the follower's arm. "
                    }
                    youtube("_OSNMLYGzzU?si=3cAEib-Q3hYkTrj6", "Swing-Out initiated by the follower (Bring-In, Circle) and extended")
                }
            }
        }
    }
}
