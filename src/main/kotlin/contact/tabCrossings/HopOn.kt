package contact.tabCrossings

import common.olDefinition
import common.youtube
import contact.ContactAnimalSections
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
            subSection("Arms and belly") {
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
                subSubSection("Facing opposite direction") {
                    content {
                        p { +"TODO" }
                        ol("prosa") {
                            li { +"TODO" }
                        }
                    }
                }
            }
            subSection("Arms and back") {
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
                subSubSection("Facing opposite direction") {
                    content {
                        p { +"TODO" }
                        ol("prosa") {
                            li { +"TODO" }
                        }
                    }
                }
            }
            subSection("Legs and belly") {
                content {
                    p { +"TODO" }
                    ol("prosa") {
                        li { +"TODO" }
                        /*
this is not a natural/flowy way; don't do it in practice; but for sake of completeness, still here
    difficult/impossible to maintain rolling point of contact (without sliding)
    it would be more natural to use a spiral, and then land on the side (instead of belly)
first, pelvis up (downdog)
outer hand and outer foot towards inner knee of partner
reach inner leg far over partner
take outer leg next to it

smoother/more advance variation (using proper spiral):
    full weight on outer hand and inner foot
    rotate into an "inverted position/little animal" (reverse table top)
    (inner/outer is now reversed...)
    touching with the now closer pelvis
    spiral over with the further away/outer leg
        hand of same side going down first
    other side joining to final position
                         */
                    }
                }
                subSubSection("Facing opposite direction") {
                    content {
                        p { +"TODO" }
                        ol("prosa") {
                            li { +"TODO" }
                        }
                    }
                }
            }
            subSection("Legs and back") {
                content {
                    p { +"TODO" }
                    ol("prosa") {
                        li { +"TODO" }
                        /*
tuck your toes
lift pelvis up (bear position)
move inner hand diagonally where outer knee is
    fingers pointing towards the partner
    rotate outer hand also fingers towards partner
turn your head, rotate body facing away (back towards partner)
    whether head goes down (butt up) depends on height difference
lift outer (the one further away) leg up
    controlled swing with that leg over your partner
    if size & strength allows, no moment necessary (more a roll)
keep arms longer contact on ground for support, until find balance
    being able to do a handstand; push yourself (strength VS kick/momentum)
// variation: also "rolled version" possible, as if would do an aikido roll over your partner
                         */
                    }
                }
                subSubSection("Facing opposite direction") {
                    content {
                        p { +"TODO" }
                        ol("prosa") {
                            li { +"TODO" }
                        }
                    }
                }
            }
        }
    }
}
