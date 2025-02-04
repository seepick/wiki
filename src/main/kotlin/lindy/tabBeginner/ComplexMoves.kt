package lindy.tabBeginner

import common.ref
import common.youtube
import kotlinx.html.*
import lindy.LindyRef
import tabs.SectionedTabDsl

fun LindyBeginnerSections.complexMoves(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Complex Moves") {
            subSection("Promenade") {
                // =====================================================================================================
                html {
                    p { +"The beginning is similar to a ";ref(LindyRef.SendOut);+" but with a slightly different foot-work, (a closer step), "
                        +"and can also be confused with a butterfly, but with less of a push, less distance and more connection. "
                        +"We will first cover the version where the follower goes first, as the leader can also go first, "
                        +"just like a send-out, where the leader walks backwards first and then pulls the follower back in. "
                    }
                    p { +"The wrapped leader's arm stays on the follower's back while changing position. "
                        +"The follower's arm moves from the back onto the upper arm with a kind of a \"dragon mouth open hand\", "
                        +"thus creating a "; i {+"shared frame"}; +" (a construct across two bodies), "
                        +"to maintain the distance and push lead a bit so not to collide. "
                        +"With the second rock-step, both continue walking in the same direction (of the follower, which walks backwards), "
                        +"and with the triple-step the leader quickly jumps next to the follower's side." }
                }
                subSubSection("Promenot") {
                    html {
                        p { +"The shortened variation, in our school named promenot, as of: not doing the promenade. "
                            +"It is pulled back after the first rock-step forward in the open position. "
                            +"It's interrupted by this pull back with the typical stretch-sensation. " }
                        youtube("nCHwcuJM7BI?si=bYEF_WKpWvION-uo", "Promenot, Promenade follower and Promenade leader")
                    }
                }
            }

            subSection("Tuck Turn") {
                // =====================================================================================================
                html {
                    p { +"Done in the 6-count basic, starting similar to a regular follower send-out, and with a ballroom hand position. "
                        +"The first (rotational) rock-step is stepped slightly diagonally back, not straight back as it would create too much of a rotational-stretch and disconnection of the lower and upper body. "
                        +"But also don't step anywhere forward, as it could potentially misinterpreted by follower for a swing out. "
                        +"The leader turns towards the follower, pushing the follower turning away (CW) creating a stretch. "
                        +"For that, separate the lower and upper body: The upper body rotates while the pelvis stays facing forward, creating suspension which can be released to turn. "
                        +"Then pulling her back inwards again (CCW) which happens less from the back arm, maybe a bit, but mostly through the (firm) LEGO-shaped hand connection. "
                        +"Finally, stopping her with a hand-compression on the first triple-step (lots of time there). "; br
                        +"On the 2nd triple-step (less time here), let her walk under your lifted arm, creating a window. ";
                        +"This is done by turning her to the other direction and giving a slight push with the right hand on the left side of the back. " }
                    p { +"You will either have to change the hand-positions, which is only possible if there is no tight grip between the hands, enable a rolling point of contact. "
                        +"Turn the hand, resulting in the common hand-position during the open-position. "
                        +"Alternatively, do another turn immediately to \"fix\" it, either change places or do a send-in back to the closed-position. " }
                    p { +"Yet another possibility is to right away switch into crossed hands; leader switches from the left to the right hand. "
                        +"While doing so, you can go into a Franky 6 move. " }
                    youtube("hszKBxAJx9Q?si=3R_8xduw7mvhNaRT-uo", "Demonstrations of variation tuck turns and send-in with a turn")
                }
                subSubSection("8-count basic variation") {
                    html {
                        p {
                            +"The tuck turn can also be done in the 8-count basic step, which requires the follower to turn two times (or any times necessary to get back into the pattern). "
                            +"As long as the arm stays up, the follower will keep on spinning; thus, don't lower it! "
                            +"Also don't \"stir\" with your hand, pushing your follower, simply keep it up, and maybe follow with your hand a bit the movement. "
                            +"Once the follower is almost at the correct position (facing right), lower your hand and catch the next rock-step again. "
                        }
                        youtube("JAd3pb3A-Tk?si=0n04R1A3BTaYbPvO-uo", "Tuck Turn in 8-count basic step")
                    }
                }
            }

            subSection("Franky 6") {
                // =====================================================================================================
                html {
                    p { +"Starting from crossed-hand open-position, using 6-count basic. "
                        +"Instead of the leader's regular linear rock-step, do a rotational rock-step, pushing the right shoulder forward making the follower turn. "
                        +"Now pull the right arm up, let the follower go underneath it, yet the leader moves most of the distance. "
                        +"Ending with the leader back towards the follower's front. "
                        +"The leader has his right arm on this back, offering his left (palm facing forward) to the follower to hold. " }
                    p { +"From this position, there are three steps:"
                        ol {
                            li {+"Rotate inwards with a rotational rock-step, and push with the left elbow into the follower."}
                            li {+"Rotate outwards again, similar to butterfly."}
                            li {+"Rotate inwards again, release the right and put it on the follower's left shoulder blade."}
                        }
                    }
                    p { +"Rotate towards the follower, both CW, pull the other direction and let go of the hand. "
                        +"To finish this move, catch the followers hand ending up in an open position again. " }
                    youtube("d1KVpeOJHEM?si=VgtoAHViBbB1DOGx-uo", "From Tuck Turn into Franky 6 and back again")
                }
            }
        }
    }
}
