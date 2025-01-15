package contact.tabCrossings

import common.olDefinition
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun ContactAnimalSections.hopOn(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Hop On") {
            content {
                p { +"Let's cover how to get from a side-by-side little animal position, to being on top of your partner. " }
                tableHopOn()
                olDefinition(
                    "First Crossing" to "Are your arms (head), or your legs going over first?",
                    "Body Contact" to "Are you on your partner with your belly, or with your back?",
                    "Face Direction" to "Are both facing in the same, or the opposite direction at the beginning?",
                )
            }
            subSection("Arms and Belly") {
                content {
                    p {
                        +"This is the first, and most simple way to get onto your little animal: "
                        +"By reaching over your partner, with arms and head first, and landing on your belly facing down."
                    }
                    ol("prosa") {
                        li {
                            +"Move your ";b { +"outer leg" };+" to the ";b { +"front" };+", whether diagonally or straight depends on the height:"
                            ul {
                                li { +"When climbing bigger animals, step diagonally, replacing the inner hand (closer by)." }
                                li {
                                    +"When climbing smaller animals, step straight, replacing the outer hand (further away). "
                                    +"This could also lead to slightly better angle and control of lifting. "
                                }
                            }
                            +"Experiment a bit yourself with this, replacing the hand which leads to the most stable position and allowing you a centered landing (proper distance). "; br
                            +"To make it easier, you can lift the palm off the ground a bit (she's doing it), or arch the back to create space for the moving leg (he's doing it)."
                        }
                        li { b { +"Tuck" };+" the toes of your ";b { +"inner leg" };+", and move the foot ";b { +"away" };+" (externally rotation)." }
                        li {
                            b { +"Lift and rotate" };+" your ";b { +"upper body" };+" towards your partner; maintain the connection/oomph. "
                            +"Push your knee off the ground to raise the level of your pelvis. Adjust the height depending on where you need to land centered."
                        }
                        li {
                            +"Put your ";b { +"hands" };+" on your partner's shoulder blade/pelvis for ";b { +"support" };+" if needed."
                        }
                        li { b { +"Pour" };+" (=gradually transfer) your weight to the belly contact." }
                    }
                    youtube(
                        "Y3HvsLQzmW4?si=v00sMdnjBcavLxuz",
                        "Start crossing in same direction, with arms first, landing on your belly"
                    )
                }
//                subSubSection("Facing opposite direction") {
//                    content {
//                        p { +"TODO" }
//                        ol("prosa") {
//                            li { +"xx" }
//                        }
//                    }
//                }
            }
            subSection("Arms and Back") {
                content {
                    p { +"Landing on your back can be scary at first; try to relax, and get accommodated by repetition." }
                    ol("prosa") {
                        li { +"The ";b { +"inner leg" };+" moves ";b { +"diagonally" };+", close to where the outer hand is." }
                        li {
                            b { +"Tuck" };+" the toes of the ";b { +"outer leg" };+"'s foot, and bring it closer by an inwards rotation, if necessary (when crossing a bigger animal)."
                        }
                        li { b { +"Rotate" };+" your body 90 degrees so you end up with your back towards your animal." }
                        li {
                            b { +"Lift" };+" up your whole body a bit, to afterwards find the proper center-point position."
                            ul {
                                li { +"If you need more support, push with your hands on the box of your animal." }
                                li { +"Don't sit on top of your animal (rude!), but push your butt against the sides (nice)." }
                            }
                        }
                        li {
                            b { +"Bend backwards" };+", arching your spine, arms reaching away, and relaxing your head, look back. "
                            +"Don't grab the sides of your animal but rather reach over head to safeguard yourself."
                        }
                    }
                    youtube(
                        "8e3j6nEnqLs?si=a6XSga7sg7Dl0QeT",
                        "Start crossing in same direction, with arms first, landing on your back"
                    )
                }
//                subSubSection("Facing opposite direction") {
//                    content {
//                        p { +"TODO" }
//                        ol("prosa") {
//                            li { +"xx" }
//                        }
//                    }
//                }
            }
            subSection("Legs and Belly") {
                content {
                    p {
                        +"Getting on your animal this way is a bit ";b { +"weird" };+" and covered only for the sake of completeness. "
                        +"There will be no natural flow, and almost impossible to maintain the rolling point of contact. "
                        +"Instead, what would be more natural, is, to use a spiral and land on the side. "
                    }

                    ol("prosa") {
                        li { +"Lift your ";b { +"pelvis up" };+", in some sort of down-dog position." }
                        li { +"Move the outer hand and the outer foot ";b { +"towards" };+" the ";b { +"inner knee" };+" of the partner." }
                        li { +"Reach the inner leg ";b { +"far over" };+" your partner and land on your center." }
                        li { +"Add the other leg joining the first." }
                    }
                    youtube(
                        "vECgoE31900?si=a0XtVN-9ffMi5YmX",
                        "Start crossing in same direction, with legs first, landing on your belly"
                    )
                }
//                subSubSection("Facing opposite direction") {
//                    content {
//                        p { +"TODO" }
//                        ol("prosa") {
//                            li { +"xx" }
//                        }
//                    }
//                }
            }
            subSection("Legs and Back") {
                content {
                    p {
                        +"For this move it is of benefit to have enough arm-strength to maintain in a handstand. "
                        +"Alternatively, you can drop yourself to also do a headstand. "
                        +"You need to be able to push yourself off the ground, using controlled strength instead of kicking (dangerous momentum)."
                    }
                    ol("prosa") {
                        li { +"Tuck your toes and ";b { +"lift" };+" your ";b { +"pelvis" };+" slightly, more into a bear position than down-dog." }
                        li {
                            +"Move your ";b { +"inner hand diagonally" };+" where your outer knee is, fingers towards partner."
                            ul {
                                li { +"Rotate the outer hand so the fingers are also pointing to the same direction." }
                            }
                        }
                        li {
                            +"Turn your head, rotating your ";b { +"body facing away" };+", so your back is towards your partner. "
                            ul {
                                li { +"Whether your head goes down, or butt up, depends on the height difference." }
                            }
                        }
                        li {
                            +"Lift the ";b { +"outer leg up" };+" in the air; the one further away."
                            ul {
                                li { +"Use a controlled swing with that leg to get over your partner." }
                                li { +"If the size differences and your strength allows, roll over instead of using momentum." }
                            }
                        }
                        li { +"Keep your ";b { +"hands as support" };+" on the ground until you find proper balance." }
                    }
                    youtube(
                        "YT_QD5eLaCI?si=ywIgff2SOc-C5iKP",
                        "Start crossing in same direction, with legs first, landing on your back"
                    )
                }
//                subSubSection("Facing opposite direction") {
//                    content {
//                        p { +"TODO" }
//                        ol("prosa") {
//                            li { +"xx" }
//                        }
//                    }
//                }
            }
        }
        /*
        // TODO content
        smoother/more advance variation of "Legs first, landing on side (not belly)" using proper spiral:
            1. full weight on outer hand and inner foot
            2. rotate into an "inverted position/little animal" (reverse table top)
            ... (inner/outer is now reversed...)
            3. touching with the now closer pelvis side
            4. spiral over with the further away/outer leg
            4.1 hand of same side going down first
            5. other side joining to final position
         */
        /*
        rolled variation of "Legs back, landing on back":
        as if would do an aikido roll over your partner;
        first head/hand-stand, when already 90 degrees to your partner (no need to be side-by-side)
         */
    }
}
