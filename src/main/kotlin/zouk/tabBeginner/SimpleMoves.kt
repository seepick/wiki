package zouk.tabBeginner

import common.image
import common.ref
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl
import zouk.ZoukRef

fun ZoukBeginnerSections.simple(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Simple Moves") {
            html {
                youtube("845fSQ7r7i4?si=DH9AxCjyEs1LCunb", "Basic step and (arbitrary) turns")
            }
            subSection("Star") {
                // =====================================================================================================
                html {
                    p {
                        +"Also called \"Cross\", is simply doing a 90-degree turn, preferably to the left, as right is more unnatural, yet possible, in Zouk. "
                        +"Be patient, do it only on the short steps, so a pattern of: straight - turn - turn. "
                        +"For the beginning, it's easier to turn while the leader is in the back and not in the front position. "
                    }
                    image("images/star.jpg", 450 to 457, "Rounded Star")
                    youtube("li2As92QDBY?si=1biewGcw4_qQm8FM", "Star as a sequence of turns (on the back only) to the left")
                }
            }
            subSection("Square") {
                // =====================================================================================================
                html {
                    p {
                        +"Basically a more continuous (every single, instead of every second) routine than the ";ref(ZoukRef.StarMove);+". "
                        +"Doing a 90-degree turn left (or right respectively) with each chick-chick, ending up in the same direction again after 4 turns (360 degrees). "
                    }
                    youtube(
                        "KemOjG2OgAI?si=CttNiLRjtfZQV8BE", "From close basic, doing a square to the left, four times"
                    )
                    p {
                        +"Adhering the principle of always rounding the corners, avoiding sharp edges, follow a footwork as depicted below. "
                        +"Instead of turning 90 degrees counter-clockwise on the spot, first step a bit out of the box/square. "
                        +"This will make a significant difference in experienced smoothness for you and your follower. "
                    }
                    image("images/square.jpg", 400 to 399, "Rounded Square")
                }
            }
            subSection("Simple Turn") {
                // =====================================================================================================
                html {
                    p {
                        +"There are many possible occasions where one can do a simple turn. "
                        +"It is usually done by lifting the left hand and drawing some sort of \"halo\" around the follower's head, counter-clockwise. "
                        +"Also pay attention to step forward with the second chick, closer to the follower, to \"collect\" her and close the gap, making things smoother. "
                    }
                    p {
                        +"One of possible applications is when transitioning ";b{+"from lateral to basic"};+" steps. "
                        +"Lead already when the follower is going to the right by doing a side-step left on your own line. "
                        +"With the first chick, right step on her line (where she was just standing), and second chick cross her line. "
                        +"Step out her line completely in order to maintain continuation (of her lateral) and not block her path. "
                        +"To prevent yourself from rushing, you need to walk around more closely (requires predictable step distance/direction of both). "; br
                        +"Alternatively don't even try to reach the shoulder blade (as we would do by default) but leave it only with the left-hand connection. "
                        +"This is preferred in case you have the tendency to catch your follower and going into a grandpa-style (leaning forward) kind of posture. "
                        +"You could also maintain touch connection with your right hand, still not going for the shoulder blade, but continuously (gapless) stroking over the back and arm to the hand. "
                    }
                    p {
                        +"Another simple, frequent spot to do a simple turn is after a ";ref(ZoukRef.Lunge);+". "
                        +"Just watch out that the step to the left is not too big, preferably keep it smaller. "
                        +"Another common mistake is to position the left too far out, just like the left foot. "
                        +"Instead, keep the arm roughly in front of shoulder, otherwise there is a huge distance to be bridged, leading to a rushed quality. "
                    }
                }
            }
            subSection("Piao") {
                // =====================================================================================================
                html {
                    p { +"It's basically turning on the spot: In basic-step, when the leader is in the front, \"ground\" "
                        +"the follower making it clear to not make further steps, and slowly rotate on the spot "
                        +"(pivot point is between both), with small steps, keeping the rhythm. " }
                    youtube("Sp96GjPKzPg?si=IKyyN_Sn1eUenFYc", "The Piao move, turning slowly on the spot")
                }
            }
            subSection("Body-Wave") {
                // =====================================================================================================
                html {
                    p {
                        +"With body-waves, we usually refer to the one which resembles a snake, leading from the head down the body. "
                        +"The inverted/reversed body-wave is often also called waterplant/seaweed, which is led by the legs/hips first upwards. "
                    }
                    p {
                        +"From embrace, once the leader has done his right side-step, stay on the spot -don't travel! "
                        +"Once the follower is turned left, melt into each other with a soft sideway-hug. "
                        +"The quality of this movement should resemble an airbag, a soft squeeze, in contrast to a hard bump. "
                        +"To do so, roll the point of contact from the hand, over the arm, into the body. "
                        +"Do so on both sides, on the shoulder, but especially on the waist, as from here the body-wave will be started"; br
                        +"Right shoulder, hip and leg touching; give some weight and lean into each other for better communication."
                    }
                    p {
                        +"The follower's wave is forward-backward (sagital plane), and the leader's wave more sideways (frontal plane; snake/waterplant). "
                        +"Leading is done from the shoulder and pelvis, and feet stay fixed, no steps. "; br
                        +"You can do the wave either lasting for a full beat or half-beat, for a more relaxed sensation. "
                    }
                    p {
                        +"When a wave towards the back has finished, you can enter again with a side-step to the left, on the boom sound. "
                        +"Lower your center first, bend your knees, and rotate left/CCW a bit before taking a step. "
                        +"Lead the follower to an embrace, or immediately transition into basic, as you prefer. "
                    }
                    youtube("T7-6y_3JiDM?si=k-kWJVZ7vlB9LoAd", "From lateral, to embrace, to body-wave, quick embrace and return to basic")
                    p {
                        +"See also "; a("https://www.youtube.com/shorts/F340qPBY9hQ") {+"leaders video"}; +" "
                        +"and "; a("https://youtube.com/shorts/q50wUwvAJm8"){+"followers video"}; +" for more explanations. "
                    }
                }
            }
            subSection("Chicote") {
                // =====================================================================================================
                html {
                    p {
                        +"The move \"Chicote\" is pronounced \"chigutsch\" and is basically a reversed body-wave. "
                        +"You lead it from the hips first, travelling up the body into the shoulders. "
                        +"What is different though is, that the movement is less forward-backward, and no weight shift is occuring. "
                        +"Instead, the movement is vertical, bending the knees, and staying with the weight on the back leg. "
                    }
                    youtube("79OjOk3zT68?si=k2-Mill9OWRK5ZoB", "The extended body-wave, and Chicote")
                    p {
                        +"The leader's move is simply two body-waves in opposite directions and a lowering of the whole body. "
                    }
                    youtube("gq2vEw7lDjA?si=wL9I-vtUEAYSVkqm", "Leader movement for the Chicote (two body-waves and a lowering)")
                }
            }
            subSection("Balao") {
                // =====================================================================================================
                html {
                    p {
                        +"Balão means \"balloon\" in Portuguese and is the first head movement we learn in Zouk. "
                        +"It is one of the (three) most used head movements, and could be considered in general a signature move of Zouk. "
                        +"For a nice warm-up, you can first give your follower a cozy back/shoulder/neck massage to help them relax. "
                    }
                    p {
                        +"As a leader, simply \"float up\", breathe into the chest and bulging it out a bit. "
                        +"The arms will lift up a few centimeters, but don't lift your partner from your arms up. "
                        +"Just raise a bit with the inhale, while keeping your arms still wide open; don't squeeze her. "
                    }
                    p {
                        +"The follower rotates from the chest (bra-line, not from the head/neck), extending the rib upwards (when going sideways) rather contracting the other. "
                        +"Watch out to not bend your head too far back, as this is the only side which is not protected by strong connective tissue. "
                        +"It's like growing the paintbrush in your head tall, painting a big circle on the ceiling. "
                        +"When moving forward, bend your knees a bit; when going backward, stretching them again (but don't lock them). "
                        +"As usual, as a good leader, do the movement yourself, bending knees, tilting the body, leading by being a role model, an example. "
                        +"Yet, when going forward, don't drop your head, but make space for the follower's instead"; br
                        +"Make sure this circle is parallel to the floor, and not tilting at an angle - aim for the ceiling! "
                        +"No turning, staying frontal, the hips static and the movement happens only from the waist upwards. "

                    }
                    youtube("JUAQK_Fthzw?si=2eDEON1lAFRZWw4Y", "Introduction to the Balao")
                }
            }
        }
    }
}
