package zouk.tabBeginner

import common.image
import common.ref
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl
import zouk.ZoukRef

fun ZoukBeginnerSections.general(dsl: SectionedTabDsl) {
    with(dsl) {
        section("General") {
            subSection("Connection") {
                // =====================================================================================================
                html {
                    p {
                        +"There are three types of positions to connect to your partner, all of them facing each other (using basic step):"
                    }
                    ul {
                        li {
                            b { +"Close" };+": Leader hands on the back (fingers on the shoulder blades, base of the palm on the latissimus dorsi, or more embraced/hugged) and elbows slightly pushed up and outwards. "
                            +"Follower rest on partner's body depending on distance. "
                            +"Either elbows rest their weight on the leader's outside (to be able to push) arms, hands relaxed, or around the neck/shoulders if standing closer. "
                        }
                        li {
                            b { +"Open" };+": Hold each other's hands with a loose grip, applying no pressure with the thumbs. "
                            +"The arm is relaxed (like a noodle), the hand slightly active, bent and pushed upwards against the follower's. "
                        }
                        li {
                            b { +"Mixed" };+": One side closed, and the other is open. "
                            +"For the leader, the left is relaxed (noodly) and the right is active and up and out, a base for the follower. "
                        }
                    }
                    p {
                        +"Thus, these connection positions indicate more the distance and the connection of the arms. "
                        +"You could consider the position of the ";ref(ZoukRef.Viradinha);+" as a \"half-open\" position, being side-by-side."
                    }
                    youtube("dy2gSclrzSs?si=YSdm1nVn_TgweYgX", "Establishing the initial connection in closed position")
                    youtube("1rhvL0EEMOU?si=xhM-GmxmlFVMEeM9", "How to connect and start into the basic from a mixed position")
                    p {
                        +"We usual stand ";b{+"frontal"};+" to each other, slightly offset to occupy different lines for footwork, more left to each other. "
                        +"When getting closer, the leader turns slightly out (to the left), so his genitals won't accidentally rub on the follower's leg, and her breasts are avoided of touch. "
                    }
                    image("images/offset_positions.jpg", 350 to 222, "Occupying different lines in offset position")
                    p {
                        +"When both stand next to each other, facing the ";b{+"same direction"};+", as for example happens during the ";ref(ZoukRef.Viradinha);+", "
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
                    p { +"And here a demonstration how Zouk can look like at the end :) " }
                    youtube("cwtCbQYnVQo?si=2QAzT7jcMylJTzSZ", "Cedric and Romane demonstration 2024")
                }
            }
        }
    }
}
