package zouk.tabBeginner

import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun ZoukBeginnerSections.steps(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Steps") {
            html {
                p {
                    +"Which ever steps and moves we make, when there is a clear geometrical line to follow, "
                    +"the leader always steps out, freeing the path for the follower, creating a generous \"red carpet \". "
                }
            }
            subSection("Basic") {
                // =====================================================================================================
                html {
                    p {
                        b { +"On-Spot" }; +": Step only on slow; or even slower; at the very beginning of the dance, or when there is no beat."; br
                        +"You can practice different ";b { +"rhythms" };+", as in: The Zumba beat steps on every base, the Bachata on the base and once (first snare) in between. "
                        +"Whereas with Zouk we step on the base and on both snares, leading to the infamous \"boom chic chic\"-pattern."
                    }
                    p {
                        b { +"Basic Step" }; +": This is the most regular forward-and-backward step universally present in all moves. "
                        +"Using either connecting style (closed or open), the leader starts with his left leg stepping back. "
                        +"The 1st step on the slow gives the direction, the 2nd is to control the force "
                        +"or for direction change (only toes touch, heels up), and the 3rd to ground again. "
                        +"Feet are sliding on the ground (not stepping) and on different lines than partner (\"within\") to avoid stepping on each other's feet."
                    }
                    p {
                        b { +"Transition" }; +": From basic to lateral, by \"sending follower out\" "
                        +"(leader stays on the spot during basic), and both are changing their stepping styles. "; br
                        +"The same from lateral to embrace, keep the follower on her spot (no travelling-step). "
                        +"Do so by pushing your right hand into her, like when doing a \"Yoyo through\" or a \"Swing Out\"."
                    }
                    youtube(
                        "mA9xGt11twk?si=VHsTUE19Yt-52WbW",
                        "Standing on the down-beat, small lateral, and stepping on the spot (with styling)"
                    )
                    p {
                        +"Remember: The boom sound is usually for walking straight, the chic is for turns/spins."
                        +"Keep your feet always on the ground; ";b { +"slide" };+", don't step!"
                        +"The slow step is reached really ";b { +"far" };+" forward and backward."
                        +"And keep your feet always in a ";b { +"V-shape" };+" like seen in Ballet's plie position."
                    }
                }
            }
            subSection("Lateral") {
                // =====================================================================================================
                html {
                    p {
                        +"The leader is doing basic side-steps (optionally stepping forward or staying on the line), always facing forward towards the follower. "
                        +"The follower moves left and right, turning, and facing the leader. "
                        +"The turn is indicated by a slight/gentle pull from the leader to step across. "; br
                        +"That pull force is not coming from the arm but through the arm which is connected to the center (chest orientation, upper body rotation). "
                        +"One hand is pulling sideways and the arm is more active; the other is more relaxed and directed towards the hip/waist (don't do a \"passing by\"). "
                    }
                    youtube(
                        "l_xhJqttlu0?si=bj8gJusBO4OMCTw1",
                        "Basic, push-out, lateral, and back to basic (mixed, or close)"
                    )
                    p {
                        +"For your own investigation, feel free to research the \"reverse lateral\", where the follower walks backwards. "
                        +"From the lateral, let her rotate (other direction than embrace), leader from side-step to lateral step. "
                        +"Exit by simply staying on the spot for one beat, and pulling her straight into lateral again. "
                    }
                    p {
                        +"The difference between travelling- and stationary-step applies especially, but not only to lateral. "
                        +"This is all about timing, and maybe about a (slight) arm pull from your center/frame. "
                        +"Although there is a good intention from the leader, to announce it early, as in \"there is something coming soon\" it might backfire. "
                        +"Some followers use it as a signal to do something right away, like a small arm change/lift, and execute instead of prepare a move. "
                    }
                }
            }
            subSection("Side-Basic") {
                html {
                    p {
                        +"This is the leader's part of when doing the lateral (for the follower). "
                        +"You can either step to the side (the most simple version), to the front (most common version, giving more spin), or to the back (increasing the distance). "
                    }
                }
            }
            subSection("Embrace") {
                // =====================================================================================================
                html {
                    p {
                        +"From lateral step, keep holding both hands, and start when the follower is facing left. "
                        +"Always create enough space to allow for doing a travelling-turn, doing her tuum-step going left, and turn on the chicks. "
                        +"The following tuum is again a step to the left for her, allowing a smooth, continued movement. "; br
                        +"The result of doing a travelling-turn (instead staying on the spot which breaks the flow) is a leader's consecutively side-step. "
                        +"Finish the left side-basic, cross the right leg behind, side step, and cross the right leg in front, to travel together with the follower. "
                        +"After that, identical footwork (side-basic but without stepping in/forward but sideways). "; br
                        +"The connected arm is once over the shoulder and in the other direction around the waist. "
                    }
                    youtube("6ooQMB8Rlz4?si=ImRNGXUvJzQPAVWH", "Lateral, to embrace, and simply back to basic")
                    p {
                        +"It is also possible to go directly from the basic (without the lateral) into the embrace."
                        +"Do so when the leader is stepped back, keep the follower on the spot (clear signal), and turn her."
                    }
                    p {
                        +"A ";b{+"smoother variation"};+" is done by the leader adding some side steps in the follower's direction. "
                        +"It will feel more fluent, instead of the on-the-spot embrace turn which gives a slight shock in the flow. "
                    }
                }
            }
        }
    }
}
