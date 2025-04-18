package zouk.tabPreadvanced

import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl
import zouk.tabIntermediate.ZoukIntermediateSections

fun ZoukPreadvancedSections.newMoves(dsl: SectionedTabDsl) {
    with(dsl) {
        section("New Moves") {
            subSection("Roasted Chicken") {
                html {
                    p {
                        +"Roasted chicken can also be called more technically as a rotational turn, or as a spiral. "
                        +"It is basically a rotation in a different plane: Either transversal (simple turn) versus in the frontal plane (roasted chicken)."
                        +"From lateral, you can indicate a simple turn, and ending up on the other side. "
                        +"Watch out to not block the follower's line, but also not to move out too far and too quickly. "; br
                        +"If you step diagonally further away, ";b{+"over-rotating"};+", you can change the line"; br
                        +"The simple turn is indicating by the hand going around the follower's \"halo\", "
                        +"whereas if you want to signal a spiral, you draw a big circle in front of you. "
                        +"Also add a lateral ";b{+"tilt"};+", doing what you are leading, moving the left side up, and then like a rollercoaster deep down again, ";b{+"scooping"};+". "
                        +"This variation can be applied basically everywhere a simple turn can be done; think of Soltinho for example. "; br
                        +"Followers watch out to keep your core engaged to protect injury of the lower back; move from the chest. "
                    }
                    youtube("pdaNvERLsRE?si=cI9Z1hDYt1J2edek", "Roasting the chicken turn")
                }
            }
        }
    }
}
