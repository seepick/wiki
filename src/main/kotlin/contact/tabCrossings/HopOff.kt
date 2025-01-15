package contact.tabCrossings

import common.olDefinition
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun ContactAnimalSections.hopOff(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Hop Off") {
            content {
                p { +"Learn how to get back on the ground to a side-by-side position, once you are on your little animal." }
                tableHopOff()
                olDefinition(
                    "Body Contact" to "Are you on your partner with your belly, or with your back?",
                    "Going Down" to "Are your arms, or your legs landing first on the ground?",
                    "Face Direction" to "Are both facing in the same, or the opposite direction at the end?",
                )
            }
            subSection("Belly and Legs") {
                content {
                    p { +"This is done basically the same way as we get onto our little animal but in the reversed order." }
                    p {
                        +"Be aware of the difference between learning/practicing and dancing/applying it. "
                        +"While we practice, we do it more statically and use (as done in this technique) our hands to push into the partner/floor. "
                        +"During a real dance, we would not use our hands, and instead push from our center/pelvis. "
                        +"This requires a lot of support (";i { +"oomph" };+") from our base; without it, it won't be possible."
                    }
                    p {
                        +"Also pay attention to the general rule of adapting technique according to partner differences. "
                        +"The height difference will dictate whether we push into the body (for shorter people) or into the ground (for taller people, reaching over the base)."
                    }
                    ol("prosa") {
                        li { +"First, put your ";b { +"hand(s)" };+" on the partner/ground to find stability." }
                        li { +"Reach with the ";b { +"outer foot" };+" onto the ground, approximately shoulder height." }
                        li { +"The ";b { +"inner foot" };+" touches down as close to the animal as possible." }
                        li { +"";b { +"Slide down" };+" on your partner, landing with the inner knee on the right position." }
                        li { +"Finally put your hands on the ground, and pull back the outer leg." }
                    }
                    p {
                        +"Two remarks for the base/little animal: "
                        +"One, in the moment when the flyer is going/sliding down, create some space for the pelvis; "
                        +"meaning: Move away, creating a diagonal ramp, instead of a vertical cliff. "; br
                        +"Two, once the flyer has landed on the ground, push back again, to help/support him getting upright/find balance."
                    }
                    youtube(
                        "xxx",
                        "Start crossing from your belly, with your legs first, facing in the same direction"
                    )
                }
            }
            subSection("Belly and Arms") {
                content {
                    ol("prosa") {
                        li { +"Reach down with inner, then outer hand onto the final position." }
                        li { +"Tilt to an inclined position with your head down (arm strength!), legs up." }
                        li {
                            +"Which leg goes down first will result in two different variations:"
                            ol("prosa") {
                                li { +"";b{+"Inner leg"};+" (fancy): Rotate away (chest facing away), with the back towards the partner, thus creating space for the leg."}
                                li { +"";b{+"Outer leg"};+" (easy): Place your outer leg on the ground, and then simply slide down in the final position."}
                            }
                        }
                    }
                    p { +"The same variation is also applicable during the classical hip-lift, and going down via a handstand."}
                    p { +"Here it is super important that ";b{+"the base"};+" moves away with the pelvis, thus creating space for the flyer." }
                    youtube(
                        "xxx",
                        "Start crossing, from your belly, with your arms first, facing in the same direction"
                    )
                }
            }
            subSection("Back and Legs") {
                content {
                    p { +"" }
                    ol("prosa") {
                        li { +"xxx." }
                    }
                    youtube(
                        "xxx",
                        "Start crossing, from your back, with your legs first, facing in the same direction"
                    )
                }
            }
            subSection("Back and Arms") {
                content {
                    p { +"" }
                    ol("prosa") {
                        li { +"xxx." }
                    }
                    youtube(
                        "xxx",
                        "Start crossing, from your back, with your arms first, facing in the same direction"
                    )
                }
            }
        }
    }
}
