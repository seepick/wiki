package lindy

import lindy.tabCharleston.general
import tabs.Tab
import tabs.sectionedTab

object LindyCharlestonSections // via extensions

val LindyTabs.charleston: Tab
    get() = sectionedTab("Charleston") {
        LindyCharlestonSections.general(this)
    }
