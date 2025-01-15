package zouk.tabBeginner

import tabs.Tab
import tabs.sectionedTab
import zouk.ZoukTabs

object ZoukBeginnerSections // via extensions

val ZoukTabs.beginner: Tab
    get() = sectionedTab("Beginner") {
        ZoukBeginnerSections.general(this)
        ZoukBeginnerSections.steps(this)
        ZoukBeginnerSections.simple(this)
        ZoukBeginnerSections.complex(this)
    }
