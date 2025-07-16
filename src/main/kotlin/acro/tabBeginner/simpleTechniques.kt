package acro.tabBeginner

import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun AcroBeginnerSections.simpleTechniques(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Simple Techniques") {
            subSection("Airplane") {
                html {
                    p {
                        +"Also sometimes called \"Bird Pose\", is the most simple technique in Acroyoga. "
                        +"The base on his back, the flyer at the feet, facing towards the base. "
                        +"The base can almost touch the toes of the flyer (depending on the leg-body-proportion of the flyer more/less distance). "
                        +"The feet are parallel at the hips (toes on superior anterior part of spina illaca) of the flyer. "; br
                        +"The base start squatting with arms straight, the flyer is a passive plank (straight!) leaning forward. "
                        +"Base's fingers sideways, from the flyer facing upward. "; br
                        +"Finally push with the heels, flexing the toes, and extending the legs, so that they are perpendicular to the floor, just as the arms. "
                        +"The flyer engages the whole back side, the (lower) back and glutes, pointing toes, being totally straight, looking forward. "
                    }
                    p {
                        +"By pushing more into the toes, weight is taken away from the hands, to transition into a ";b{+"free bird"};+", basically a hands-free airplane. "
                        +"You can also of course immediately enter into free bird, totally without any hand-connection. "
                    }
                    youtube("bmktYLuksek", "Airplane tutorial by Acro Connection")
                }
            }
        }
        section("Inversions") {
            html {
                p {
                    +"Basically a fancy way to say upside down. "
                    +"For those it is recommended, for safety reasons, to always have a spotter (a guardian angel) with you. "
                }
            }
            // TODO base doing glute bridge, flyer head between, shoulders on legs, holding on shins
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
                        +"There is no need to jump from once you are in this preliminary position, instead simply pull your legs to your chest into the ";b{+"tuck position"};+". "
                        +"You can extend the legs sideways into a ";b{+"stradle pipe"};+" or upwards (which has a much higher center of gravity) into a regular ";b{+"stradle"};+" (legs up and open) or a ";b{+"straight"};+" (legs up and closed). "
                        +"The flyer's gaze is focused on the belly button to maintain a proper posture and orientation during upside down. "
                    }
                    p {
                        +"To go down, either step slowly and controlled again on the knees of the base, or simply extend the legs sideways and land on the ground directly. "
                        +"Also learn what could happen (if you would be without a spotter) if the flyer falls over, doing a roll, still with the base's hands on her shoulders, to not fall on him. "

                    }
                    youtube("anguDNE8amE", "fo")
                }
            }
            subSection("Star") {
                html {
                    p {
                        +"Good to first practice a tripod headstand by yourself as a flyer. "; br
                        +"Flyer stands next to the head facing downwards, grabbing with peace fingers, full contact with the whole palms. "
                        +"Base extending the legs, close to the head, toes on the clavicula, bending the knees. "
                        +"Flyer keeps the elbows bent and using the hands to push into in order to avoid going too far to the back. "
                    }
                    p {
                        +"The spotter could help with going up, so no jump is required, but ultimately is (as always) on at back side of the follower. "
                    }
                    youtube("6HngmitsKuQ", "star")
                }
            }
        }
    }
}
