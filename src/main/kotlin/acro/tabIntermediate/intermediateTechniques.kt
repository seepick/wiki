package acro.tabIntermediate

import acro.AcroRef.*
import common.ref
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun AcroIntermediateSections.intermediateTechniques(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Intermediate Techniques") {
            subSection("Floating Paschi") {
                html {
                    p {
                        +"From a ";ref(StraddleBat);+", the flyer grabs her ankles and extends all limbs (pike). "
                        +"The base grabs slightly distal from the deltoids, and letting go of the legs. "; br
                        +"";b { +"Landing" };+" can be either forward into stand, or backwards onto your shins. "
                    }
                    youtube("_TNw1XADdVY", "Super Dave Cartwheeling into Straddle Bat")
                }
            }
            subSection("Side Star") {
                html {
                    p {
                        +"The side star can be differentiated between inner (flyer's body inside the base's legs, inner leg) or outer (body is outside; outer/further away leg is supporting), "
                        +"and between regular (facing cranial) or reverse (facing away/caudal). "; br
                    }
                    p {
                        +"The ";b{+"easier entrance"};+" might be starting from the side, or via a transition from airplane. "
                        +"Once entered from the side, it can be one legged (both hands connected), or two-legged (inner hand connected, flyers outer hand on base's outer leg). "; br
                        +"One step further is by removing the base's outer leg (from the arm pit) and connect his hand onto her foot, "
                        +"ultimately ending up in a full star positions, all four limbs spread away. "; br
                        +"If done quicker and rolling over the base, it's basically a ";b { +"Cartwheel" };+". "
                    }
                    p {
                        +"Alternatively, you can enter from a hands-free ";ref(Bird);+". "
                        +"The flyer grabs one of the base's ankles and slides down the grip on the shin, close to the knee. "
                        +"From there, without any hand-connection, go directly into a Side Star, and right to the other side. "
                        +"As with many techniques, timing, positioning, and lowering the new platform is crucial to succeed. "
                    }
                    p {
                        +"A typical ";b { +"beginner's mistake" };+" is that the flyer is not lifting the outer leg enough, or not pouring enough weight into the base. "
                        +"Once the flyer is on top, get sure the back is round and not hollow (over-arching), and the hips and shoulders are properly stacked. "
                    }
                }
                subSubSection("Inside Side Star - Sideways Entrance") {
                    html {
                        p {
                            +"The flyer basically balances on one of the base's leg while being in yoga's \"half moon pose\". "; br
                            +"";b { +"Lifting" };+": The flyer stands next to the base's pelvis, looking cranial. "
                            +"The hands, which are on the closer side, connect (peace finger), and the other two come a bit later, not yet connected! "
                            +"The flyer hinges to the side, lifting the outer leg (do NOT do a lateral flexion in your upper body!), creating a trough at the pelvis. "
                            +"This enables the base to have a proper structure to put the foot, and it doesn't slide above the pelvis, or even to the ribs. "
                            +"The flyer's inner leg stays as much as possible on the ground; remembering to \"kick his ass\" (close to the base's butt). "
                        }
                        p {
                            +"Once the flyer is up, try to keep the body horizontal / parallel to the ground, and facing to the front, not to the floor. "
                            +"If you manage to get until here, you can go ";b { +"one step further" };+" and let go of the hands, on the the base's inner leg, the other reaching up. "
                        }
                        youtube("_erVFJvQi8g", "Acro Adventure explains Inside Side Star with some variations")
                        p {
                            +"Instead of using one leg, you can also ";b { +"use two legs" };+" which might make the pose easier. "
                            +"Also visible down below in the \'Bird to Side Star\' video. "
                        }
                        youtube("1MDtl429xEE", "Ninja Star continuation (a.k.a. washing machine) without explanation")
                    }
                }
                subSubSection("Bird to Side Star") {
                    html {
                        p {
                            +"From bird release one leg, touch only with the heel, toes facing outwards to later provide surface for the hip region. "
                            +"Bend the leg, and let the flyer roll into it -do it swiftly! "
                            +"Rotate that the toes face cranial, thus the flyer will be perpendicular (easier to balance). "
                            +"Flyer's one arm on the leg, the other arm can let go (or both arms, to be in a full star position). "; br
                            +"For a more advanced execution, try not to use any hand support of the base. "
                        }
                        youtube("d_lto3XbRgY", "Super Dave explains getting from Airplane to Side Star")
                        youtube("tG6U0sI2d8s", "A bit of a flow demo without explanation")
                    }
                }
            }
            subSection("Rotisserie") {
                html {
                    p {
                        +"It's an extremely useful transition to change direction during Washing Machine/Ninja Star, and in general to connect certain positions. "; br
                        +"Start from Bird with the target position in mind of a reverse Side Star. "
                        +"Move the weight to one side, to free the other and reposition (a bit lateral), and move weight back again. "
                        +"Rotate that foot and lower it, so that the flyer can roll onto that platform. "
                        +"One pair of hands are connected L/R-diagonally and stay connected, they are only changing the grip by rotating. "
                        +"The base walks around the flyer, thus the flyer is continuously rolling. "
                        +"Stepping on the sides (hip area) and near the sacrum (not on the lower back!), skipping the front area."
                    }
                    youtube("OWJO7WevE", "Jacob Brown quickly demonstrating the Rotisserie")
                }
            }
        }

    }
}
