package acro.tabBeginner

import acro.AcroRef
import acro.AcroRef.*
import common.ref
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun AcroBeginnerSections.simpleTechniques(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Simple Techniques") {
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
                            +"Both flex their arms ending up basically in a one-legged Straddle Bat. "
                            +"Reposition your foot, and place both feet on her butt. "
                            +"Circle the arms first to the side and push her chest up, ending up in a Back Bird. "
                        }
                    }
                }
            }
            subSection("Back Bird") {
                html {
                    p {
                        +"Flyer facing away, base with his feet on her butt with his toes near the Quadratus Lumborum muscle. "
                        +"Flyer grabs his ankles with her thumbs facing inwards for more stability. "
                        +"Base reaching for her elbows and then walking towards her shoulders for support (if necessary)."; br
                        +"Once you let go of the hand support, you are in a ";b{+"Free Back Bird"};+". "; br
                        +"Several different, simple variations are possible from here, like: back bow, back plank, and boat pose."
                    }
                    youtube("qa5iG6k3W0s", "Super Dave explaining Back Bird step-by-step with some variations")
                    p {
                        +"From here it is easy to ";b{+"transition"};+" into a ";ref(StraddleBat);+". "
                    }
                }
            }
            subSection("Tuck Sit") {
                html {
                    p {
                        +"This is a very basic and fundamental position which will show up in many other techniques as well. "
                        +"You start in a peace-grip and hands in 45 degrees; not straight, no platform; not 90 degrees, too heavy for the wrists. "
                        +"The palms are \"sucked\" into each other, almost creating a vacuum so that no air-pocket is in between. "; br
                        +"The base simply lies on his back with the arms straight up. "
                        +"For more stability, engage your latissimus dorsi, locking shoulder and especially the stabilizers, and embrace your ribs; do not push from your shoulders up. "; br
                        +"The flyer is slowly pouring her weight into hands, and then release one leg after the other from the ground. "
                        +"Next, move your legs forward, through the arms, but do NOT lean backward, as then you are off balance and might fall with your back onto the base. "
                        +"You have to round your chest, shoulder forward; don't change your hand position, as you might have the tendency to go to 90 degrees, flat, putting pressure on your wrists. "
                    }
                    youtube("4UAfHgjbvxY", "Tuck Sit quickly demonstrated by AcroYogaTV")
                }
            }
            subSection("Straddle Bat") {
                html {
                    p {
                        +"The flyer simply hanging upside down with the legs on the base's extended feet/legs (straddle), legs extended sideways. "
                        +"It is important when transitioning into it, that the flyer provides a proper platform by spreading the legs, toes pulled towards the floor. "
                        +"You can be facing either direction, but the name and position is identical for both. "; br
                        +"It's usually a common transition pose: from ";ref(Bird);+" letting yourself down, "
                        +"step up/down to/from ";ref(Star);+", into Floating Paschi, an in-between pose of a Cart Wheel between Side Stars, etc."
                    }
                    youtube("mwETRw_OOXs", "Candace showing a direct entrance into Straddle Bat")
                    p {
                        +"A possible ";b{+"exit"};+" from here would be by first connecting via a peace grip to be able to shift the weight. "
                        +"Get one leg out and place the flexed foot under her butt and shins under her back. "
                        +"Then do the same with the other leg and both are in some kind of \"";i{+"stacked inverted child pose"};+"\". "
                        +"Hold onto her shoulders, and slowly roll forward using her gravitational pull so both end sitting upright. "
                    }
                }
            }
            subSection("Foot to Shin") {
                html {
                    p {
                        +"Connecting both hands (just like in Bird), the flyer steps on the lower legs of the base. "
                        +"Slightly below the knees, with the big toes and 2nd toes between the shin bones. "; br
                        +"The flyer stands up upright, balancing herself only with the feet, gaze is forward (not down anymore). "
                        +"The base can have the legs fully bent or the knees above the hips (slightly more advanced), "
                        +"but always keep the feet slightly higher than the knees to provide a safe foundation for the flyer. "
                    }
                    youtube("GNq_MVWxLB0", "Acro Connection demonstrating the Foot to Shin pose")
                    p {
                        +"You can of course transition from/into different positions, like Airplane, Throne and Whale (see video below). "
                    }
                    youtube("gixLd-6i9ko", "Yogafreq showing several different transitions for Foot to Shin")
                }
            }
            subSection("Whale Pose") {
                html {
                    p {
                        +"Flyer stands next to base's head, facing away; base is grabbing the ankles. "
                        +"Reach with toes under the shoulder blades (maybe with help of flyer reaching for them), and flyer bends backwards. "
                        +"Bend the knees to lift, and then extend all four limbs at the same time. "
                    }
                    p {
                        +"";b { +"Landing" };+" by bending all limbs, putting her feet on the ground, "
                        +"and help her stand in her own center by pushing her a bit forward with the feet. "
                    }
                    youtube("hBrGxXFZQ98", "Acro Connection presenting the Whale Pose")
                }
            }
            subSection("Throne Pose") {
                html {
                    p {
                        +"Basically sitting on the base's feet like on a throne. "
                        +"The entrance can be the same as with the ";ref(WhalePose);+", going backwards (flexible Happy Baby for the base), "
                        +"or transition from ";ref(Bird);+". "
                    }
                    youtube("Mz_P0UzoBbk", "Super Dave showing variations of the Throne Pose")
                }
            }
            subSection("Throne Pose") {

            }
        }
    }
}
