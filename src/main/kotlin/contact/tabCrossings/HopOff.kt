package contact.tabCrossings

import common.olDefinition
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun ContactAnimalSections.hopOff(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Hop Off") {
            html {
                p { +"Learn how to get back on the ground to a side-by-side position, once you are on your little animal." }
                tableHopOff()
                olDefinition(
                    "Body Contact" to "Are you on your partner with your belly, or with your back?",
                    "Going Down" to "Are your arms, or your legs landing first on the ground?",
                    "Face Direction" to "Are both facing in the same, or the opposite direction at the end?",
                )
            }
            subSection("Belly and Legs") {
                html {
                    p { +"This is done basically the same way as we get onto our little animal but in the reversed order." }
                    ol("prosa") {
                        li { +"First, put your ";b { +"hand(s)" };+" on the partner/ground to find stability." }
                        li { +"Reach with the ";b { +"outer foot" };+" onto the ground, approximately shoulder height." }
                        li { +"The ";b { +"inner foot" };+" touches down as close to the animal as possible." }
                        li { +"";b { +"Slide down" };+" on your partner, landing with the inner knee on the right position." }
                        li { +"Finally put your ";b{+"hands on the ground"};+", and pull back the outer leg." }
                    }
                    p {
                        +"Two remarks for the little animal: "
                        +"One, in the moment when the flyer is going/sliding down, create some space for the pelvis; "
                        +"meaning: Move away, creating a diagonal ramp, instead of a vertical cliff. "; br
                        +"Two, once the flyer has landed on the ground, push back again, to help/support him getting upright/find balance."
                    }
                    youtube(
                        "YprkGISRVOE?si=fe3dNWjtgI-d0j1k",
                        "Start crossing from your belly, with your legs first, facing in the same direction"
                    )
                }
            }
            subSection("Belly and Arms") {
                html {
                    ol("prosa") {
                        li { +"Reach down with inner, then outer ";b{+"hand"};+" onto the final position." }
                        li { +"Tilt to an inclined position with your ";b{+"head down"};+" (arm strength!), legs up." }
                        li {
                            +"Which ";b{+"leg goes down"};+" first will result in two different variations:"
                            ol("prosa") {
                                li { +"";b{+"Inner leg"};+" (fancy): Rotate away (back towards partner), thus creating space for the leg."}
                                li { +"";b{+"Outer leg"};+" (easy): Outer leg on the ground, and simply slide it down in the final position."}
                            }
                        }
                        li { +"If necessary, ";b{+"readjust"};+" the hands (and legs) to find their proper final position."}
                    }
                    p { +"The same variation is also applicable during the classical hip-lift, and going down via a handstand."}
                    p { +"Here it is very important that ";b{+"the base"};+" creates space for the flyer by moving away the pelvis." }
                    youtube(
                        "he4ys-zlxf0?si=CF1Cs0yjGlUkjF6m",
                        "Start crossing, from your belly, with your arms first, facing in the same direction"
                    )
                }
            }
            subSection("Back and Legs") {
                html {
                    ol("prosa") {
                        li { +"";b{+"Shift your weight"};+" by lowering the legs, doing a sit-up and/or reaching with the arms." }
                        li { +"Land the ";b{+"outer foot"};+" on the ground, roughly where the knee's final position will be."
                            ul("prosa") {
                                li { +"For ";b{+"big flyers"};+": You might reach the floor with the inner foot directly onto the ground." }
                                li { +"For ";b{+"small flyers"};+": Keep your inner foot in the air and reach with your knee first down." }
                            }
                        }
                        li { +"The ";b{+"inner hand"};+" finds its final position on the ground right away, then the outer." }
                        li { +"Depending on big/small flyers: ";b{+"adjust the inner leg"};+"; knee replacing the foot." }
                        li { +"Also ";b{+"adjust the outer leg"};+" finding its final position." }
                    }
                    p {
                        +"";b{+"Variation"};+": It is more elegant, yet harder, to land the outer foot directly on its final position. "
                        +"For this, the base needs to give much support, especially when sliding the inner knee through immediately. "
                    }
                    youtube(
                        "SIhfoVAy4DY?si=wY4OkphM-H8z2IJk",
                        "Start crossing, from your back, with your legs first, facing in the same direction"
                    )
                }
            }
            subSection("Back and Arms") {
                html {
                    ol("prosa") {
                        li { +"";b{+"Rotate"};+" your body so that you are looking towards the animal's feet." }
                        li { +"The ";b{+"inner forearm"};+" and the outer hand reaching first onto the ground." }
                        li { +"Going down with your legs requires lots of ";b{+"oomph"};+" from your animal at the pelvis." }
                        li { +"Reach with your ";b{+"inner foot"};+" down; slowly, softly, with control." }
                        li { +"";b{+"Readjust"};+" to the final position: Replace inner hand and outer foot on the ground." }
                    }
                    youtube(
                        "dsWwxsdxbjE?si=c_qMIucEAOQHaWcN",
                        "Start crossing, from your back, with your arms first, facing in the same direction"
                    )
                }
            }
        }
    }
}
