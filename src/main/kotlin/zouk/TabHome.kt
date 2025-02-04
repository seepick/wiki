package zouk

import common.externalLink
import common.sectionTitle
import kotlinx.html.b
import kotlinx.html.div
import kotlinx.html.img
import kotlinx.html.li
import kotlinx.html.p
import kotlinx.html.ul
import tabs.Tab
import tabs.tab

@Suppress("UnusedReceiverParameter")
val ZoukTabs.home: Tab
    get() = tab("Home") {
        p {
            +"Based on what has been taught and learned from "
            externalLink("https://www.zoukamsterdam.nl", "Zouk Amsterdam")
            +" primarily from a leader's perspective, to help you keep track of all (the names of) the moves."
        }
        div("center") {
            img(src = "tile.png", alt="Brazilian Zouk Couple") {
                width = "184"
                height = "251"
            }
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
                +" - Foundational Zouk moves for beginners" }
            li { externalLink("http://zouk-germany.com", "Zouk Germany")
                +" - With lots of techniques and videos" }
            li { externalLink("https://www.youtube.com/watch?v=lYeU6SnPa2k&list=PLtg3wEXTYx6pDBoVcgGk2CIRA05dJytoW", "Tiago Movimentus")
                +" - A few couple of dozen tutorial videos on YouTube" }
            li { externalLink("https://amozouk.com/zouk-move-dictionary", "Amozouk's move dictionary")
                +" - With a list of technique names and short descriptions" }
        }
    }
