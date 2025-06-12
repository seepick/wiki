package zouk.tabBeginner

import common.image
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
            subSection("Overview") {
                // =====================================================================================================
                html {
                    image("images/steps.jpg", 800 to 259, "Zouk Footwork Overview")
                    p {
                        +"The diagram above 👆🏻 shows the three most basic footwork in Zouk. "
                        +"All three of them adhere the boom-chick-chick (long-short-short) pattern. "
                        +"They are also placed on the same spots, distance wise, and thus are all compatible to each other. "; br
                        +"The top and bottom row, surrounded by the ";b{+"grey line"};+", is the area in which the feet are being placed. "
                        +"Both areas have two spots, indicated with a bigger and a smaller circle. "
                        +"The top row is whenever you are positioned more to the front, or left respectively for the side-basic and lateral steps. "
                        +"Analogous is the bottom row for the back/right position. ";br
                    }
                }
                subSubSection("Basic") {
                    html {
                        p {
                            +"Initial position with both feet next to each other, hip width apart. "
                            +"Stepping backward (1) for the leader with the left; the follower steps with the right forward, mirroring the footwork. "
                            +"This is the looong step on the boom, then the right foot follows (2) with a short step, finished with the left foot being lifted (3). "; br
                            +"The right foot steps forward long on the boom (4), left short step close by (5) and right lifts again (6); and repeat. "
                        }
                    }
                }
                subSubSection("Side-Basic") {
                    html {
                        p {
                            +"Assuming a basic position, feet hip width apart, left slightly in front of the right, and on the back position. "
                            +"Step far with the left (long, boom; and also move out of the line of your follower), rotating 90 degrees clockwise (1). "
                            +"Put the right next to it with a short step (2) and lift the left on the spot (3). "; br
                            +"From there, the inner leg (in this case the right leg) steps outside of the outer position (4). "
                            +"The outer leg follows either next to the other leg (5) or stepping a bit forward (5b) into the line of the follower. "
                            +"Finishing with the outer leg lifting a bit (6). "
                        }
                    }
                }
                subSubSection("Lateral") {
                    html {
                        p {
                            +"From the basic position, step long with the left foot and rotate it counter-clockwise towards your partner (1). "
                            +"Bring the other leg in, next to the left one, and rotate it a quarter-turn facing your partner (2). "
                            +"While you are lifting your left foot, also rotate it further counter-clockwise by a half-turn (3). "; br
                            +"Stepping to the other side is a matter of crossing your right leg over the left (4) both toes pointing outwards in a V-shape. "
                            +"Step the inner leg on the outer position (5), and rotate your other foot again by half a turn (6). "
                        }
                    }
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
                        +"We call it embrace when both hands are held and alternating around the shoulder or the waist. "
                        +"The footwork stays lateral for the follower, and side basic (side-step, not forward) for the leader. "
                        +"It is sometimes confused with the hugging (embracing) the partner in the basic step. "
                    }
                    p {
                        +"You can enter embrace from lateral, keep holding both hands, and start when the follower is facing left. "
                        +"Always create enough space to allow for doing a ";b{+"travelling-turn"};+", doing her tuum-step going left, and turn on the chicks. "
                        +"The following tuum is again a step to the left for her, allowing a smooth, continued movement. "; br
                        +"The result of doing a travelling-turn (instead staying on-the-spot which breaks the flow) is a leader's consecutively side-step. "
                        +"It is more difficult, but also much smoother, fluent for the follower. "
                        +"Finish the left side-basic, cross the right leg behind, side step, and cross the right leg in front, to travel together with the follower. "
                    }
                    youtube("6ooQMB8Rlz4?si=ImRNGXUvJzQPAVWH", "Lateral, to embrace, and simply back to basic")
                    p {
                        +"It is also possible to go directly from the basic (without the lateral) into the embrace."
                        +"Do so when the leader is stepped back, keep the follower on the spot (clear signal), and do a ";b{+"simple turn"};+". "
                        +"Basically every simple turn can transition into embrace by simply keep holding both hands. "
                        +"This will result in the line being rotated 90 degrees."
                    }
                    p {
                        +"To summarize, there are three ways to ";b{+"enter embrace"};+":"
                    }
                    ol {
                        li { +"Lateral on the spot (simple, but interrupting)" }
                        li { +"Lateral travelling turn (more advanced leader footwork, but more fluent)" }
                        li { +"From simple turn/lunge (smooth and easy, 90 degrees turn)" }
                    }
                }
            }
        }
    }
}
