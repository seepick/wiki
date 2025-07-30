package acro.tabBeginner

import acro.AcroRef.*
import common.ref
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun AcroBeginnerSections.inversions(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Inversions") {
            html {
                p {
                    +"Basically a fancy way to say upside down. "; br
                    +"For those it is recommended, for safety reasons, to ";b { +"always have a spotter" };+" (your guardian angel) with you. "
                    +"Not only to ensure everyone's safety, but also to possibly help a lot in case the pose is difficult to reach (as usual). "; br
                    +"You can pike or split up your legs, with before bent legs; you can hop (impact, dangerous!) or better go up (slowly) with control. "
                }
            }
            subSection("Wombstand") {
                html {
                    p {
                        +"The name is unknown and is made up for now."; br
                        +"The base is in a high ";b{+"glute bridge"};+", and the flyer in a ";b{+"shoulder stance"};+", "
                        +"putting her head between the (upper) legs, hands on the shins, pushing the legs together slightly. "
                        +"The head is close to the knee and not too far proximal. "
                        +"The base stays completely passive throughout the movement. "
                        +"For easier entrance, the flyer can put one foot after the other on the base's knees/legs, and then slowly rise up; kneeling, stretching, splitting. "
                    }
                }
            }
            subSection("Beach") {
                html {
                    p {
                        +"The base is in a table top position, forming a stable platform for the flyer throughout. "
                        +"The arm position of the flyer can vary, you can go for one around the belly, the other at the upper part of the closer upper arm. "
                    }
                    youtube("WAUjkB4vAkE", "London Acro Ladies explaining the Beach Pose")
                }
            }
            subSection("Candlestick") {
                html {
                    p {
                        +"The easiest inversion there is, but still please use a spotter for safety reasons. "
                        +"The flyer is stepping next to the pelvis of the base, facing forward, hands on his upper legs. "
                        +"The base is offering his palms (all five fingers one direction over the shoulder, thumb not stretched away to prevent choking), "
                        +"and the flyer is putting her (the soft part of the) shoulder into it. "
                        +"The fingers touching the shoulder blade, and the \"heel of the palms\" on the trapezius. "; br
                        +"To get up, you can either jump, or more easily, climb one by one on the knees like a little monkey. "
                        +"Flyer is lifting the hips up (creating a vertical, rather an horizontal force), in one line with the shoulders. "
                        +"The base's arms are diagonal, never perpendicular to the ground. "; br
                        +"There is no need to jump from once you are in this preliminary position, instead simply pull your legs to your chest into the ";b { +"tuck position" };+". "
                        +"You can extend the legs sideways into a ";b { +"stradle pipe" };+" or upwards (which has a much higher center of gravity) into a regular ";b { +"stradle" };+" (legs up and open) or a ";b { +"straight" };+" (legs up and closed). "
                        +"The flyer's gaze is focused on the belly button to maintain a proper posture and orientation during upside down. "
                    }
                    p {
                        +"To go down, either step slowly and controlled again on the knees of the base, or simply extend the legs sideways and land on the ground directly. "
                        +"Also learn what could happen (if you would be without a spotter) if the flyer falls over, doing a roll, still with the base's hands on her shoulders, to not fall on him. "

                    }
                    youtube("anguDNE8amE", "Acro Connection demonstrating how to do the Candlestick")
                }
            }
            subSection("Star") {
                html {
                    p {
                        +"Good to first practice a tripod headstand by yourself as a flyer. "; br
                        +"Flyer stands next to the head facing downwards, grabbing with peace fingers, full contact with the whole palms. "
                        +"Base extending the legs, close to the head, toes on the clavicula, bending the knees. "
                        +"Flyer keeps the elbows bent and using the hands to push into in order to avoid going too far to the back. "; br
                        +"From here, you can easily ";b{+"step down"};+" and transition into a ";ref(StraddleBat);+". "
                    }
                    p {
                        +"The spotter could help with going up, so no jump is required, but ultimately is (as always) on at back side of the follower. "
                    }
                    youtube("6HngmitsKuQ", "Super Dave presenting the Star pose")
                }
            }
        }

    }
}
