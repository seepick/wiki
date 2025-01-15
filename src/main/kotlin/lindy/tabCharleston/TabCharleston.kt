package lindy.tabCharleston

import lindy.LindyTabs
import tabs.Tab
import tabs.sectionedTab

object LindyCharlestonSections // via extensions

val LindyTabs.charleston: Tab
    get() = sectionedTab("Charleston") {
        LindyCharlestonSections.general(this)
    }
