package contact.tabGeneral

import common.ali
import common.externalLink
import kotlinx.html.*
import tabs.SectionedTabDsl

private fun UL.bookItem(title: String, url: String, by: String, label: String? = null) {
    li {
        i { a(url, target = "_blank") { +title }; +" by $by" }
        if (label != null) {
            br
            +label
        }
    }
}

fun ContactGeneralSections.resources(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Resources") {
            html {
                p {
                    +"The content of the book might not have been enough for your mental thirst for information and insight. "
                    +"If this is the case, the following collection of further resources will hopefully leave you with a greater satisfaction."
                }
            }
            subSection("Practice") {
                html {
                    p {
                        +"In case you are looking to practice (classes, workshops, festivals) anywhere in the world, check out the "
                        a("https://ciglobalcalendar.net") { +"CI global calendar" }; +". "
                        +"Other well-known international teachers includes: ";externalLink("https://www.facebook.com/KatriLuukkonen", "Vega Luukkonen")
                        +", "; externalLink("https://www.facebook.com/arye.bursztyn", "Arye Bursztyn")
                        +", and "; externalLink("https://bennovoorham.com/", "Benno Voorham"); +"."
                    }
                    p {
                        +"If you need something more close to the ";b{+"Netherlands"};+", lookup the community calendar "
                        a("https://amsterdamjam.nl") { +"Amsterdam Jam" }; +". "
                        +"In case you are near Amsterdam you can also go directly to "; a("https://tomgoldhand.com") { +"Tom Goldhand" }; +"."
                    }
                    // festivals in europe:
                    // France
                    // Ibiza Contact Festival
                    // Italy Contact Festival
                    // Israel Contact Festival
                    // Freiburg
                    // Ukraine Festival of Contact Improvisation
                    // https://kontaktland.com hungary
                }
            }
            subSection("Books") {
                html {
                    p { +"There are about less than a dozen (good) books written specifically about CI:" }
                    ul {
                        bookItem(
                            title = "Sharing the Dance: Contact Improvisation and American Culture",
                            url = "https://www.amazon.com/Sharing-Dance-Improvisation-Directions-Anthropological/dp/0299124444",
                            by = "Cynthia J. Novack",
                            label = "A good book about the history of the form, origins and stories",
                        )
                        bookItem(
                            title = "Caught Falling: The Confluence of Contact Improvisation",
                            url = "https://www.amazon.com/Caught-Falling-Confluence-Contact-Improvisation/dp/0937645095",
                            by = "Nancy Stark Smith",
                        )
                        bookItem(
                            title = "Contact Improvisation: An Introduction to a Vitalizing Dance Form",
                            url = "https://www.amazon.com/Contact-Improvisation-Introduction-Vitalizing-Dance/dp/0786426470",
                            by = "Cheryl Pallant",
                        )
                        bookItem(
                            title = "Contact Improvisation: Moving, Dancing, Interaction",
                            url = "https://www.amazon.com/Contact-Improvisation-Dancing-Interaction-Introduction/dp/1841261386",
                            by = "Thomas Kaltenbrunner",
                        )
                        bookItem(
                            title = "Contact Improvisation and Body-Mind Centering: A Manual for Teaching and Learning Movement",
                            url = "https://www.amazon.com/Improvisation-Body-Mind-Centering-Teaching-Learning/dp/0976044900",
                            by = "Annie Brook",
                        )
                        bookItem(
                            title = "Taken by Surprise: A Dance Improvisation Reader",
                            url = "https://www.amazon.com/Taken-Surprise-Dance-Improvisation-Reader/dp/0819566489",
                            by = "Ann Cooper Albright and David Gere",
                        )
                        bookItem(
                            title = "Dancing Deeper Still: The Practice of Contact Improvisation",
                            url = "https://www.amazon.com/Dancing-Deeper-Still-Practice-Improvisation/dp/1775243044",
                            by = " Martin Keogh",
                            label = "Insightful, from poetic-abstract, to pragmatic-enumerated, and a teacher's experiences.",
                        )
                        bookItem(
                            title = "Gravity",
                            url = "https://contredanse.org/en/product/gravity/",
                            by = "Steve Paxton",
                            label = "A rather short and more abstract, artistic, book, like a journal of some thoughts.",
                        )
                    }
                }
            }
            subSection("Videos") {
                html {
                    p {
                        +"It is highly recommended to watch \"";b { +"the classics" };+"\" once in a while. "
                        +"This will help you to regularly check your understanding of the roots of CI or simply to get inspired to continue your practice. "
                        +"Unfortunately, most videos are behind a pay wall by Videoda (Contact Collaborations) but a few can still be found on YouTube for free. "
                        +"Historical videos from the years 1972 until 1983, like: Magnesium, Chute, Peripheral Vision, Soft Pallet, Contact at 10th, and Fall After Newton. "
                    }
                    ul {
                        ali(
                            // or: https://www.youtube.com/watch?v=9FeSDsmIeHA
                            url = "https://www.youtube.com/watch?v=RRwQdkgaiMs",
                            label = "Chute - The Invention of CI - 1972",
                            text = "When a group of people came together to investigate CI",
                        )
                        ali(
                            // or: https://www.youtube.com/watch?v=k768K_OTePM + https://www.youtube.com/watch?v=_iGtJSxNUpI + https://www.youtube.com/watch?v=vMj3Coktu40
                            url = "https://www.youtube.com/watch?v=9tS3OVsPk6A",
                            label = "Fall After Newton - 1987",
                            text = "10 years of practice of Steve Paxton and Nancy Stark Smith",
                        )
                    }
                    p {
                        +"To find more recent ";b { +"inspiration" };+", here are some arbitrary, hand-picked videos to watch on a rainy "
                        +"Sunday afternoon you might find worth the time:"
                    }
                    ul {
                        ali(
                            url = "https://youtu.be/hlIRjfto7o0",
                            label = "Life Lessons Learned Through Contact Improvisation",
                            text = "TEDx showing the CI-life connection",
                        )
                        ali(
                            url = "https://youtu.be/FPwjDE6kBD4",
                            label = "Artem Markov & Sasha Dodo",
                            text = "Jam recording from December 2022, in Chiang Dao, Thailand",
                        )
                        ali(
                            url = "https://youtu.be/JgXy4LH7Khs",
                            label = "Irene Sposetti & Serafima Darova",
                            text = "Performance recording from April 2016, in Goa, India",
                        )
                        ali(
                            url = "https://youtu.be/Z_pV3s2UMSE",
                            label = "Martin Keogh & Ray Chung",
                            text = "Performance recording from 2001 in Freiburg, Germany",
                        )
                        ali(
                            url = "https://youtu.be/n1D9RU2GbBo",
                            label = "Gogolfest 2016 Contact Improvisation",
                            text = "Aspiring, fun, theatrical, skilled performance",
                        )
                        ali(
                            url = "https://youtu.be/H8JiB2Nv5Qo",
                            label = "A couple of basic exercises",
                            text = "Something to practice by yourself as a beginner",
                        )
                        ali(
                            url = "https://youtu.be/_82Od5NM4LI",
                            label = "Steve Paxton Talking Dance",
                            text = "The creator of CI giving a thorough talk about dancing, 2015",
                        )
                    }
                }
            }
            subSection("Websites") {
                html {
                    p { +"A list of websites I found worth mentioning here to direct you in your further research. " }
                    ul {
                        ali(
                            url = "https://contactquarterly.com",
                            label = "Contact Quarterly",
                            text = "The main platform and official channel for the global CI community",
                        )
                        ali(
                            url = "https://www.materialforthespine.com",
                            label = "Material for the Spine",
                            text = "Steve Paxton's research continuation on walking and the spine",
                        )
                        ali(
                            url = "https://nancystarksmith.com/underscore/",
                            label = "Underscore",
                            text = "A dance improvisation structure/notation using graphical symbols",
                        )
                        ali(
                            url = "http://ecite.org",
                            label = "ECITE",
                            text = "European Contact Improvisation Teachers Exchange",
                        )
                        ali(
                            url = "https://contactimprov.com",
                            label = "ContactImprov.com",
                            text = "Strange website yet with some inspiring videos",
                        )
                        ali(
                            url = "https://contactimprovblog.com",
                            label = "ContactImprovBlog.com",
                            text = "A collection of insightful articles collected over 12 years",
                        )
                        ali(
                            url = "https://bodyresearch.org/contact-improvisation",
                            label = "bodyresearch.org",
                            text = "Some basic information about CI events, principles, and more",
                        )
                        ali(
                            url = "https://en.wikipedia.org/wiki/Contact_improvisation",
                            label = "Wikipedia",
                            text = "The main article about CI on Wikipedia",
                        )
                    }
                }
            }
        }
    }
}
