package acro.tabBeginner

import acro.AcroRef.*
import common.ref
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun AcroBeginnerSections.birds(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Birds") {
            subSection("Bird") {
                html {
                    p {
                        +"Also sometimes called \"Airplane\" (or \"Front Bird\"), is the most simple technique in Acroyoga. "; br
                        +"";b { +"Preparation" };+": The base on his back, the flyer at the feet, facing towards the base. "
                        +"The base can almost touch the toes of the flyer (depending on the leg-body-proportion of the flyer more/less distance). "
                        +"The feet are parallel (not V-shaped) at the hips (toes on superior anterior part of spina illica) of the flyer. "; br
                        +"The base starts squatting, with arms staying straight; the flyer is a passive plank (straight, not bending at the hips) leaning forward. "
                        +"Base's fingers facing sideways, the flyer's upward; contact comes from the palm, not the fingers. "
                    }
                    p {
                        +"";b { +"Lifting" };+": Finally push with the heels, flexing the forefoot, and extending the legs, so that they are perpendicular to the floor, just as the arms. "
                        +"You need to have a continuous movement here, receiving weight, and pushing straight up (not diagonal) in one go, otherwise it will get heavy. "
                        +"The flyer engages the whole back side, the (lower) back and glutes, pointing toes, being totally straight, looking forward. "
                    }
                    p {
                        +"By pushing more into to the forefoot (not curling the toes, painful for the flyer!), "
                        +"weight is taken away from the hands, to transition into a ";b { +"free bird" };+", basically a hands-free airplane. "
                        +"You can also of course immediately enter into free bird, totally without any hand-connection. "
                    }
                    p {
                        +"";b { +"Landing" };+": is done by bending the legs, yet without bending the arms (dangerous to fall over). "
                        +"The base pointing, to tilt the flyer for a smooth transition onto the ground. "
                        +"Base is pushing a bit with the legs to help the flyer going back straight again, standing on her own feet. "
                    }
                    youtube("bmktYLuksek", "Airplane tutorial by Acro Connection")
                }
            }
            subSection("Reverse Bird") {
                html {
                    p {
                        +"Flyer stand next to base's ear, facing caudal. "
                        +"The base reaching with his toes pretty low, so that the heels will be roughly at the hip-bones. "
                        +"Base grabbing her shins, flyer grabbing his calves; alternately you can have a peace grip, or no hand support at all.  "
                        +"Once the flyer opens her chest, it should be possible to let go of any hand contact. "
                    }
                    p {
                        +"The flyer can change her shape (grabbing own legs), or transition into (and out from) a side star. "
                    }
                    youtube("5ZkOrxwq-9A", "Acro Nerds silent explanation of the Reverse Bird ")
                    youtube("c-eHZmKy3ro", "Enter Reverse Bird from a Hand-to-Foot")
                    youtube("hCu4fWYdQ8I", "Simply fall through from Reverse Bird to Straddle Bat")
                }
                subSubSection("Transition to Back Bird") {
                    html {
                        p {
                            +"Once in Reverse Bird, connect both hands, one reaching through the legs, the other outside. "
                            +"With the side where hand is connected inside, that foot stays connected, the other moves out. "
                            +"Rotate the leg so the heel turns outwards onto the flyer's upper leg. "
                            +"Both flex their arms ending up basically in a one-legged ";ref(StraddleBat);+". "
                            +"Reposition your foot, and place both feet on her buttocks. "
                            +"Circle the arms first to the side and push her chest up, ending up in a Back Bird. "
                        }
                    }
                }
            }
            subSection("Back Bird") {
                html {
                    p {
                        +"It's just a regular Bird, but then with the belly facing upwards, almost like a dead bird. "
                    }
                    p {
                        +"Flyer facing away, base with his feet on her buttock (round part in her round part), toes near the QL (Quadratus Lumborum) muscle. "
                        +"Flyer grabs his ankles with her thumbs facing inwards, palms facing away, to gain more stability, and leans back to give weight. "
                        +"Base reaching for her elbows and then walking his hands towards her shoulders for support (if necessary). "
                        +"If the flyer's body is too long and touching with her head the base, then simply look towards the ceiling to curl the spine. "; br
                        +"Once you let go of the hand support, you are in a ";b{+"Free Back Bird"};+". "; br

                    }
                    youtube("qa5iG6k3W0s", "Super Dave explaining Back Bird step-by-step with some variations")
                    p {
                        +"Several different, simple variations are possible from here, like: back bow, back plank, and boat pose."
                        +"From here, it's also easy to ";b{+"transition"};+" into a ";ref(StraddleBat);+", or go down in something like a \"double child's pose roll\". "
                    }
                }
            }
        }
    }
}
