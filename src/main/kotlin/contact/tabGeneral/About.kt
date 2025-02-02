package contact.tabGeneral

import common.image
import kotlinx.html.*
import tabs.SectionedTabDsl

fun ContactGeneralSections.about(dsl: SectionedTabDsl) {
    with(dsl) {
        section("About") {
            subSection("Wiki") {
                html {
                    p {
                        +"This wiki will explain several moves and techniques common in CI. "
                        +"It will do so with detailed step-by-step instructions with lots of videos for visual comprehension. "
                    }
                    p {
                        +"Whenever you follow along a practice, doing some (abstract) exercise, always ask yourself: "
                        +"\"";i{+"Why is this relevant? How can it be applied?"};+"\""
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
                        +"For any questions or remarks, feel free to contact me via: "; br
                        a(href = "mailto:christoph@crashcoursecontact.org") { +"christoph@crashcoursecontact.org" }
                    }
                }
            }
        }
    }
}
