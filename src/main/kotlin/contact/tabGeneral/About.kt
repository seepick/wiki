package contact.tabGeneral

import kotlinx.html.a
import kotlinx.html.i
import kotlinx.html.p
import tabs.SectionedTabDsl

fun ContactGeneralSections.about(dsl: SectionedTabDsl) {
    with(dsl) {
        section("About") {
            content {
                p {
                    +"This is the digital complementary to the free book '"
                    i { +"Crash Course Contact - Small Steps into the Wonderful World of Contact Improvisation" };+"'."
                }
                p {
                    +"Contact me via: "
                    a(href = "mailto:christoph@crashcoursecontact.org") { +"christoph@crashcoursecontact.org" }
                }
                // TODO DOWNLOAD book link pdf; cover image; link to self-service print
                // contact email
            }
        }
    }
}
