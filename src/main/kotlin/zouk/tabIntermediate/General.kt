package zouk.tabIntermediate

import kotlinx.html.*
import tabs.SectionedTabDsl

fun ZoukIntermediateSections.general(dsl: SectionedTabDsl) {
    with(dsl) {
        section("General") {
            subSection("Practice Advice") {
                html {
                    p {
                        +"Nobody is perfect, and there will be mistakes (off beat, miscommunication, bumps, etc.). "
                        +"The goal thus is not to reach perfection, but how to develop smooth ";b{+"recovery strategies"};+" to quickly get into it. "
                        +"If your goals is '";i{+"dress to impress"};+"' then use the attitude of improvisation actors: "
                        +"There are no mistakes, just unintentionally sources of inspiration. "
                    }
                }
            }
            subSection("Starting Dance") {
                html {
                    p {
                        +"Especially if the person is unknown to you, it is always a good advice to ";b { +"start slowly" };+". "
                        +"Not only to check where your partner is with their skill level, to slowly build up, "
                        +"but also not to rush too quickly, to not get stressed out right away, nor to rush without any sensitivity into the ";b { +"intimate space" };+" of the partner. "; br
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
                            +"Maybe one of the most important aspect is keeping a proper ";b { +"posture" };+" throughout the dance. "
                            +"We want to keep our upper body upright, with an active upright structure; neither collapsed, nor stiff. "; br
                            +"Never look down (yes, your feet are still there), and also no need to constantly eye-gaze throughout your dance. "
                            +"Looking around into the room helps you not only with keeping an upright position, but also to maintain your ";b { +"space awareness" };+". "
                            +"Seeing the room, potential obstacles such as DJ tables, and most importantly other people, so your partner won't bump into someone."
                        }
                        li {
                            +"A good connection is only possible with a good ";b { +"frame" };+", which relates to the posture point above. "
                            +"Only then, we can communicate intentions through the arms into the center and the whole body of the follower. "
                            +"This quality is rather soft, yet firm; like rubber, which gets more hard the more it is squeezed. "
                        }
                        li {
                            +"Although it should be obvious by now, yet it is surprising at times how frequent it is to struggle with ";b { +"rhythm" };+". "
                            +"Develop a good ear for the music, to stay on beat, and synchronize your steps and moves with it. "
                            +"We are -not yet- talking about musicality here, which might be considered a more advanced meta-skill which comes later. "
                            +"No, just a simple, rhythmic movement, maintaining the same pace, and constantly have one ear on the instrumental. "; br
                            +"Also pay attention to maintain the footwork while you might not have much else to do; e.g. during yoyo send-out."
                        }
                        li {
                            +"Once a technique is going well, you can start to ";b { +"decorate" };+" a bit more. "
                            +"Keep your ";b { +"pelvis moving" };+" with every step, yet maintaining an upright, stable structure (don't get too lose). "
                            +"Also decorate with your arms whenever time permits, touch yourself, and feel free to be a bit more dramatic. "
                        }
                        li {
                            +"Slide your hand over the ";b{+"shoulder-blade"};+" indicating you want to break the current move. "
                            +"And also to indicate you want to go back to a (linear) basic instead of a (rotational) lateral. "
                            +"Think of the exit of a Soltinho or an Elastico."
                        }
                        li {
                            +"Always ";b{+"be the change you want to see in the outside world"};+". In this case: Do what you want her to do. "
                            +"During a Lunge Turn or a Raul, do the movement yourself, and communicate it through the frame connection into the follower. "
                            +"It won't really work if you don't do it, but want her to do it. "
                        }
                        li {
                            +"The quality of the connection should always be like a ";b{+"gentle hug"};+". "
                            +"Not too tight, squeezing her, expressing an overly neediness, wanting and taking. "
                            +"Also don't let too much space in between, expressing insecurity, not wanting to touch her. "
                            +"The whole leading, everything you do, holding hands, has this kind of quality."
                        }
                        li {
                            +"For a more ";b{+"clear communication"};+", it is very helpful for the follower if a move is announced early upfront. "
                            +"A simple lift of the arm is giving a clear signal that a change is about to happen. "
                            +"Giving space to adjust, adapt and prepare to what's coming."
                        }
                        li {
                            +"Some followers struggle with keeping balance and a controlled directionality when ";b{+"turning"};+". "
                            +"You can improve it by keeping the feet on the ground, including the heels, and slide more than stepping. "
                            +"Also avoid to do a full spin, which might be fast, but is highly unstable. "
                            +"Instead, take turning steps on the chit-chit as we always do. "; br
                            +"Also use the left foot as a pivot point, in order to avoid travelling to the side but stay on the spot. "
                            +"This will avoid a \"rushed leader trying to catch the follower\" situation. "
                        }
                        li {
                            +"To more clearly communicate a turn into the follower, properly lift the elbow, and not only the hand. "
                            +"Remember the image of emptying a cup."
                        }
                    }
                }
            }
            subSection("Styling") {
                html {
                    p {
                        +"Follower styling can include tilting the hips sideways on each step, or doing a body-wave. "
                        +"In any case, watch out to keep the upper body stable and only move the lower body, "
                        +"as otherwise this will interrupt the connection and break the dance."
                    }
                }
            }
        }
    }
}
