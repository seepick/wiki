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
            subSection("Rotisserie") {
                html {
                    youtube("_XVOqI18htw?si=n-WCaM3prfPpA0sL", "Rotisserie follower explanation, with Side-Basic")
                    p {
                        +"Roasted Chicken can also be called more vividly as a rotational turn, or ";b{+"roasted chicken"};+", or simply a multi-dimensional spiral movement. "
                        +"It is basically a rotation in a different plane: Either transversal (simple turn) versus in the frontal plane (roasted chicken)."
                        +"From lateral, you can indicate a simple turn, and ending up on the other side. "
                        +"Watch out to not block the follower's line, but also not to move out too far and too quickly. "; br
                        +"If you step diagonally further away, ";b{+"over-rotating"};+", you can change the line"; br
                        +"The simple turn is indicating by the hand going around the follower's \"halo\", "
                        +"whereas if you want to signal a spiral, you draw a big circle in front of you. "
                        +"Also add a lateral ";b{+"tilt"};+", doing what you are leading, moving the left side up, and then like a rollercoaster deep down again, ";b{+"scooping"};+". "
                        +"This variation can be applied basically everywhere a simple turn can be done; think of ";ref(ZoukRef.Soltinho);+" for example. "; br
                        +"Followers watch out to keep your core engaged to protect injury of the lower back; move from the chest. "
                    }
                    youtube("pdaNvERLsRE?si=cI9Z1hDYt1J2edek", "Roasting the chicken turn")
                    p {
                        +"Watch out to keep the follower's arm approximately shoulder height when finishing this move and going back to lateral, as otherwise it might communicate something different. "
                        +"The hand stays facing the palm downwards throughout the move; only exception when the hand/arm is rotating, when the leader does the rotisserie as well. "
                    }
                }
                subSubSection("Combined with Balao") {
                    html {
                        p {
                            +"We already know the head movement called ";ref(ZoukRef.Balao);+" from the beginner/improvers class. "
                            +"Start when the follower is on the left, to have her head tilted to her right side. "
                            +"Once she is on your right side (did one lateral), her head should now be tilted to her left side (resembles more of a Tilted Turn). "
                            +"The Balao is thus only have a round, to the back only."
                            +"From here, when the roasted chicken starts, the head is going straight down, chin to the chest. "; br
                            +"Additionally, you can walk around (CW) the follower, keep your right hand in touch, over the waist and diagonally up to the shoulder and initiate another Balao and Roasted Chicken. "
                        }
                        youtube("VUpU-vW1QD0?si=G3RQ-2_HYUnRQ17P", "Roasted Balao")
                    }
                }
            }
            subSection("Viradinha Turns") {
                html {
                    p {
                        +"There are several different variations you can do a Viradinha. "
                        +"Practice them first before going into the details of the turn. "
                    }
                    ul {
                        li { +"Simply going in and out." }
                        li { +"Going in, stay by walk forth and back." }
                        li { +"Doing a quarter turn." }
                        li { +"Hesitate, by going in, turn a bit and push against." }
                        li { +"Doing a hesitate, but pushing through into a turn." }
                    }
                    p {
                        +"Also practice to stay very close with your body connection, so your hips touch when you are side-by-side. "
                        +"Do a \"half-WiFi\" by not using your left arm; when staying close, your right arm doesn't need to slide anymore on the back as usually necessary. "
                        +"The left arm is the usual \"noodle arm\", hanging relaxed down your body without tension; preferably for this finger facing inwards. "
                        +"And don't forget the basic about a correct Viradinha, which is the general rule anyways of: The leader steps out of the follower's line! "
                    }
                    p {
                        +"The ";b{+"Hesitate"};+" is done by turning towards each other when walking forward in the Viradinha. "
                        +"You can then either go back again (similar like a Lunge hesitate), or \"push through\" resulting in a turn, left arm is up. "
                        +"If you do a single turn, then you need to add 1 basic step in order to stay with the rhythm; not so if you do an even number of turns. "
                        +"As usual, the sliding of the arm down is giving the follower a clear signal to end the turn. "
                        +"You can either have both palms facing each other with a slight pressure (more static), or \"stir\" with both fingers in her \"cup-hand\", possible helping a bit with the turn. "; br
                        +"Remember: A turn is a turn, not a spin; they are more pivot-steps to maintain balance. Also remember to stay on your line. "
                    }
                    youtube("RD6zeVV-HiI?si=uH3u2_ymd4jQHvjX", "Viradinha Turns (single and double)")
                }
            }
        }
    }
}
