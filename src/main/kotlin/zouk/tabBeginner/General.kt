package zouk.tabBeginner

import common.Topic
import common.topics
import common.youtube
import kotlinx.html.*
import shared.AdvicePartner
import shared.AdviceQualities
import shared.AdviceTechnical
import shared.Mistakes
import shared.Shared
import shared.Terminology
import tabs.SectionedTabDsl

fun ZoukBeginnerSections.general(dsl: SectionedTabDsl) {
    with(dsl) {
        section("General") {
            subSection("Connection") {
                // =====================================================================================================
                html {
                    p {
                        +"There are three types of connecting to your partner:"
                    }
                    ul {
                        li {
                            b { +"Close" };+": Leader hands on the back (usually shoulder blades, or more embraced) and elbows slightly pushed up and outwards. "
                            +"Follower rest on partner's body depending on distance (usually outside upper arms, or around neck/shoulders if closer)."
                        }
                        li { b { +"Open" };+": Hold each other's hands with a loose grip, applying no pressure with the thumbs." }
                        li { b { +"Mixed" };+": One side closed, and the other is open." }
                    }
                    youtube("dy2gSclrzSs?si=YSdm1nVn_TgweYgX", "The different connecting styles")
                }
            }
            subSection("Overview") {
                // =====================================================================================================
                html {
                    p { +"Here a video showing all the movements learned during the level 1 beginner course." }
                    youtube("VllfJOm_3O8?si=aLpdPJKnrKRu4Mu6", "All the movements from Level 1")
                }
            }
        }
    }
}
