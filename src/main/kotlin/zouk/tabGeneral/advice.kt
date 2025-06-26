package zouk.tabGeneral

import common.Topic
import common.topics
import kotlinx.html.*
import shared.AdvicePartner
import shared.AdviceQualities
import shared.AdviceTechnical
import shared.Mistakes
import shared.Shared
import tabs.SectionedTabDsl


fun ZoukGeneralSections.advice(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Advice") {
            html {
                p {
                    +"Advices are some form of \"softer version\" of principles. "
                    +"Their scope might be a bit more narrow, and violating doesn't lead to any big mistake. "
                    +"They are less universally applicable, and sometimes violating them can be a deliberate choice to do to spice it up a bit. "
                    +"Yet, the line between a principle and a general advice is more blurred and can't be precisely differentiated. "
                }
            }
            subSection("Partnering") {
                // =====================================================================================================
                html {
                    topics(
                        Shared.AdvicePartner.GentleLeader,
                        Shared.AdvicePartner.BackLeading,
                        Shared.AdvicePartner.Inertia,
                        Shared.AdvicePartner.NonAnticipation,
                        Shared.AdvicePartner.BodyDifferences,
                        Shared.AdvicePartner.Feedback,
                        Shared.AdvicePartner.Honesty,
                    )
                }
            }
            subSection("Technical") {
                // =====================================================================================================
                html {
                    topics(
                        Shared.AdviceTechnical.InvitingArm,
                        Shared.AdviceTechnical.SoftStrong,
                        Topic("Amount of Pressure") {
                            +"This especially applies to the follower role, to relax, to soften, to give weight. "
                            +"To build a proper connection, there is more needed than a simple butterfly touch. "; br
                            +"In basic, give the weight of your arm, relaxing into it (don't be afraid that it's too much, that you are pushing). "
                            +"Don't push with your hand though, only the arm, and lean back into the leader's hand on your back. "; br
                            +"In closed embrace, share the weight together, leaning with the shoulder/upper arm; in open embrace to the same with your hands. "; br

                            +"The more advanced we get though, the less weight is necessary (skill); "
                            +"sometimes a move requires more \"connection-pressure\", but use it only as a spice (technique); "
                            +"sometimes the quality of the music determines the amount of force being used, hard beat or mellow chords (musicality); "
                            +"sometimes the circumstances require a quick, forced change, when at a social another couple is about to collide with you (safety); "
                            +"sometimes it's just about how one likes to dance (personal preference), for which you need to develop a meta skill to quickly reading this. "; br
                            +"Keeping the tension as low as possible enables us to have space to increase tension if necessary. "
                            +"If we are already at the maximum, it will be difficult/impossible to increase it further. "
                            +"We need to have this capacity to increase tension in case we want to indicate a change/break (of rhythm/flow/direction). "
                            +"Ultimately, and that applies to everything: You can do whatever you do, as long as you know what you are doing (and it's a deliberate choice; like with staying on the lines). "
                        },
                        Topic("Distance") {
                            +"Find a comfortable distance with your partner, it's also fine to just ask explicitly when in doubt. "
                            +"Just don't rush it right away, and slowly adjust distance and be very sensitive to the response you get. "
                        },
                        Topic("Arm Position/Grip") {
                            +"Leaders keep your ";b { +"arms up" };+", so that the follower can rest upon them, as it helps to maintain a better connection. "
                            +"Also have a firm, yet ";b { +"soft grip" };+", on torso and shoulders, as it helps with sending a clear intention."
                        },
                        Topic("Scapula Attraction") {
                            +"Whenever you see a shoulder blade, reach out for it and touch it. "
                            +"When the follower turns, e.g. in a lunge-simple turn, transition quickly, almost like a continuous hand-over never releasing the contact. "
                            +"This usually indicates to go back to basic. "
                            +"Stay in close proximity, keep your body upright, as if you are too far away, you have to bend forward, doing it the ";i{+"grandpa style"};+". "
                        },
                        Topic("Zouk Bodyscan") {
                            +"In order to build confidence, to create your own comfort zone, during a dance scan your body and check the following: "
                            +"Do you have a soft hug around the follower with your right arm? "
                            +"Is the left arm a proper \"noodle arm\", fully relaxed hanging down? "
                            +"Are your shoulders pulled back, engaging your rhomboids (when sending the follower out from basic to lateral)? "
                            +"Are you standing upright and upper body oriented towards your partner? "
                        }
                    )
                }
            }

            subSection("Qualities") {
                // =====================================================================================================
                html {
                    topics(
                        Shared.AdviceQualities.MusicPartner,
                        Shared.AdviceQualities.FreeMovement,
                        Shared.AdviceQualities.FuckitMentality,
                        Shared.AdviceQualities.GrowthMindset,
                        Shared.AdviceQualities.Breathing,
                        Shared.AdviceQualities.Confidence,
                    )
                }
            }
            subSection("Mistakes") {
                // =====================================================================================================
                html {
                    topics(
                        Shared.Mistakes.RushedEntrance,
                        Shared.Mistakes.SqueezedHands,
                        Shared.Mistakes.StiffArms,
                        Shared.Mistakes.LeadingArms,
                        Shared.Mistakes.ForcedLeading,
                        Topic("Wrapped Hands Too Low") {
                            +"When being in closed position, the leader often puts is hands too low. "
                            +"Be sure to be almost in the armpits, properly covering the shoulder blades of your follower. "
                        },
                        Topic("Hopping") {
                            +"Instead of hopping up and down with every step (as a leader), keep the vertical axis still and stable."
                        },
                        Topic("Unstable Frame") {
                            +"Especially for the follower it happens, when they try to be overly sensual/feminine, that they ruin there frame. "
                            +"The upper body must stay stable, the frame maintained, and thus the sexy swinging of the hips is an isolated movement. "
                        },
                        Shared.Mistakes.LookingDown,
                        Topic("Non-Directedness") {
                            +"If we feel uncomfortable with our partner, we sometimes have the tendencies to orientate ourselves away from our partner. "
                            +"This will lead to a disconnect. Instead keep your chest/sternum straight facing your partner. "
                            +"In basic, you might face away with your head, but not with your upper body. "
                            +"In lateral, just as you do in Soltinho, rotate your upper body towards the follower."
                        },
                        Shared.Mistakes.ExpectationManagement,
                        Shared.Mistakes.DisasterAttitude,
                        Topic("Out-of-Lines") {
                            +"Followers are often not keeping their lines, not being aware of the geometry which makes the dance a game of catch and rather rushed than relaxing/enjoyable. "
                            +"There is a certain geometry, especially at the beginning. Later, the limited 90 degrees may change, yet there are clear turns, and the degrees need to be paid attention to even more. "; br

                            +"The general rule is, that leaders make space for the follower, and not the other way round. "
                            +"The leader steps out of the line, for example during Lateral/Viradinha, or simple turns."
                        },
                        Topic("Too Strong Announcements") {
                            +"It is a good idea to give the follower an announcement, before a move is going to happen, to prepare them. "
                            +"The announcement must then be also executed with such a quality that it is interpreted as such. "
                            +"A quality of soft, and slow, gentle, relaxed, as otherwise it might be interpreted as a signal for a move already (sharp, quick, direct, hard quality). "
                            +"E.g. when lifting the arm for an embrace or a bonus, it should be lifted in such a way that it doesn't impact the follower's core/spine, to not signal to move -yet. "
                        }
                    )
                }
            }
        }
    }
}
