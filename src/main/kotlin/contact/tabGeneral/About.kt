package contact.tabGeneral

import common.externalLink
import common.image
import common.youtube
import kotlinx.html.*
import tabs.SectionedTabDsl

fun ContactGeneralSections.about(dsl: SectionedTabDsl) {
    with(dsl) {
        section("About") {
            subSection("Wiki") {
                html {
                    p {
                        +"The following pages will explain several moves and techniques common in Contact Improvisation (CI) and provide additional information complementary to the book, the classes, and more provided by ";externalLink("https://crashcoursecontact.org", "crashcoursecontact.org");+". "
                        +"The techniques shown will come along with detailed ";b{+"step-by-step instructions"};+" with lots of videos for visual comprehension (as printing static pictures in a book seemed not very useful for learning). "
                    }
                    p {
                        +"Whenever you follow along a practice, doing some (abstract) exercise, always ask yourself: "
                        +"\"";i{+"Why is this relevant? How can it be applied?"};+"\""; br
                        +"Always consider that CI is an invitation for ";b{+"research and investigation"};+", not believing or blindly trusting. "
                        +"Only when you fully understand the reasons of why (and why not) you may feel satisfied and lean back. "
                        +"Know the differences, the circumstances in which one or the other approach has certain pros and cons. "
                    }
                }
            }
            subSection("History") {
                html {
                    youtube("wkIgV000mUw?si=2c0vMIPfNKsNSxWz") {
                        +"The not-so-quick History of CI in 3 Parts (";externalLink("http://crashcoursecontact.org/CI-History-Slides.pdf", "download the slides");+")"
                    }
                }
            }
            subSection("Book") {
                html {
                    p {
                        +"This is the digital, complementary resource for the free book: '"
                        i { +"Crash Course Contact - Small Steps into the Wonderful World of Contact Improvisation" };+"'. "
                        +"It is focused on the theoretical part, whereas this website covers the practical part. "
                    }
                    image(
                        id = "book",
                        source = "images/book_cover.png",
                        size = 313 to 450,
                        caption = "https://crashcoursecontact.org",
                        link = "https://crashcoursecontact.org",
                    )
                }
            }
            subSection("Me") {
                html {
                    p {
                        +"My name is Christoph Pickl, living in the Netherlands, Amsterdam, and I have my main background in (internal) martial arts, which is mainly (solely?) concerned with a pragmatic, functional approach. "
                        +"I consider myself a movement researcher, and have little to do with dancing. "
                        +"Working most of my life in a domain which required analytical thinking, structuring, ordering, grouping,... shaped my perspective on movement through a lense of (bio-)mechanics. "
                    }
                    p {
                        +"For any questions or remarks, feel free to contact me via: "
                        a(href = "mailto:christoph@crashcoursecontact.org") { +"christoph@crashcoursecontact.org" }
                    }
                }
            }
        }
    }
}
