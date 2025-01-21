package lindy.tabBeginner

import common.image
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun LindyBeginnerSections.steps(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Steps") {
            content {
                p {
                    +"We usually step something we call \"quick\" (one beat) or \"slow\" (two beats). "
                    +"The quick-steps come in pairs, also called \"";i { +"rock-steps" };+"\". "
                    +"The stepping pattern comes in two (common) flavors: 6-count and 8-count. "
                }
                p {
                    +"Keep a ";b { +"bounce" };+" and bend the (soft) knees, relax your arms, breathe, and look forward (not down). "
                    +"For the slow-step (without triples) we do two bounces (connect to the music). "; br
                    +"Slightly ";b { +"lean forward" };+" with your upper body, and also keep most of the weight on the front part of the foot. "
                    +"The heels hover a tiny bit over the ground, using the achilles tendon to bounce. "; br
                    +"To play around a bit with the basic footwork, ";b { +"turn" };+" your direction while doing the basic step. "; br
                    +"Do small steps so we can stay vertically with our bounce, as otherwise it gets flattened out. "
                    +"Also for obvious reasons like balance, keeping the legs underneath our center, and staying upright. "
                }
                p {
                    +"Dance is done from the center, the core, the pelvis area, and not from the legs or arms. "
                    +"When doing the rock-step, initiate it by your center, really shifting your weight and moving the whole body as a unit. "
                    +"Don't just move your legs and keep the rest of the body in the same position. "
                }
                p {
                    +"When in closed position, we always start with outer leg. "
                    +"When in open position, the leg starts where the hands are holding. "
                    +"Put differently: \"";i { +"Leader always starts left, because follower is always right" };+"\"."
                }
                p {
                    +"Technically, we can differentiate between a linear and a ";b { +"rotational rock-step" };+" (not \"circular\"). "
                    +"The first is the default, whereas the second is used for rotating, to send out the follower, to give her a bit of a spin. "
                }
                p {
                    +"Tip on how to ";b { +"indicate starting" };+": "
                    +"Of course, keep the bounce, and additionally to that shift the weight medial, so the follower's outer leg is free. "
                    +"Take a deep breath in, lift your center up, and once you want to go, breathe out and lower in a U-shape backwards to make it crystal clear. "; br
                    +"Or when starting in open position, first go down a bit, like in a U-shape, then go back and push arm forward. "
                }
                p {
                    +"With the basic steps there is surprisingly much to do already. "
                    +"For it to work, it requires a very good connection between the partners to properly communicate the changes. "
                    +"The combination of repeaters and walks (single steps/groove-walk, or triples), 6/8-count and closed/open-position alone can be combined in complex patterns. "
                }
                image("images/basic_footwork.png", "Basic footwork", 800 to 240)
                p {
                    b { +"Exercise" }; +": Stand in front of each other without any touch, and try to synchronize each other's movement. "
                    +"Use visual cues only, reading the body language and emphasizing shift weight and leaning. "
                    +"Introduce some breaks and repeaters, maybe even switch count steps or triples and grooves and enjoy the ride. "
                }
                youtube(
                    "P7XHMXuTMU0?g88HJsopKCQ?si=-5A6zx8AEWVaRXE_",
                    "Walk while connecting with the music and the partner"
                )
            }
            subSection("Triple") {
                // =====================================================================================================
                content {
                    p {
                        +"The ";b { +"triple-step" };+" is done in a \"W-shape\" not M. "
                        +"This means to go down into the ground, not upwards. "
                        +"This is done actually with all our steps, as they keep a bounce into the ground. "
                        +"Try to keep standing on the spot (or deliberately \"travel\"), letting the grove go vertical downwards, and don't move sideways. "
                    }
                    p {
                        +"The triple is done on a so-called \"";i { +"syncopated rhythm" };+"\". "
                        +"Syncopation is a deliberate disturbance/interruption of the regular flow of the music. "
                        +"To put it simply: Three steps done within two beats, whereas the second step in the middle is a bit delayed and closer to the third. "
                        +"The two beats indeed also have two bounces. "; br
                        +"Because it squeezes multiple steps into a short timeframe, the triple-step can only be done on slower songs. "
                        +"For faster ones we need to use the groove-walk again (or switch to Charleston). "
                    }
                    youtube(
                        "mtMz_LzYpOg?si=nFrTOQrxWnPsx7sG",
                        "8-count groove-walk (lead from body and bounce), into 8-count triple"
                    )
                }
            }
            subSection("8-Count") {
                // =====================================================================================================
                content {
                    p {
                        +"The stepping pattern for the 8-count basic is: "; br
                        +"quick (1) - quick (2) - slow (3+4), quick (5) - quick (6) - slow (7+8) "
                    }
                    p {
                        +"Or put more simply: "; br
                        +"2x (rock-step + triple) "
                    }
                    youtube(
                        "P7XHMXuTMU0?si=MECP-NnTVMyHdjZn",
                        "8-count demonstration: basics in closed position, butterfly, mess around"
                    )
                }
            }
            subSection("6-Count") {
                // =====================================================================================================
                content {
                    p {
                        +"The open position is \"usually\" done in the 6-count basic, as 8-count would be too difficult to communicate. "
                        +"In the closed position though, you can choose the pattern. "
                        +"The Stepping pattern is: "; br
                        +"quick (1) - quick (2) - slow (3+4) - slow (5+6). "; br
                        +"Or: Rock-step + 2x(Triple) "
                    }
                    youtube(
                        "7e2SjRIfD4U?si=R4WWwPD0DGrYyjdX",
                        "6-count demonstration: groove-walk, triple; send-out, basics, mess around"
                    )
                    youtube(
                        "zhEp7DGkOUY?si=fv_z0Ix3bYL52EBe",
                        "Some 6-count beginner's techniques demonstration from SwingAlong"
                    )
                    p { b { +"Mixing them" };+": When in closed position, you can do an 8-count, then switch to an open position and do an 6-count. " }
                }
            }
            subSection("Other") {
                // =====================================================================================================
                subSubSection("Groovewalk") {
                    content {
                        p {
                            +"Groovewalk is a slow-step which is a simplified version of the triple-step by only single-stepping instead of \"trippling\". "
                            +"It is important to only slow down, keeping a continuous movement, instead of stopping the motion fully coming to still."
                        }
                    }
                }
                subSubSection("Repeater") {
                    content {
                        p {
                            +"Simply repeating the same stepping parts on the (semi) spot. "
                            +"For this, it is crucial to have a good, strong connection with your partner: "
                            +"Follower's elbow pushed inwards, leader's embrace harm tight. "
                            +"Don't be shy to give a clear push/pull. "
                        }
                        p {
                            +"There are different possibilities available: "
                            ul {
                                li { +"While being at the ";b { +"back/rock-step" };+" (open position), instead of a slow-step, stay on the spot and hover the leg in front." }
                                li {
                                    +"While being at the ";b { +"front/5-6" };+" (open position), repeat the quick-quick-steps. "
                                    +"The outer leg stays on the spot still is lifted a bit when the weight is shifted off; and the inner leg constantly moves back and forth (no slow-step). "
                                    +"To stop the repeater, make the back-step quick-step into a slow-step. "
                                    +"The repeater-quick-step keeps the weight more to the front, and the follower is being given a slight impulse forward (\"stop\"). "
                                    +"When stopping, the whole body is moved backwards, and an impulse to move backwards is given (\"go\"). "
                                }
                                li {
                                    +"While being in the ";b { +"closed position" };+", we do a similar step pattern as with being in the front open position. "
                                    +"Be clear as a leader to \"zap\" at the edges with your arms, and to rotate the partner back in to go back to the open position. "
                                    +"Here either ";b { +"leader or follower" };+" in front will change how steps and who stays."
                                }
                                li { +"There are also ";b { +"oppositions" };+" where we go counter back-and-forth, yet with the same quality of repeaters. " }
                            }
                        }
                        youtube("dSQP9s7YC-0?si=WoCOyAfpp3sDdBeH", "Improve your partner connection with repeaters")
                    }
                }
                subSubSection("Break") {
                    content {
                        p {
                            +"When the music is not playing (it has a break), we can stand still on the spot. "
                            +"We do so at the back-most position: stay on the back-leg, the second doing a quick-step. "
                            +"Indicate the break by staying upright with the upper body instead of leaning forward. "
                        }
                    }
                }
                subSubSection("Jockeys") {
                    content {
                        p {
                            +"Just grooving around in some walks, bounce every single, and step every second beat for example. "
                            +"Do some basic steps, some simple repeaters (front or back) and breaks. "
                            +"Switching between 6- and 8-count basic, and also switching triples and grove-walks. "
                            +"Just don't do any fancy technical moves to be a good jockey. "
                        }
                        p {
                            +"It is used to find/connect to the song and each other, at the beginning of a dance. "
                            +"Especially when dancing with a new and unknown partner. "
                            +"It can also be useful as a recovery strategy; a way to (re)start. "
                        }
                    }
                }
            }
        }
    }
}
