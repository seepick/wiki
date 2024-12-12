package lindy.tabBeginner

import common.youtube
import kotlinx.html.*
import lindy.LindyBeginnerSections
import tabs.SectionedTabDsl

fun LindyBeginnerSections.positioning(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Positioning") {
            content {
                p { +"These are some simple techniques to change your positions/places. "
                    +"It usually involves a pulling force and a few traveling steps, and ending up standing on each other's original spot. "
                }
            }
            subSection("Open-Closed-Transition") {
                // =====================================================================================================
                content {
                    p { +"In order to go from open to closed-position, you can continue to pull backwards (by stepping backwards) after the rock-step."
                        +"This should be enough for the follower to come closer. "
                        +"With the leader's right arm reached open, it should be visually enough to make the intention clear. "
                        +"Otherwise, the follower can do that herself at any time; no need to have a too rigid \"leader leading only\" attitude. "
                    }
                    p { +"Another way is to do a so-called ";b{+"fake change places"};+". "
                        +"The leader raises his arm (as if looking at his watch), but stays on the spot (not changing his place), while the follower continues doing a change places. "
                        +"He reaches early for her back to indicate moving into a closed position. "; br
                        +"There is something awkward happening with the arm, as she has to move it around his shoulder. "
                        +"For safety reasons, lead from the hand, raising it high up, and not from the elbow, to not hit your lead in his face with your elbow. "
                    }
                }
            }
            subSection("Pass-By") {
                // =====================================================================================================
                content {
                    p { +"Also called \"change positions\" or \"change places\" -nomen est omen."
                        +"We start in an ";b{+"open position"};+" and keep, for example, an asynchronous/opposite direction basic-step. "
                        +"A 6-count basic feels more comfortable, but an 8-count is possible as well. "
                        +"The easiest way to play around here is to simply indicate a change by ";b{+"moving the arm"};+" a bit to the left or right, just as if we would indicate a travel-step."
                        +"Try to also switch into ";b{+"crossed-hand position"};+" to enrich variations."
                    }
                    p { +"To do a turn, the leader has to ";b{+"raise his arm"};+" straight up. "
                        +"At the same time, the arm is internally rotating, as if he would look at his watch on the second count/quick-step. "
                        +"The follower goes underneath that arm and rotates 180 degrees CCW. "; br
                        +"Remember to do small steps (otherwise you end up too far away from each other), and to not cross your steps. "
                    }
                    p { +"Similarly, the ";b{+"leader"};+" can lift his arm more to the left and walk underneath it himself. "
                        +"By that, he turns CCW (with the back towards her), while the follower is still facing him. "
                    }
                    youtube("aXxqsY45GD8?si=MXHj3KMjDVJ8P9GF", "Freely changing places in the open position")
                    p { +"A bit of a more advanced move is to try to pull back your follower. "
                        +"At the very last moment, lift your arm and turn her in the ";b{+"other direction"};+". "
                        +"This seems a bit counter-intuitive and surprising at first but will come more naturally with practice. "
                    }
                    youtube("JP3ZBYMFHcA?si=MR65UK7G29WcRf_B", "Going from an open to a closed position by catching the follower during a turn")
                }
            }
            subSection("Around the World") {
                // =====================================================================================================
                content {
                    p { +"In open-position (6-count), we start like doing a simple pass-by, leader going a bit more to the left. "
                        +"The right hand goes over the arms, the left hand letting go of the contact and rotating CCW. "
                        +"Just as with the Soltinho in Zouk, the follower's hand slides over the leader's body (like a belt). "
                    }
                    p { +"Catching the hand contact again can be a bit tricky, but by keeping the arms up, and sliding and rotating a bit it should work. "
                        +"Alternatively, you can also catch the hand from the inside, ending up in a \"wrong\" hand position but then quickly fix it with a change places rotation. "
                    }
                }
            }
            subSection("Mess Around") {
                // =====================================================================================================
                content {
                    p { +"After the starting rock-step, break the footwork, connect the hip of your partner, and draw a circle. "
                        +"Preferably CCW, as this seems a bit easier for the beginning. "
                        +"To start again (to exit), simply enter with a rock-step and you are back to basics. "
                    }
                }
            }
        }
    }
}
