package zouk.tabPreadvanced

import common.ref
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl
import zouk.ZoukRef

fun ZoukPreadvancedSections.styling(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Styling") {
            subSection("Head Movements") {
                html {
                    youtube("UN52iFqLLL8?si=9wLTJ5K_DhdYBu2M", "5 minutes explanation and demonstration of possible application and combination")
                    p {
                        +"For the start, it is nice to explore more elaborate head movements while either doing the ";ref(ZoukRef.Balao);+", ";ref(ZoukRef.Rotisserie);+" or a Tilted Turn. "; br
                        +"In general, the followers need to take good care for their lower backs, by initiating the movement more from the just, and keeping the core firm. "
                        +"The followers also continue what has been done most recently, even if there is no contact and nothing new being led; just keep on going. "
                        +"The hand contact is either with open palms against each other with a slight pressure, or with a \"fingers in cup\" position for easy rotation within. "; br
                        +"And as usual, the leader leads by example, meaning: Lead by moving your own body and communicate it through the frames into the other body. "
                        +"Also don't give too much input, as this will otherwise unbalance the follower (and taking away her autonomy). "
                    }
                    p {
                        +"It is possible to lead these movements in close contact from the shoulder, by going around the follower, and slide your hand diagonally across her back on top of the shoulder. "
                        +"Watch out for the correct timing: For example, to not scoop too late when announcing/leading a rotisserie, while being in a tilted turn. "
                    }
                }
                subSubSection("Tilted Turn") {
                    html {
                        p {
                            +"While doing head movements (Balao), the follower can stay on one side with the head, in our example the left side, "
                            +"and when turning clockwise (to the right), the right foot maintains a pivot point and rotating around it. "
                            +"It is common to do multiple ones after each other, but a single one is sufficient. "
                        }
                        p {
                            +"As always, the leader is one step ahead, and especially with these moves. "
                            +"The Rotisserie for example starts when the follower's head is to the front, thus the leader initiates when her head is to the left (assuming the default clockwise direction). "
                            +"So too here for the tilted turn: We start when the follower's head is to the back so the move starts when it is on the left side. "
                        }
                    }
                }
            }
        }
    }
}
