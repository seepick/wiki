package zouk.tabIntermediate

import kotlinx.html.*
import tabs.SectionedTabDsl

fun ZoukIntermediateSections.general(dsl: SectionedTabDsl) {
    with(dsl) {
        section("General") {
            subSection("Practice Advice") {
                html {
                    p {
                        +"We use a so-called ";b{+"WiFi connection"};+", to ensure we are not too much manipulating with our arms. "
                        +"As we call it this way, because we have no physical, direct (hand-)connection with our partner. "
                        +"The information is transmitted solely \"through the air \". "
                        +"Once you are able to fully understand each other this way, finding mutual understanding with physical connection will be super easy. "; br
                        +"One level easier should be to do all the moves with body contact, yet not direct hand-to-hand grip. "
                        +"Maybe an arm around the back, but still mostly lead everything from the frame. "
                        +"Learning to do so will allow you to total let go of leading only through the arm/hand. "
                    }
                }
            }
            subSection("Starting Dance") {
                html {
                    p {
                        +"Especially if the person is unknown to you, it is always a good advice to ";b{+"start slowly"};+". "
                        +"Not only to check where your partner is with their skill level, to slowly build up, "
                        +"but also not to rush too quickly, to not get stressed out right away, nor to rush without any sensitivity into the ";b{+"intimate space"};+" of the partner. "; br
                        +"First connect to the music, then to your partner. "
                        +"Staying on the spot for a while, no big, fancy moves yet. "
                        +"Continue with simple footwork, travelling, moving around in the room with simple turns. "
                    }
                    p {
                        +"The transition from standing on the spot to the basic step needs to be smooth without a shock to the follower. "
                        +"Announce it slightly before the first step, and maintain a connection throughout. "
                        +"Using the breath (deep inhale, and step on the exhale), moving into the follower and shift to her left leg. "
                        +"Like going up before going down; like going down before jumping (going up). "
                        +"Swing your left leg forwards, finding contact, and with this connection, start the basic step. "
                    }
                }
            }
            subSection("Fine-Tuning") {
                html {
                    ul {
                        li {
                            +"Maybe one of the most important aspect is keeping a proper ";b{+"posture"};+" throughout the dance. "
                            +"We want to keep our upper body upright, with an active upright structure; neither collapsed, nor stiff. "; br
                            +"Never look down (yes, your feet are still there), and also no need to constantly eye-gaze throughout your dance. "
                            +"Looking around into the room helps you not only with keeping an upright position, but also to maintain your ";b{+"space awareness"};+". "
                            +"Seeing the room, potential obstacles such as DJ tables, and most importantly other people, so your partner won't bump into someone."
                        }
                        li {
                            +"A good connection is only possible with a good ";b{+"frame"};+", which relates to the posture point above. "
                            +"Only then, we can communicate intentions through the arms into the center and the whole body of the follower. "
                            +"This quality is rather soft, yet firm; like rubber, which gets more hard the more it is squeezed. "
                        }
                        li {
                            +"Although it should be obvious by now, yet it is surprising at times how frequent it is to struggle with ";b{+"rhythm"};+". "
                            +"Develop a good ear for the music, to stay on beat, and synchronize your steps and moves with it. "
                            +"We are -not yet- talking about musicality here, which might be considered a more advanced meta-skill which comes later. "
                            +"No, just a simple, rhythmic movement, maintaining the same pace, and constantly have one ear on the instrumental. "; br
                            +"Also pay attention to maintain the footwork while you might not have much else to do; e.g. during yoyo send-out."
                        }
                        li {
                            +"Once a technique is going well, you can start to ";b{+"decorate"};+" a bit more. "
                            +"Keep your ";b{+"pelvis moving"};+" with every step, yet maintaining an upright, stable structure (don't get too lose). "
                            +"Also decorate with your arms whenever time permits, touch yourself, and feel free to be a bit more dramatic. "
                        }
                    }
                }
            }
        }
    }
}
