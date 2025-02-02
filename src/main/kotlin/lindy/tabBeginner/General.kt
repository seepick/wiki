package lindy.tabBeginner

import common.ulDefinition
import kotlinx.html.*
import tabs.SectionedTabDsl

fun LindyBeginnerSections.general(dsl: SectionedTabDsl) {
    with(dsl) {
        section("General") {
            subSection("Advice") {
                // =====================================================================================================
                html {
                    ulDefinition(
                        "The Bounce" to "The importance of keeping a continuous, clear bounce cannot be overestimated. " +
                                "It is the one and only thing that keeps the dance alive, like the heart beating to keeping us alive. " +
                                "It also helps to maintain the connection with your partner, to (obviously) stay on-beat, and it simply helps to make the moves easier smoother. ",
                        "The Hands" to "Leader palm facing up, follower resting inside, with 4 fingers having a sponge-spring quality. " +
                                "They are connected to the frame and have enough tension so there is no need to squeeze them. " +
                                "\"Shape locks together\", like LEGO hands, hooking; a firm shape which can also be pushed into/pull from. " +
                                "The thumbs are free (don't squeeze them!), and the arms (holding the hands) are totally relaxed, hanging like noodles. " +
                                "Alternatively, there is a ballroom hand position, fingers pointing up, like a two-right-hands-handshake in standard dances. " +
                                "The crossed-hand position has both using the same hand in a handshake position but without using the thumb. ",
                        "The Frame" to "A wireframe-like structure established by a connection of the arms with the whole upper body; "
                                +"the part between the shoulders and hips, which stays upright and doesn't collapse. " +
                                "It must be connected to the arms to communicate (arm) movements (from our partner) into the whole body; an indirect center-center connection. ",
                        "The Rhythms" to "The most basic patterns are: 6-count and 8-count basic, whereas later there can be many variations; same goes for charleston. ",
                        "The Quality" to "Considering it's an African diasporic dance, it's more lively, and less upright ballroom European stiff. " +
                                "It's danced to big band jazz with a lot of bouncy energy. ",
                        "The Footwork" to "Staying in place, traveling (default), moving in/out (rock-step with lateral).",
                        "The Connection" to "We have an elastic connection, which can stretch, like a rubber band or bamboo. " +
                                "This compression can happen on both arms, the one where the hands touch, or the arm connects to the back. " +
                                "The pressure builds up gradually, slowly (instead of sharply which can come as a surprise). " +
                                "The limbs are connected to the frame, strong yet soft and not hard/rigid or collapsed/unstable. ",
                    )
                }

                subSubSection("Partnered Up") {
                    content {
                        ul {
                            li {
                                +"Give ";b { +"feedback" };+" to your partner, but don't criticize them. "
                                +"Show compassion, support and patience while doing so. "
                                +"Don't let your own inner critic also affect your partner. "
                                +"When in doubt, just say nothing, or ask for permission to give feedback (\""; i { +"Hey, I noticed something. Are you open for some feedback?" }; +"\"). "
                                +"Formulate questions/suggestions instead of commands (\""; i { +"How about trying to lift the arm a bit more?" }; +"\"), "
                                +"and always round it up with some words of encouragement (\""; i { +"Great! That feels much clearer for me now." }; +"\"). "; br
                                +"Be especially aware of these things when you are ";b { +"more experienced" };+" and dance with someone who is less. "
                                +"To not overwhelm with corrections, feedback and pointing out all the things that he is doing wrong. "
                                +"Sometimes it's also good to let them experience and learn by themselves -the best teacher of all. "; br
                                +"Lastly, when there are conflicting opinions, curiously explore and research both possibilities; ultimate ask your teacher, as s/he is always right ;) "
                            }
                            li {
                                +"Practice ";b { +"honestly" };+" with your partner. "
                                +"Don't try to be overly nice and polite, not hurting the other person's feeling, by doing something (expecting it, maybe due to the instructions) even though it has not been signaled by the leader. "
                                +"Respond only to what has been indicated, so if there is no push, you don't walk. Faking it will give your partner maybe a good short-term feeling, but will harm him more in the long run. "
                            }
                            li {
                                +"To better lead, enhance the signals you give via your ";b { +"body language" };+". "
                                +"Never underestimate the importance of leaning (forward/backward), shifting your weight (fully), and moving the whole body (as a unit). "
                                +"The embracing arm should give an \"elastic signal\" and the upper arms are connected/touching without a gap."
                            }
                            li {
                                +"As a leader, you give signals, you suggest or let's better say: You give ";b{+"suggestions"};+". "
                                +"You never force the follower to do something, using brute muscular effort to push or pull them around. "
                                +"You want it still to be a conversation where both have a saying; more like asking questions then using an imperative command. "
                                +"At the same time, there is a clear, yet gentle and very supportive indication. "
                                +"It helps the follower to make things easier, like a boost or a ramp to take off. "
                            }
                            li {
                                b { +"Leaders" };+" always anticipate: Be always half a step ahead, have a clear intention, a typical leadership skill. "
                                +"Know what you are going to do next, have it already ready in your head, plan ahead. Possibly even do a counter-move before as a signal that something is coming their way. "; br
                                b { +"Followers" };+" never anticipate: Be always half a step behind, that's just part of the game. "
                                +"Be open, surrender to the moment and listen carefully. "
                                +"They are not ";b { +"passive" };+", but are active in their perceptive role; it's not just about surrendering, being 100% in the body and being lazy doing nothing. "
                                +"It is a very role that requires attention and a precise listening skill, a constant state of being ready without interfering or forcing anything. "
                            }
                            li {
                                +"As a follower you are not only at the mercy of your follower of course. "
                                +"You also have the option to ";b{+"back-lead"};+" your leader, basically gently taking the lead. "
                                +"This is done without \"going against\" or saying no, but more like re-interpreting what has been suggested. "
                            }
                        }
                    }
                }
                subSubSection("Technical") {
                    content {
                        ul {
                            li {
                                +"When having difficulties with your steps, try "; b { +"verbalizing" }; +", making sounds with the rhythm. "
                                +"It's really a thing to help you keep track and establish a mind-body connection. "
                                +"Either counting with numbers, or saying \"quick quick slow\" / \"rock-step tripple tripple\". "
                                +"Or be more creative with something like \"shroom-bap-bom-de-bap\". "
                            }
                            li {
                                +"Listen to ";b { +"music" };+", follow the 4/8th pattern, the melody and keep your moves in sync with it."
                            }
                            li {
                                +"As a ";b { +"tall follower" };+" try to make yourself a bit smaller, so your leader can reach above your head. "
                                +"Or at least doesn't have to go too much on his toes. "
                            }
                            li {
                                +"Be ";b { +"engaged" };+" with all your body: "
                                +"Your face (smile), your inactive arm (reach it; no dead fish arms), and of course the most important bounce."
                            }
                            li {
                                b { +"Reach" };+" for your follower with your arm when returning/sending-in, "
                                +"so she knows a bit in advance what's going to happen/your intention. "
                            }
                            li {
                                +"When ";b { +"leading" };+", every move/technique is announced slightly ";b { +"before" };+", "
                                +"so the leader stays always a bit ahead, and executes the plan with certainty to not surprise the follower. "
                            }
                            li {
                                +"The ";b { +"body moves" };+" the legs, not the other way round. "
                                +"Move as one unit from your center/upper body -otherwise the follower will feel not much. "
                            }
                            li {
                                +"The ";b { +"rock-step" };+" is usually to the back, but sometimes diagonal, sometimes to the side, sometimes even to the front (e.g. swing-out). "
                                +"It is not so important where the foot is placed, but how the legs are moved by the body to send the right message into the follower. "
                            }
                        }
                    }
                }
                subSubSection("Common Beginner's Mistakes") {
                    content {
                        ul {
                            li { b { +"Squeezing" };+" the hand, especially using the thumb, instead of a relaxed 4-finger-connection (LEGO hands) only." }
                            li { +"Having stiff, ";b { +"tensed arms" };+", instead of having them hang as loosely as possible." }
                            li {
                                b { +"Pushing/pulling" };+" from the hand/the arm only (can be perceived as rude); using raw muscle strength. "
                                +"Instead change your frame by moving/rotating the whole (upper-)body thus center, using the frame connection."
                            }
                            li { +"As a leader, don't 'do' the movement for the follower, only give short, ";b{+"soft impulses"};+" at the beginning. Don't drag them around. " }
                            li { b { +"Bouncing upwards" };+", almost hopping, or not bouncing at all, instead of bouncing down into the ground." }
                            li { +"Having the hand on top of the ";b { +"leader's shoulder" };+", instead of on the back." }
                            li { b { +"Looking down" };+" at the feet, instead looking into the space or smiling at your partner." }
                            li { +"Holding your ";b { +"breath" };+", instead of letting your breath relax your body." }
                            li { +"Not enjoying it by having too high ";b { +"expectations" };+", instead of just doing it and failing fantastically with some laughter." }
                        }
                    }
                }
                subSubSection("Personality Qualities") {
                    content {
                        ul {
                            li {
                                +"Feel free to move as ";b { +"no one is watching" };+", because frankly: "
                                +"It is very, very likely that this is actually the case. "
                                +"Research shows, that many of us are afraid that we are being observed and judged. "
                                +"Yet, if everyone has that concern, there is no one left to observe, because everyone is busy with themselves."
                            }
                            li {
                                +"Just ";b { +"fuck it" };+"! Seriously, develop an attitude of caring less. "
                                +"Considering we all started to dance to feel pleasure, and not struggle and stress ourselves out to be good. "
                                +"It will help you to relax, to soften, and thus things will work actually even better. "
                                +"Just listen to the music and enjoy the dance. "
                            }
                            li {
                                +"Don't strive for perfection, because with Swing Dance mistakes happen all the time, it's part of it. "
                                +"Just be active together, communicate, and do the best as you can, and practice recovery strategies. "
                            }
                            li {
                                +"Put your attention on your ";b { +"breath" };+" can help to soften the body and free one's mind to improve concentration. "
                                +"Do a quick body-scan: Let your chest sink in, bend your knees, center your pelvis, feel the ground underneath your feet. "
                                +"Especially when facing a new, unknown partner, stress levels can go high due to nervousness. "
                                +"Getting off-beat, making mistakes. Simply recover with a smile/laughter, or start from new, reset. "
                            }
                        }
                    }
                }
                subSubSection("The Supernatural") {
                    content {
                        ul {
                            li { +"We primarily dance with the ";b { +"partner" };+", not with the music; the music is the 3rd dancing partner." }
                            li {
                                +"The follower always maintains the last impulse being sent, until acted upon. "
                                +"Just like the 1st law of classical ";b { +"mechanics" };+". She doesn't need to have a continuous force sensation from the lead to maintain it."
                            }
                            li { +"The leader is the force: push/pull, vector, effort. The follower the energy: capacity/potential, scalar, fuel." }
                        }
                    }
                }
                subSubSection("Personal Focus-points") {
                    content {
                        ul {
                            li { +"Lead with your ";b{+"center"};+", not with the legs (also make smaller rock-steps, staying within your center). "
                                +"Don't just make steps with your legs while your whole body stays stationary (disconnection). "
                                +"Steps are done due to shifting weight, which is due to moving the center. " }
                            li { +"When my center/body moves, then the arms move. "
                                +"This is not done for its own sake, but to communicate (kinetic force) ";i{+"into"};+" the follower." }
                            li { +"Have ";b{+"confidence"};+": Intimidating people, like teachers (hierarchy), or attractive people are also just people. "
                                +"See them as such and just enjoy. Get confidence by practicing, collect positive experiences (successes), and know you can do it too. "
                                +"Anticipating mistakes (fear of failing and feeling intimidated) makes you tense up, which leads to mistakes (self-fulfilling prophecy)! "
                                +"Know: \"I'm good, I have potential, let it go, let it be and just do it.\"" }
                        }
                    }
                }
            }
            subSection("Positioning") {
                // =====================================================================================================
                subSubSection("Closed Position") {
                    content {
                        p {
                            +"The closed-position is called that way, because the partners are ";b{+"standing closer"};+" to each other. "
                            +"The shoulders are \"side-by-side\", which also is one of its synonyms. "
                            +"We stand a bit in a V-shape, facing inwards towards each other, and not totally frontal to the front. "
                        }
                        p {
                            +"The leader has his ";b{+"arm"};+" all around the back around ";b{+"waist"};+", or a bit higher up, on the back. "
                            +"The follower has her hand on the ";b{+"shoulder blade"};+" which is closer to her. "
                            +"Depending on the ";b{+"height/size difference"};+", it might need to move somewhere else on the back, or even onto the upper arm. "
                            +"It is not on top of the leader's shoulder. "
                            +"Also pay attention that the arms have a connection so that there is ";b{+"no gap"};+" in between. "
                        }
                    }
                }
                subSubSection("Open Position") {
                    content {
                        p {
                            +"During the open-position, the partners stand in front of each other, further away, thus open. "
                            +"We usually immediately switch into the 6-count basic, as everything else might be too unclear to lead. "
                            +"The basic-step can be either done in the same or in the opposite direction. "
                        }
                        p {
                            +"The leaders left ";b{+"hand"};+" (palm upwards, fingers inwards) holds the followers right hand (palm downwards, fingers also inwards)."
                            +"The connecting arm is very relaxed, really hanging down. "
                            +"This is in contrast to the free arm, which act's like a \"wing\": Always up, hip height, ready for action. "
                            +"It is used to give directions to the follower when wanting to travel for example."; br
                            +"You can also change your hand, as a leader use the right (instead of the left) hand and have them in a \"shake hand position\" but without using the thumbs!"; br
                            +"In the closed-position the hand-connection is optional, during the open-position it is (more) mandatory, as it is the only (physical) connection."
                        }
                        p {
                            +"Dare to ";b{+"play around"};+" in the open position, be creative, explore and research freely, there is a lot possible here. "
                            +"Travel around, change places by passing by either left or right (keep the arm low), or do a turn by lifting the arm, to make the difference really clear. "
                            +"Sometimes a change in direction/traveling can be misinterpreted as a pass-by... well, it's ok :)"
                        }
                    }
                }
            }
        }
    }
}
