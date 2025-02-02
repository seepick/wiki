package contact.tabGeneral

import kotlinx.html.*
import tabs.SectionedTabDsl

private fun UL.bookItem(title: String, url: String, by: String, label: String? = null) {
    li {
        i { a(url, target = "_blank") { +title}; +" by $by"}
        if(label != null) {
            br
            +label
        }
    }
}
private fun UL.resourceItem(label: String, url: String, text: String) {
    li {
        a(url, target = "_blank") { +label}
        +" - $text"
    }
}

private fun UL.linkItem(url: String, text: String) {
    li {
        a(url, target = "_blank") { +url}
        +" - $text"
    }
}

fun ContactGeneralSections.resources(dsl: SectionedTabDsl) {
    with(dsl) {
        section("Resources") {
            content {
                p {
                    +"The content of the book might not have been enough for your mental thirst for information and insight. "
                    +"If this is the case, the following collection of further resources will hopefully leave you with a greater satisfaction."
                }
            }
            subSection("Practice") {
                content {
                    p {
                        +"In case you are looking to practice (classes, workshops, festivals) anywhere in the world, check out the "
                        a("https://ciglobalcalendar.net") { +"CI global calendar" }; +". "
                        +"If you need something more local (in the Netherlands) lookup the community calendar "
                        a("https://amsterdamjam.nl") { +"amsterdamjam.nl" }; +". "
                        +"In case you are near Amsterdam, you can also go directly to my teacher "
                        a("https://tomgoldhand.com") { +"Tom Goldhand" }; +"."
                    }
                }
            }
            subSection("Books") {
                content {
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
                content {
                    p {
                        +"It is highly recommended to watch \"";i{+"the classics"};+"\" (everything between 1972 and 1980) once in a while. "
                        +"This will help you to regularly check your understanding of the roots of CI or simply to get inspired to continue your practice. "
                    }
                    ul {
                        resourceItem(
                            label = "The invention of CI",
                            url = "https://www.youtube.com/watch?v=9FeSDsmIeHA",
                            text = "The very early beginnings, 1972",
                        )
                        resourceItem(
                            label = "Magnesium",
                            url = "https://www.youtube.com/watch?v=5gEfVJBhwrQ",
                            text = "The actual piece from that research is called magnesium, 1972",
                        )
                        resourceItem(
                            label = "Chute",
                            url = "https://www.youtube.com/watch?v=xKlO-2e3gHo",
                            text = "A few years later, 1979",
                        )
                        resourceItem(
                            label = "Fall After Newton",
                            url = "https://www.youtube.com/watch?v=k768K_OTePM",
                            text = "Many things have changed here, 1987; the original length of this video is actually 22 minutes",
                        )
                        resourceItem(
                            label = "Contact Quarterly",
                            url = "https://www.youtube.com/@contactquarterly",
                            text = "A YouTube channel containing some videos of the early beginnings (e.g. Chute, Magnesium, Peripheral Vision, Soft Pallet)",
                        )
                        resourceItem(
                            label = "Life Lessons Learned Through Contact Improvisation",
                            url = "https://www.youtube.com/watch?v=hlIRjfto7o0",
                            text = "An interesting TEDx video-clip to see the connection of CI to general life",
                        )
                        resourceItem(
                            label = "Gogolfest 2016 Contact Improvisation",
                            url = "https://www.youtube.com/watch?v=n1D9RU2GbBo",
                            text = "Simply aspiring to watch",
                        )
                        resourceItem(
                            label = "A couple of basic exercises",
                            url = "https://www.youtube.com/watch?v=H8JiB2Nv5Qo",
                            text = "Something to practice by yourself as a beginner",
                        )
                        resourceItem(
                            label = "Steve Paxton Talking Dance",
                            url = "https://www.youtube.com/watch?v=_82Od5NM4LI",
                            text = "The creator of CI giving a thorough talk about dancing, 2015",
                        )
                    }
                }
            }
            subSection("Websites") {
                content {
                    p { +"A list of websites I found worth mentioning here to direct you in your further research. " }
                    ul {
                        linkItem(
                            url = "https://contactquarterly.com",
                            text = "CQ Unbound Journal, the main platform and official channel for the global CI community",
                        )
                        linkItem(
                            url = "https://www.materialforthespine.com",
                            text = "Steve Paxton's work and research after he passed on CI and researched walking and material for the spine",
                        )
                        linkItem(
                            url = "https://nancystarksmith.com/underscore/",
                            text = "A long-form dance improvisation structure/notation using graphical symbols",
                        )
                        linkItem(
                            url = "http://ecite.org",
                            text = "European Contact Improvisation Teachers Exchange",
                        )
                        linkItem(
                            url = "https://contactimprov.com",
                            text = "Weird looking website with a global (outdated) calendar and some inspiring videos",
                        )
                        linkItem(
                            url = "https://contactimprovblog.com",
                            text = "A collection of insightful articles collected over 12 years",
                        )
                        linkItem(
                            url = "https://bodyresearch.org/contact-improvisation",
                            text = "Some basic information about CI events, principles, and more",
                        )
                        linkItem(
                            url = "https://en.wikipedia.org/wiki/Contact_improvisation",
                            text = "Wikipedia, I guess nothing to be said",
                        )
                    }
                }
            }
        }
    }
}
