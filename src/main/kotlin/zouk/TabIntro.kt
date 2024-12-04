package zouk

import common.externalLink
import common.sectionTitle
import kotlinx.html.a
import kotlinx.html.b
import kotlinx.html.h2
import kotlinx.html.h3
import kotlinx.html.li
import kotlinx.html.p
import kotlinx.html.ul
import tabs.Tab
import tabs.tab

@Suppress("UnusedReceiverParameter")
val ZoukTabs.introduction: Tab
    get() = tab("Introduction") {
        p {
            +"Based on what has been taught and learned from "
            externalLink("https://www.zoukamsterdam.nl", "Zouk Amsterdam")
            +" primarily from a leader's perspective, to help you keep track of all (the names of) the moves."
        }
        p {
            +"Note about usage of "; b { +"terminology" }; +" to indicate beat sounds: "
            +"The word \"slow\" "
            +"(first sound in a beat, usually a base-drum, also sometimes the onomatopoeia \"boom\" is used) "
            +"and the word \"quick\" "
            +"(2nd and 3rd sound in a typical Zouk beat, usually a snare-drum, also sometimes referred to as \"chic\"). "
            +"A beat (or \"block\" if you so want), is thus composed of: \"slow - quick - quick\" or \"boom - chic - chic\"."
        }

        sectionTitle { +"Socials" }
        // =============================================================================================================
        p { +"The guidelines for social events are printed out and put on the bar at our school, yet here they are again:" }
        ul {
            li { +"In our community, we give each other honest "; b {+"feedback"}; +" and talk things through." }
            li { +"We value "; b{+"hygiene"}; +", good smells, and fresh shirts." }
            li { +"We "; b{+"approach"}; +" each other to ask for a dance, are free to say \"yes\" and \"no\" and stop the dance if we feel to do so." }
            li { +"We "; b{+"start slowly"}; +" with a new partner, maybe weight shift to more complex techniques, going through a mental checklist, building it up, and sketching a picture." }
            li { +"We feel free to share our experienced qualities after the dance, communicate our boundaries, and in case needed, talk to the organizers for support." }
        }

        sectionTitle { +"Music" }
        // =============================================================================================================
        p { +"Some suggestions for Zouk beginners, music with a slow and clear rhythm:" }
        ul {
            li {
                +"Practice playlists from Zouk Amsterdam: "
                externalLink("https://open.spotify.com/playlist/171AdEM6TSIyKPOMz39Y23", "60 BPM"); +", "
                externalLink("https://open.spotify.com/playlist/0U9fV6pVcT5A9eROYSw8bP", "65 BPM"); +", "
                externalLink("https://open.spotify.com/playlist/7sDZ1JAqwBrDjavlqlTfnx", "70 BPM"); +", "
                externalLink("https://open.spotify.com/playlist/5MxF7N6CqSwomkjLnvTGwf", "75 BPM")
            }
            li { externalLink("https://open.spotify.com/playlist/2XE4TgKDPZBFC5B5ZGAnNt?si=nmDNpKPOQXi0u2qBimKv8w&pi=e-9vGJCCMpQlmM", "Slow Zouk"); +" Spotify Playlist" }
            li { externalLink("https://www.youtube.com/@zoukmusicbrasil/videos", "Zouk Music Brazil"); +" YouTube Channel" }
        }

        sectionTitle { +"Resources" }
        // =============================================================================================================
        p { +"Here are the links to the websites used for this wiki, along with some further reading:" }
        ul {
            li { externalLink("https://amozouk.com/blog/7-foundational-zouk-moves-all-beginners-should-know", "Amozouk")
                +" - Foundational Zouk moves for beginners" } // TODO soltinho, boomerang
            li { externalLink("http://zouk-germany.com", "Zouk Germany")
                +" - With lots of techniques and videos" }
            li { externalLink("https://www.youtube.com/watch?v=lYeU6SnPa2k&list=PLtg3wEXTYx6pDBoVcgGk2CIRA05dJytoW", "Tiago Movimentus")
                +" - A few couple of dozen tutorial videos on YouTube" } // TODO watch and incorporate
            li { externalLink("https://amozouk.com/zouk-move-dictionary", "Amozouk's move dictionary")
                +" - With a list of technique names and short descriptions" }
        }
    }
