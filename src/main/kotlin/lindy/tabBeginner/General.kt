package lindy.tabBeginner

import common.Topic
import common.topics
import kotlinx.html.*
import shared.AdvicePartner
import shared.AdviceQualities
import shared.AdviceTechnical
import shared.Mistakes
import shared.Shared
import shared.SharedAdvicePartner.BodyDifferences
import shared.Terminology
import tabs.SectionedTabDsl

fun LindyBeginnerSections.general(dsl: SectionedTabDsl) {
    with(dsl) {
        section("General") {
            subSection("Information") {
                // =====================================================================================================
                subSubSection("Terminology") {
                    html {
                        topics(
                            Topic("Bounce") {
                                +"The importance of keeping a continuous, clear bounce cannot be overestimated. "
                                +"It is the one and only thing that keeps the dance alive, like the heart beating to keeping us alive. "
                                +"It also helps to maintain the connection with your partner, to (obviously) stay on-beat, and it simply helps to make the moves easier smoother. "
                            },
                            Topic("Hands") {
                                +"Leader palm facing up, follower resting inside, with 4 fingers having a sponge-spring quality. "
                                +"They are connected to the frame and have enough tension so there is no need to squeeze them. "
                                +"\"Shape locks together\", like LEGO hands, hooking; a firm shape which can also be pushed into/pull from. "
                                +"The thumbs are free (don't squeeze them!), and the arms (holding the hands) are totally relaxed, hanging like noodles. "
                                +"Alternatively, there is a ballroom hand position, fingers pointing up, like a two-right-hands-handshake in standard dances. "
                                +"The crossed-hand position has both using the same hand in a handshake position but without using the thumb. "
                            },
                            Shared.Terminology.frame,
                            Topic("Rhythms") {
                                +"The most basic patterns are: 6-count and 8-count basic, whereas later there can be many variations; same goes for charleston. "
                            },
                            Topic("Style") {
                                +"Considering it's an African diasporic dance, it's more lively, and less upright ballroom European stiff. "
                                +"It's danced to big band jazz with a lot of bouncy energy. "
                            },
                            Topic("Footwork") {
                                +"Staying in place, traveling (default), moving in/out (rock-step with lateral)."
                            },
                            Topic("Connection") {
                                +"We have an elastic connection, which can stretch, like a rubber band or bamboo. "
                                +"This compression can happen on both arms, the one where the hands touch, or the arm connects to the back. "
                                +"The pressure builds up gradually, slowly (instead of sharply which can come as a surprise). "
                                +"The limbs are connected to the frame, strong yet soft and not hard/rigid or collapsed/unstable. "
                            },
                        )
                    }
                }
            }
            subSection("Advice") {
                // =====================================================================================================
                subSubSection("Partnered Up") {
                    html {
                        topics(
                            Topic("Body Language") {
                                +"To better lead, enhance the signals you give via your body language. "
                                +"Never underestimate the importance of leaning (forward/backward), shifting your weight (fully), and moving the whole body (as a unit). "
                                +"The embracing arm should give an \"elastic signal\" and the upper arms are connected/touching without a gap."
                            },
                            Shared.AdvicePartner.GentleLeader,
                            Shared.AdvicePartner.Inertia,
                            Shared.AdvicePartner.BackLeading,
                            Shared.AdvicePartner.NonAnticipation,
                            Shared.AdvicePartner.BodyDifferences,
                            Shared.AdvicePartner.Feedback,
                            Shared.AdvicePartner.Honesty,
                        )
                    }
                }
                subSubSection("Technical") {
                    html {
                        topics(
                            Topic("Verbalizing") {
                                +"When having difficulties with your steps, try verbalizing, making sounds with the rhythm. "
                                +"It's really a thing to help you keep track and establish a mind-body connection. "
                                +"Either counting with numbers, or saying \"quick quick slow\" / \"rock-step tripple tripple\". "
                                +"Or be more creative with something like \"shroom-bap-bom-de-bap\". "
                            },
                            Topic("Musical") {
                                +"Listen to music follow the 4/8th pattern, the melody and keep your moves in sync with it. "
                                +"Even better to keep in sync with the overall loop of the melody, having to add or shortcut some beats. "
                            },
                            Shared.AdviceTechnical.Engagement,
                            Shared.AdviceTechnical.InvitingArm,
                            Shared.AdviceTechnical.SoftStrong,
                        )
                    }
                }
                subSubSection("Subtle Qualities") {
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
                subSubSection("Mistakes") {
                    html {
                        topics(
                            Shared.Mistakes.RushedEntrance,
                            Shared.Mistakes.SqueezeHands,
                            Shared.Mistakes.StiffArms,
                            Shared.Mistakes.LeadingArms,
                            Shared.Mistakes.ForcedLeading,
                            Shared.Mistakes.LookingDown,
                            Shared.Mistakes.ExpectationManagement,
                            Shared.Mistakes.RecoveryAttitude,
                            Topic("Wrong Bounce") {
                                +"Bouncing upwards, almost hopping, or not bouncing at all, instead of bouncing down into the ground. "
                            },
                            Topic("Follower's Hand") {
                                +"Having the hand on top of the ";b { +"leader's shoulder" };+", instead of on the back. "
                            },
                            Topic("Footwork") {
                                +"Lead with your center, not with the legs; also make smaller rock-steps, staying within your center. "
                                +"Don't just make steps with your legs while your whole body stays stationary (disconnection). "
                                +"Steps are done due to shifting weight, which is due to moving the center. "
                            }
                        )
                    }
                }
            }
            subSection("Positioning") {
                // =====================================================================================================
                subSubSection("Closed Position") {
                    html {
                        p {
                            +"The closed-position is called that way, because the partners are ";b { +"standing closer" };+" to each other. "
                            +"The shoulders are \"side-by-side\", which also is one of its synonyms. "
                            +"We stand a bit in a V-shape, facing inwards towards each other, and not totally frontal to the front. "
                        }
                        p {
                            +"The leader has his ";b { +"arm" };+" all around the back around ";b { +"waist" };+", or a bit higher up, on the back. "
                            +"The follower has her hand on the ";b { +"shoulder blade" };+" which is closer to her. "
                            +"Depending on the ";b { +"height/size difference" };+", it might need to move somewhere else on the back, or even onto the upper arm. "
                            +"It is not on top of the leader's shoulder. "
                            +"Also pay attention that the arms have a connection so that there is ";b { +"no gap" };+" in between. "
                        }
                    }
                }
                subSubSection("Open Position") {
                    html {
                        p {
                            +"During the open-position, the partners stand in front of each other, further away, thus open. "
                            +"We usually immediately switch into the 6-count basic, as everything else might be too unclear to lead. "
                            +"The basic-step can be either done in the same or in the opposite direction. "
                        }
                        p {
                            +"The leaders left ";b { +"hand" };+" (palm upwards, fingers inwards) holds the followers right hand (palm downwards, fingers also inwards)."
                            +"The connecting arm is very relaxed, really hanging down. "
                            +"This is in contrast to the free arm, which act's like a \"wing\": Always up, hip height, ready for action. "
                            +"It is used to give directions to the follower when wanting to travel for example."; br
                            +"You can also change your hand, as a leader use the right (instead of the left) hand and have them in a \"shake hand position\" but without using the thumbs!"; br
                            +"In the closed-position the hand-connection is optional, during the open-position it is (more) mandatory, as it is the only (physical) connection."
                        }
                        p {
                            +"Dare to ";b { +"play around" };+" in the open position, be creative, explore and research freely, there is a lot possible here. "
                            +"Travel around, change places by passing by either left or right (keep the arm low), or do a turn by lifting the arm, to make the difference really clear. "
                            +"Sometimes a change in direction/traveling can be misinterpreted as a pass-by... well, it's ok :)"
                        }
                    }
                }
            }
        }
    }
}
