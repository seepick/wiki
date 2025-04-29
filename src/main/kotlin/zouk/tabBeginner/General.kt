package zouk.tabBeginner

import common.Topic
import common.ref
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
import zouk.ZoukRef

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
                    p {
                        +"When both stand next to each other, facing the same direction, as for example happens during the ";ref(ZoukRef.Viradinha);+", "
                        +"the hand slides a bit further \"into\" the back. "
                        +"Watch out that the base of the middle finger is on the inferior angle of the scapula sinister, thus the fingers touching the rhomboids."
                        +"The leader's arm changing its shape from an embrace to a \"open door\" gesture. "
                    }
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
