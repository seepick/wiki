package zouk.tabGeneral

import common.Topic
import common.topics
import kotlinx.html.b
import kotlinx.html.br
import kotlinx.html.i
import shared.AdvicePartner
import shared.AdviceQualities
import shared.AdviceTechnical
import shared.Mistakes
import shared.Shared
import tabs.SectionedTabDsl


fun ZoukGeneralSections.advice(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Advice") {
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
                        Shared.AdviceTechnical.Engagement,
                        Shared.AdviceTechnical.InvitingArm,
                        Shared.AdviceTechnical.SoftStrong,
                        Topic("Round Movements") {
                            +"Always make all the movements round for the follower, smoothing out the edges and sharp corners. "
                            +"Do that when changing direction, or initiating any technique. "
                            +"Think about it like in music fading in and fading out, to create a -predictable- transition. "
                            +"It's like announcing it a bit upfront, so there will be no unexpected surprise, "
                            +"which might lead to a shock sensation instead of making the experience more enjoyable."
                        },
                        Topic("Yin-Yang") {
                            +"Before doing one, always do the other a little bit first. "
                            +"When wanting to go right, first go a bit left. "
                            +"At beginning for example, before stepping back, step slightly a bit forward, using your breath. "
                            +"Avoid a shock to the nervous system by abrupt movements, making it your techniques smoother and more predictable. "
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
                        Shared.Mistakes.ExpectationManagement,
                        Shared.Mistakes.DisasterAttitude,
                        Topic("Out-of-Lines") {
                            +"Followers are often not keeping their lines, not being aware of the geometry which makes the dance a game of catch and rather rushed than relaxing/enjoyable. "
                            +"There is a certain geometry, especially at the beginning. Later, the limited 90 degrees may change, yet there are clear turns, and the degrees need to be paid attention to even more. "; br

                            +"The general rule is, that leaders make space for the follower, and not the other way round. "
                            +"The leader steps out of the line, for example during Lateral/Viradinha, or simple turns."
                        }
                    )
                }
            }
        }
    }
}
