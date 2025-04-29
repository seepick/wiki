package zouk.tabPreadvanced

import common.ref
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl
import zouk.ZoukRef
import zouk.tabIntermediate.ZoukIntermediateSections

fun ZoukPreadvancedSections.newMoves(dsl: SectionedTabDsl) {
    with(dsl) {
        section("New Moves") {
            subSection("Roasted Chicken") {
                html {
                    p {
                        +"Roasted chicken can also be called more technically as a rotational turn (rotisserie?), or as a spiral. "
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
                    p {
                        +"Watch out to keep the follower's arm approximately shoulder height when finishing this move and going back to lateral, as otherwise it might communicate something different. "
                    }
                }
                subSubSection("Combined with Balao") {
                    html {
                        p {
                            +"We already know the head movement called ";ref(ZoukRef.Balao);+" from the improver's class. "
                            +"Start when the follower is on the left, to have her head tilted to her right side. "
                            +"Once she is on your right side (did one lateral), her head should now be tilted to her left side, the starting position. "
                            +"The Balao is thus only have a round, to the back only."
                            +"From her, when the roasted chicken starts, the head is going straight down, chin to the chest. "; br
                            +"Additionally, you can walk around (CW) the follower, keep your right hand in touch, over the waist and diagonally up to the shoulder and initiate another Balao and Roasted Chicken. "
                        }
                        youtube("VUpU-vW1QD0?si=G3RQ-2_HYUnRQ17P", "Roasted Balao")
                    }
                }
            }
        }
    }
}
