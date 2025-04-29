package zouk.tabGeneral

import common.Topic
import common.topics
import kotlinx.html.b
import kotlinx.html.br
import kotlinx.html.p
import shared.AdvicePartner
import shared.AdviceQualities
import shared.AdviceTechnical
import shared.Mistakes
import shared.Shared
import tabs.SectionedTabDsl


fun ZoukGeneralSections.advice(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Advice") {
            subSection("Partnered Up") {
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
                        Topic("Distance") {
                            +"Find a comfortable distance with your partner, it's also fine to just ask explicitly when in doubt. "
                            +"Just don't rush it right away, and slowly adjust distance and be very sensitive to the response you get. "
                        },
                        Topic("Arm Position/Grip") {
                            +"Leaders keep your ";b { +"arms up" };+", so that the follower can rest upon them, as it helps to maintain a better connection. "
                            +"Also have a firm, yet ";b { +"soft grip" };+", on torso and shoulders, as it helps with sending a clear intention."
                        },
                    )
                }
            }

            subSection("Subtle Qualities") {
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
                        Shared.Mistakes.SqueezeHands,
                        Shared.Mistakes.StiffArms,
                        Shared.Mistakes.LeadingArms,
                        Shared.Mistakes.ForcedLeading,
                        Topic("Wrapped Shoulder Blades") {
                            +"When being in closed position, the leader often puts is hands too low. "
                            +"Be sure to be almost in the armpits, properly covering the shoulder blades of your follower. "
                        },
                        Topic("Hopping") {
                            +"Instead of hopping up and down with every step (as a leader), keep the vertical axis still and stable."
                        },
                        Shared.Mistakes.LookingDown,
                        Shared.Mistakes.ExpectationManagement,
                        Shared.Mistakes.RecoveryAttitude,
                    )
                }
            }
            subSection("Attitude") {
                // =====================================================================================================
                html {
                    p {
                        +"To prepare for the social event, you can apply different ";b { +"styles" };+" "
                        +"(speed, energy) and enabling you to only use a few techniques, yet enrich them with some diversity. "; br
                        +"We practice giving each other ";b { +"feedback" };+" after the dance how we experienced the dance in terms "
                        +"of qualities, such as: Tense, slow, tender, fast-paced, ... "; br
                        +"We also play with inviting and recognizing an appropriate ";b { +"distance" };+", letting the follower "
                        +"come by opening up, inviting space to come as close as desired, not using any force and respecting each other's comfort zone ."
                    }
                    p {
                        +"Also learn how to ";b { +"soften" };+" a bit and tap into the more subtle qualities of a partner dance. "
                        +"Simple things like the qualities of expansion and contraction, but also the fundamental source of relaxation: the ";b { +"breath" };+". "
                        +"Doing a quick ";b { +"body scan" };+", dropping the chest, bending the knees. "
                        +"When dancing with a new/unknown partner, or the unknown happens, instead of tensing up, simply let go, relax, and recover."; br
                        +"Speaking of ";b { +"unknown partner" };+": Before immediately and right away start dancing, first establish "
                        +"eye contact, say \"hi\", smile, and give it a few moments to connect; groove on the beat, "
                        +"and then slowly build up the technical moves. "
                    }
                    p {
                        +"Find a mutually preferred level of intimacy between you and your partner. "
                        +"Be conscious about the subtle signals you get from her and find the proper distance there. "
                        +"Sometimes \"boob grazing\" happens, and as long as it wasn't intentionally, your follower won't have any issue with it. "
                        +"If, as a follower, you feel it happens intentional, address it and ask directly. "
                    }
                }
            }
        }
    }
}
