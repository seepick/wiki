package contact.tabGeneral

import contact.ContactTabs
import kotlinx.html.*
import tabs.SectionedTabDsl
import tabs.Tab
import tabs.sectionedTab

object ContactGeneralSections // via extensions

val ContactTabs.general: Tab
    get() = sectionedTab("General") {
        ContactGeneralSections.about(this)
        ContactGeneralSections.resources(this)
    }
