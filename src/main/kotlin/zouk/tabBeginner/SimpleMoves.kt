package zouk.tabBeginner

import common.ref
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl
import zouk.ZoukRef

fun ZoukBeginnerSections.simple(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Simple Moves") {
            subSection("Star") {
                // =====================================================================================================
                html {
                    p {
                        +"Also called \"Cross\", is simply doing a 90-degree turn, preferably to the left, as right is more unnatural, yet possible, in Zouk. "
                        +"Be patient, do it only on the short steps, so a pattern of: straight - turn - turn. "
                        +"For the beginning, it's easier to turn while the leader is in the back and not in the front position. "
                    }
                    youtube("845fSQ7r7i4?si=DH9AxCjyEs1LCunb", "Basic step and (arbitrary) turns")
                }
            }
            subSection("Square") {
                // =====================================================================================================
                html {
                    p {
                        +"Basically a more continuous (every single, instead of every second) routine than the ";ref(ZoukRef.StarMove);+". "
                        +"Doing a 90-degree turn left (or right) after every beat, ending up in the same direction again after 4 turns. "
                    }
                    youtube(
                        "KemOjG2OgAI?si=CttNiLRjtfZQV8BE", "From close basic, doing a square to the left, four times"
                    )
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
            subSection("Body Wave") {
                // =====================================================================================================
                html {
                    p { +"From embrace, once the leader has done his side-step to the right, his next steps will be on the "
                        +"spot -don't travel! Once the follower is turned to the left, make her stop immediately, indicated by "
                        +"staying close and pulling her towards you, as if you want to give her a sideway-hug: Right shoulder, "
                        +"hip and leg touching." }
                    p { +"The wave for the follower is a simple frontal wave, for the leader, who is faced (almost) straight "
                        +"towards the follower, it's more of a sideways wave; in any case always leading from the shoulder, "
                        +"and feet stay fixed, no steps. "; br
                        +"You can do the wave either lasting for a full beat or half-beat, for a more relaxed sensation. "
                    }
                    p { +"When a wave towards the back has finished, you can enter again with a side-step to the left, on the "
                        +"boom sound, and lead the follower to an embrace, or immediately transition into basic, as you prefer. " }
                    youtube("T7-6y_3JiDM?si=k-kWJVZ7vlB9LoAd", "From lateral, to embrace, to body-wave, quick embrace and return to basic")
                    p { +"The body-wave can be reversed, leading from the hips first after led by the shoulders, "
                        +"then immediately going down as the leader and back into embrace. "
                        +"This move is called \"Chicote\", pronounced \"chigutsch\". " }
                    youtube("79OjOk3zT68?si=k2-Mill9OWRK5ZoB", "The extended body-wave, and Chicote")
                    p { +"The leader's move is simply two body-waves in opposite directions and a lowering of the whole body. " }
                    youtube("gq2vEw7lDjA?si=wL9I-vtUEAYSVkqm", "Leader movement for the Chicote (two body waves and a lowering)")
                    p { +"See also "; a("https://www.youtube.com/shorts/F340qPBY9hQ") {+"leaders video"}; +" "
                        +"and "; a("https://youtube.com/shorts/q50wUwvAJm8"){+"followers video"}; +" for more explanations. "
                    }
                }
            }
            subSection("Balao") {
                // =====================================================================================================
                html {
                    p { +"Balão means balloon in Portuguese and is the first head movement we learned. "
                        +"For a nice warm-up, you can first give your follower a cozy back/shoulder/neck massage." }
                    p { +"As a leader, simply \"float up\", breathe into the chest and bulging it out a bit. "
                        +"The arms will lift up a few centimeters, but don't lift your partner from your arms up. "
                        +"Just raise a bit with the inhale, while keeping your arms still wide open; don't squeeze her. " }
                    p { +"The follower rotates from the chest (not from the head/neck), and watch out to not bend too far back. "
                        +"It's like growing the paintbrush in your head tall, painting a big circle on the ceiling. "
                        +"Make sure this circle is parallel to the floor, and not tilting at an angle - aim for the ceiling! " }
                    youtube("JUAQK_Fthzw?si=2eDEON1lAFRZWw4Y", "Introduction to the Balao")
                }
            }
        }
    }
}
