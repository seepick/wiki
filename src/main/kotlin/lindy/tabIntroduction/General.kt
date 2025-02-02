package lindy.tabIntroduction

import common.image
import kotlinx.html.*
import tabs.SectionedTabDsl

fun LindyIntroductionSections.general(dsl: SectionedTabDsl) {
    with(dsl) {
        section("General") {
            content {
                p {
                    +"A journal based on what has been taught and learned from "; a("https://swingphilosophy.com") { +"Swing Philosophy" }; +", "
                    +"to help keep track of all the names of all the moves (to help practice outside of the schools) and simply reflect and gather experiences. "; br
                    i { +"Disclaimer" };+": For practical reasons and the sake of simplicity, the leader role is considered male (him) and the follower role female (her). "; br
                }
            }
            subSection("History") {
                content {
                    p {
                        +"Lindy Hop is an African American dance, which started in New York, Harlem during the late 1920s in conjunction with swing jazz."
                        +"Its predecessor is Charleston (timing, footwork), its successor is Rock'n'Roll."; br
                        +"It is not entirely clear when and how ";b { +"the name" };+" was coined. "
                        +"Legends states that the pilot's nickname, who first did a transatlantic flight was \"Lindy\", and he \"hopped\" overseas. "
                        +"Once a dancer was asked what he was doing, he quickly replied based on that headline: \"Lindy Hop\"."
                    }
                    image("images/lindbergh_hops.jpg", 500 to 500, "Lindbergh hops newspaper headline")
                }
            }
            subSection("Socials") {
                content {
                    p { +"Some generals remarks to consider when joining a social dance event:" }
                    ul {
                        li { +"In our community, we give each other honest ";b { +"feedback" };+" and talk things through." }
                        li { +"We value ";b { +"hygiene" };+", good smells, and fresh shirts." }
                        li { +"We ";b { +"approach" };+" each other to ask for a dance, are free to say \"yes\" and \"no\" and stop the dance if we feel to do so." }
                        li {
                            +"We ";b { +"start slowly" };+" with a new partner, maybe weight shift to more complex techniques. "
                            +"Going through a mental checklist, building it up, and sketching a picture."
                        }
                    }
                }
            }
            subSection("Equipment") {
                content {
                    image("images/shoes.png", 300 to 166, "Beyer dance shoes")
                    ul {
                        li {
                            +"Most important is that your ";b { +"shoes" };+" don't have too much grip. "
                            +"Something that is maybe useful for some other movement practices, but with Lindy Hop, we want to be able to turn and twist on the ground. "
                            +"When there is too much grip, a lot of force will be exerted on your knee joints, which they will not like, at all! "
                            +"Flat sole without a profile, or even a leather sole (which your favorite shoemaker can attach) should give you the \"slideyness\" necessary to remove any friction while hopping."
                        }
                        li {
                            +"The community (especially at socials) can be perceived as having \"costume festivals\", warping themselves back in time. "
                            +"Back to ";b { +"1920's" };+", wearing clothes typical for that era."
                        }
                    }
                }
            }
        }
        section("Resources") {
            subSection("Music") {
                content {
                    ul {
                        li { a("https://open.spotify.com/playlist/78dBYR3ro1G7COwKpaN4Tr") { +"Charleston Spotify Playlist" }; +" - from our dear teacher Lucia" }
                    }
                }
            }
            subSection("Videos") {
                content {
                    ul {
                        li { a("https://www.youtube.com/watch?v=sK-M65nrY_8&list=PLfJQ9eiHSrcTe-PKbQHh1r6PMYuaXq4oM&index=1") { +"iLindy 6-count" }; +" - A YouTube playlist with 14 videos" }
                        li { a("https://www.youtube.com/watch?v=U9yKEnewTas") { +"Very basic 6-count-step" }; +" - A 12mins YouTube video by Laura Glaess" }
                        li { a("https://www.youtube.com/@idancedotnet/search?query=lindy") { +"idancedotnet" }; +" - A YouTube channel with plenty of short clips" }
                        li { a("https://www.youtube.com/watch?v=oOlm0vKMtKc") { +"SwingStep intro class" }; +" - A full, free, 1 hour recording for total beginners" }
                        li { a("https://youtu.be/AI-PBivz9Kc") { +"Everything Remains" }; +" - A documentary about the history of HipHop dance and Swing." }
                    }
                }
            }
        }
    }
}
