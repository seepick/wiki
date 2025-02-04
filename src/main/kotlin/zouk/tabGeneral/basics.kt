package zouk.tabGeneral

import common.Topic
import common.topics
import kotlinx.html.b
import kotlinx.html.li
import kotlinx.html.p
import kotlinx.html.ul
import shared.Shared
import shared.Terminology
import tabs.SectionedTabDsl

fun ZoukGeneralSections.basics(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Basics") {
            subSection("Socials") {
                // =============================================================================================================
                html {
                    p { +"The guidelines for social events are printed out and put on the bar at our school, yet here they are again:" }
                    ul {
                        li { +"In our community, we give each other honest "; b { +"feedback" }; +" and talk things through." }
                        li { +"We value "; b { +"hygiene" }; +", good smells, and fresh shirts." }
                        li { +"We "; b { +"approach" }; +" each other to ask for a dance, are free to say \"yes\" and \"no\" and stop the dance if we feel to do so." }
                        li { +"We "; b { +"start slowly" }; +" with a new partner, maybe weight shift to more complex techniques, going through a mental checklist, building it up, and sketching a picture." }
                        li { +"We feel free to share our experienced qualities after the dance, communicate our boundaries, and in case needed, talk to the organizers for support." }
                    }
                }
            }
            subSection("Terminology") {
                html {
                    topics(
                        Shared.Terminology.frame,
                        Topic("Onomatopoeia") {
                            +"When we want to indicate beat sounds, we use the word \"slow\" "
                            +"(first sound in a beat, usually a base-drum, also sometimes the onomatopoeia \"boom\" is used) "
                            +"and the word \"quick\" "
                            +"(2nd and 3rd sound in a typical Zouk beat, usually a snare-drum, also sometimes referred to as \"chic\"). "
                            +"A beat (or \"block\" if you so want), is thus composed of: \"slow - quick - quick\" or \"boom - chic - chic\"."
                        }
                    )
                }
            }
        }
    }
}
