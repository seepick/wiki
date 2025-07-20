package acro.tabBeginner

import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

// TODO more techniques
/*
- from airplane into massaging; hands in prayer and stretch
- base doing glute bridge, flyer head between, shoulders on legs, holding on shins
- flyer backwards, back stretch
 */

fun AcroBeginnerSections.simpleTechniques(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Simple Techniques") {
            subSection("Airplane") {
                html {
                    p {
                        +"Also sometimes called \"Bird Pose\", is the most simple technique in Acroyoga. "; br
                        +"";b{+"Preparation"};+": The base on his back, the flyer at the feet, facing towards the base. "
                        +"The base can almost touch the toes of the flyer (depending on the leg-body-proportion of the flyer more/less distance). "
                        +"The feet are parallel (not V-shaped) at the hips (toes on superior anterior part of spina illica) of the flyer. "; br
                        +"The base starts squatting, with arms staying straight; the flyer is a passive plank (straight, not bending at the hips) leaning forward. "
                        +"Base's fingers facing sideways, the flyer's upward; contact comes from the palm, not the fingers. "
                    }
                    p {
                        +"";b{+"Lifting"};+": Finally push with the heels, flexing the forefoot, and extending the legs, so that they are perpendicular to the floor, just as the arms. "
                        +"You need to have a continuous movement here, receiving weight, and pushing straight up (not diagonal) in one go, otherwise it will get heavy. "
                        +"The flyer engages the whole back side, the (lower) back and glutes, pointing toes, being totally straight, looking forward. "
                    }
                    p {
                        +"By pushing more into to the forefoot (not curling the toes, painful for the flyer!), "
                        +"weight is taken away from the hands, to transition into a ";b { +"free bird" };+", basically a hands-free airplane. "
                        +"You can also of course immediately enter into free bird, totally without any hand-connection. "
                    }
                    p {
                        +"";b{+"Landing"};+": is done by bending the legs, yet without bending the arms (dangerous to fall over). "
                        +"The base pointing, to tilt the flyer for a smooth transition onto the ground. "
                        +"Base is pushing a bit with the legs to help the flyer going back straight again, standing on her own feet. "
                    }
                    youtube("bmktYLuksek", "Airplane tutorial by Acro Connection")
                }
            }
        }
        section("Intermediate Techniques") {
            subSection("Inside Side Star") {
                html {
                    p {
                        +"The flyer basically balances on one of the base's leg while being in yoga's \"half moon pose\". "; br
                        +"";b{+"Lifting"};+": The flyer stands next to the base's pelvis, looking cranial. "
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
                    // TODO
//                    youtube("d_lto3XbRgY", "Super Dave explains getting from Airplane to Side Star")
//                    youtube("1MDtl429xEE", "Ninja Star continuation (a.k.a. washing machine)")
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
                        +"Flyer keeps the elbows bent and using the hands to push into in order to avoid going too far to the back. "
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
