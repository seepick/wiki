package zouk.tabIntermediate

import common.youtube
import kotlinx.html.p
import tabs.SectionedTabDsl

fun ZoukIntermediateSections.newMoves(dsl: SectionedTabDsl) {
    with(dsl) {
        section("New Moves") {
            subSection("Elastico") {
                html {
                    p {
                        +"Start in a basic, holding hands in a further away distance. "
                        +"When positioned at the back, stay on the spot to increase the distance further. "
                        +"Let go of the right hand and step out of the line. "
                        +"Let go of the left hand and use the right to pull the follower back on the hip. "
                        +"Slide in with the left over the shoulder and arm to go back to basic. "
                    }
                    youtube("DaQ4HhR7Ekc?si=0e2rCdM-jJiUSbG8", "Elastico move from basic")
                }
            }
        }
    }
}
