package zouk

import common.ali
import common.externalLink
import common.sectionTitle
import common.youtube
import kotlinx.html.br
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

        sectionTitle { +"History" }
        // =============================================================================================================
        p {
            +"Do you want to know where the dance actually comes from that we are dancing? From which culture, country and background? "
            +"Have you ever wondered why it is neither Brazilian nor Zouk what we are actually dancing, still we call it that way? "; br
            +"If so, and if you want to pay your respect to the people before us who have enabled us so we can follow in their footsteps, "
            +"then it is highly recommended to watch our dear teacher's 52 minutes presentation about the history of Lambada and Zouk. "
        }
        youtube("bxmVlU8LBD8?si=p3WwLk2-_gLMpCqf", "History of Lambada & Brazilian Zouk")

        sectionTitle { +"Events" }
        // =============================================================================================================
        p { +"Schools, classes, festivals, workshops to practice and dance even more:" }
        ul {
            ali("https://www.brazilianzouk.nl", "Brazilian Zouk Netherlands", "Schools and events overview in NL")
            ali("https://www.zoukamsterdam.nl", "Brazilian Zouk Amsterdam", "The school, our school, this wiki is based on")
            ali("https://chat.whatsapp.com/L15bW47Mi2a07dqGTu0jnh", "Zouk Practice Amsterdam", "WhatsApp group to organize private sessions")
            ali("https://www.facebook.com/groups/1623478094408195/", "NL Zouk Events", "Facebook group for the Dutch Zouk community")
            ali("https://braziliandancefestival.com", "Brazilian Dance Festival", "Every year in Amsterdam with discount as a BZA student")
            ali("https://www.amsterdamzouklambada.nl", "Amsterdam Zouk Lambada", "Felipe's Wednesday classes in Amsterdam Noord")
            ali("https://www.vibelatina.net", "Vibe Latina", "Fitness, Neo-Zouk and Contemporary Dance in Amsterdam Noord")
            ali("https://www.tantraintozouk.com", "Tantra Into Zouk", "Spiritual multi-day retreats (intermediate, head moves)")
        }

        sectionTitle { +"Music" }
        // =============================================================================================================
        p { +"Some suggestions for Zouk beginners, music with a slow and clear rhythm:" }
        ul {
            li {
                +"Practice playlists from BZA: "
                externalLink("https://open.spotify.com/playlist/171AdEM6TSIyKPOMz39Y23", "60 BPM"); +", "
                externalLink("https://open.spotify.com/playlist/0U9fV6pVcT5A9eROYSw8bP", "65 BPM"); +", "
                externalLink("https://open.spotify.com/playlist/7sDZ1JAqwBrDjavlqlTfnx", "70 BPM"); +", "
                externalLink("https://open.spotify.com/playlist/5MxF7N6CqSwomkjLnvTGwf", "75 BPM")
            }
            li {
                +"Richie's social playlist: "
                externalLink("https://open.spotify.com/playlist/61URtZPgp9ZNvTn4DSWrnS", "#1"); +", "
                externalLink("https://open.spotify.com/playlist/6kiKE91kBGp4NEHmRJq5Cw", "#2"); +", "
                externalLink("https://open.spotify.com/playlist/7kosHM4EDHUPfRsDCd1w8H", "#3"); +", "
                externalLink("https://open.spotify.com/playlist/6Kz9U3y7xXHlb7ze2F2U9f", "#4"); +", ..."
                // instrumentals: https://open.spotify.com/playlist/0Xn3k2ji87ZyARgCLzdGfN
            }
            li { externalLink("https://open.spotify.com/playlist/2XE4TgKDPZBFC5B5ZGAnNt?si=nmDNpKPOQXi0u2qBimKv8w&pi=e-9vGJCCMpQlmM", "Slow Zouk"); +" Spotify Playlist" }
            li { externalLink("https://www.youtube.com/@zoukmusicbrasil/videos", "Zouk Music Brazil"); +" YouTube Channel" }
        }

        sectionTitle { +"Resources" }
        // =============================================================================================================
        p { +"Here are the links to the websites used for this wiki, along with some further reading:" }
        ul {
            ali("https://www.instagram.com/zouk_moves", "Zouk Moves", "Plenty of Instagram videos for techniques with in regular and slow speed")
            ali("https://amozouk.com/blog/7-foundational-zouk-moves-all-beginners-should-know", "Amozouk", "Foundational Zouk moves for beginners")
            ali("https://www.jettence.com/blog/names-of-brazilian-zouk-moves-in-portuguese-with-gifs/", "Jettence Moves Gifs", "Same as above, just different moves")
            ali("http://zouk-germany.com", "Zouk Germany", "Providing lots of techniques and videos")
            ali("https://www.youtube.com/watch?v=lYeU6SnPa2k&list=PLtg3wEXTYx6pDBoVcgGk2CIRA05dJytoW", "Tiago Movimentus", "A few couple of dozen tutorial videos on YouTube")
            ali("https://amozouk.com/zouk-move-dictionary", "Amozouk's move dictionary", "A list of technique names and short descriptions")
            ali("https://www.youtube.com/@VdanceClubSchool/videos", "VdanceClub", "Latin dances and general dance information")
        }
    }
