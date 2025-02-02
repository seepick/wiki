package lindy.tabCharleston

import common.ref
import common.youtube
import kotlinx.html.*
import lindy.LindyRef
import tabs.SectionedTabDsl

fun LindyCharlestonSections.general(dsl: SectionedTabDsl) {
    with(dsl) {
        section("General") {
            html {
                p {
                    +"Lindy Charleston is embedded within Lindy Hop, its footwork, and has its own set of techniques, but is capable of being danced to way faster songs. "
                    +"It is a bit like a cardio workout, includes lots of core work, and thus, you are going to sweat a lot -don't forget to bring additional shirts. "
                    +"At the same time, you can also dance it very efficiently, by kicking and stepping smaller. "
                }
            }
            subSection("Steps") {
                html {
                    p {
                        +"Start with a simple groove, keeping the bounce while kicking. "
                        +"Don't focus too much on the kicking leg, but more on the standing leg. "
                        +"Kick under, and not to the front or the side, and when stepping, step really far back and forth, move/travel. "
                        +"Don't think of a conventional jump (up), but bounce more from the hips/butt. "
                        +"The knees are thus not flexing with the feet thrown forward, but more relaxed downwards."
                        +"The posture is characterized by relaxed knees, a pushed back butt, and the shoulders on top of the knees. "
                        +"It's like being ready to go, a very active posture like in badminton. "
                        +"The 8- and 6-count basic are the most common ones,  but you can also do 4- or 2- count, whatever... "
                    }
                    p {
                        +"Always keep your upper body ";b { +"bent forward" };+", hinge from your pelvis, and keep your chest still and straight upright. "
                        +"There is lots of core work there while dancing charleston. "
                        +"The ";b { +"connection" };+" is really important, not only to convey intention, but also to keep synchronized with the bounce and movement. "
                        +"The leader having his hand around the waist, the follower is pushing slightly with the arm down (there should be no gap in between). "; br
                        +"There are many ";b { +"styling" };+" possibilities, like throwing your arms, the direction of the kicks, rotation of the pelvis, and movements of the upper body. "
                        +"At least keep your arms moving as you do while walking, and don't keep the arm hanging like dead fish. "
                        +"Especially when you dance ";b { +"solo" };+", feel free to decorate and express even more (taking more space, throwing more). "
                        +"When dancing with a partner, watch out not to kick him, or other people when there is little space around you. "
                        +"Especially when you are doing a close-proximity techniques like the ";ref(LindyRef.Tandem);+" move. "
                    }
                    p {
                        +"Always begin by ";b { +"pulsing" };+" (instead of big bouncing) and syncing with your partner, getting sure whether you both are hearing the same music. "
                        +"As with Lindy Hop, the leader starts with ";b { +"left leg" };+", the follower with her right. "
                        +"Also, keeping the pulse throughout will make things much easier, as the body goes in some sort of \"autopilot\". "
                        +"Keep on hopping with every kick, every hold and every step. "
                    }
                    p {
                        +"Some advice on how to dance Charleston a bit more ";b { +"energy efficient" };+" way:"
                        ul {
                            li { +"Make smaller steps." }
                            li { +"Lean your upper body forward." }
                            li { +"Keep your feet on the ground while kicking." }
                            li { +"Only release from the knee, instead of a full-blown kick motion." }
                        }
                    }
                    youtube(
                        "YVa87hA7eq4?si=9Y8QZK9KGq2MbDgc",
                        "Charleston solo walk, solo basic step, partner basic step"
                    )
                    youtube("sZJRZadLxWI?si=1fXoBcBL-twKHP7o", "Bounce, Kicks, Steps")
                    subSubSection("8-Count Basic") {
                        content {
                            p {
                                +"We first have a look at the ";b { +"8-count" };+" basic; same as with Lindy, there also exists a 6-count basic. "
                                +"The ";b { +"pattern" };+" is as follows: "; br
                                +"Rock step (1+2) - kick step (3+4) - kick (5) - hold (6) - kick back (7) - step (8) "; br
                                +"The kick is not really a kick, but more a release/drop after bending the knee, and thus is rather relaxed. "
                                +"The kick is also really done on one leg kick, with a short midair moment of both feet, and then a step. "
                                +"It takes the dance more dynamic, using some more explosive energy, so don't get too lazy ;) "
                            }
                        }
                    }
                    subSubSection("6-Count Basic") {
                        content {
                            p {
                                +"Similar as with Lindy Hop, the 6-count basic step can be perceived as a bit faster due to the subsequent kick-steps. "
                                +"It is also mainly used when being in the Open Position, yet it is not mandatory to do so."
                            }
                            p {
                                +"The pattern of the 6-count is as follows: "; br
                                +"Rock step (1+2) - kick step (3+4) - kick step (5+6)"
                            }
                        }
                    }
                }
            }
            subSection("Positions") {
                html {
                    p {
                        +"Just as with Lindy Hop, we have an ";b { +"Open Position" };+" which could be considered the ";i { +"default" };+" position. "
                        +"We stand next to each other, the arms behind each other's back. "
                        +"Leader around the waist, and the follower (depending on height differences) on the closer shoulder blade. "
                        +"The leader always starts with the left leg, and the follower with the right. "
                        +"Resulting in the Open Position to always start with the outer leg (for both partners)."
                    }
                    p {
                        +"Next to it, we also have a ";b { +"Closed Position" };+" standing in front of each other. "
                    }
                }
                subSubSection("Open Position") {
                    content {
                        p {
                            +"It's basically just as the ";ref(LindyRef.LindyPositioning);+", open with 6-count. "
                        }
                        youtube("y0lQLrEL6KY?si=KhOZkVZ7erGgcnT7", "Charleston - Basic Open Position")
                        p {
                            +"Alternatively we can also stay both turning on the spot and pushing into each other's changing hand. "
                            +"It's basically constantly doing a ";ref(LindyRef.HandToHand);+" technique."
                        }
                    }
                }
            }
        }
        section("Moves") {
            subSection("Send-Out") {
                html {
                    p {
                        +"This is the most basic move, which is used to change between the Open and the Closed Position. "
                        +"As a follower, we open up the frame on the rock-step and give a clear but gentle indication. "
                        +"We do so by an 'open-close' movement, basically moving the right arm slightly back and the a bit stronger forward."
                    }
                    p {
                        +"To Send-In the partner again from the Open Position, we mainly do so by keeping the distance of the left elbow to the body. "
                        +"This leads to a shortening of the imaginary rubber band between the dancers, and creating a gentle pull from the center. "
                        +"Additionally to that, we also can open the right arm, giving a visually cue. "
                    }
                    p {
                        +"The difference in turning on the spot in Closed Position versus doing a Send-Out can be subtle. "
                        +"The turn is softer, and the whole body is turning, whereas the Send-Out is quicker and sharper; it moves more from the arm/shoulder. "
                        +"Also the frame stays more focused to the front in the Send-Out."
                    }
                    youtube(
                        "uLswm4vuciw?si=G_-V2Z11YRMcQ1Qz",
                        "Send-Out and Send-In, to transition between Open and Closed Position"
                    )
                }
            }
            subSection("Open Doors") {
                html {
                    p {
                        +"The basic footwork consists of: "; br
                        +"kick - hold/turn - kick - step."
                    }
                    p {
                        +"To enter the move, you need to simply turn on the hold-step (2nd kick to the front). "
                        +"After that, indicate clearly to the follower by creating a bit more distance, change your body posture. "
                        +"Most importantly, move the hand on the closer side of the body of the follower. "; br
                        +"The other version is entered by the leader staying in the same direction for one kick, doing a simple ";i { +"repeater" };+". "
                        +"From there only an arm/hand/wrist stretch while keeping the turns alive. "
                    }
                    p { +"Exit by simply getting closer to each other again. " }
                    youtube("7o6LakOj3XQ?si=Bg75o99s6cosvh9R", "Open Door footwork solo - Demonstration")
                    p { +"See also ";a("https://www.youtube.com/watch?v=U56HxbM36bw") { +"DancingSuite Berlin's Hand-to-Hand video" };+" for a quick online tutorial. " }
                    p {
                        +"A variation (or a little spice to add) would be to turn 540 degrees (one-and-a-half turn). "
                        +"Try to then find each other's hands again. "
                        +"See the second video below for a demonstration of how that could look like. "
                    }
                    youtube("fA6Adw0Ho7g?si=YdvBapNhkqx_68LO", "Open Door with repeater and a full 1.5 turn")
                    youtube("yPh-8hSB3aI?si=BQexZGA9SK-Vpxxr", "Open Doors")
                }
            }
            subSection("Hand-to-Hand") {
                html {
                    p {
                        +"As a leader, kick twice, while staying facing in same direction and let follower turn alone."
                        +"Continue to turn asynchronously and use the elastic stretch force to rotate together. "
                        +"Transition from and exit into open doors."
                    }
                    youtube("81_eJYh8J5Q?si=5dfQSkeg_jS8OFcx", "Hand-to-Hand")
                }
            }
            subSection("Skip-Ups") {
                html {
                    p {
                        +"For this, you have to be really close to your partner, as the connection is very important. "
                        +"We usually do it in the 6-count basics and using rotational force. "
                        +"Convention dictates, when exiting, that the leader kicks above with the big kick, raising in his posture. "
                    }
                    youtube("zCWUE-aGasg?si=_L4fSRSyUd6dAFWH", "Skip-Ups")
                }
            }
            subSection("Tandem") {
                html {
                    p { +"TODO" }
                }
            }
        }
    }
}
