package zouk

import tabs.Tab
import tabs.sectionedTab
import zouk.tabBeginner.complex
import zouk.tabBeginner.general
import zouk.tabBeginner.simple
import zouk.tabBeginner.steps

object ZoukBeginnerSections // via extensions

val ZoukTabs.beginner: Tab
    get() = sectionedTab("Beginner") {
        ZoukBeginnerSections.general(this)
        ZoukBeginnerSections.steps(this)
        ZoukBeginnerSections.simple(this)
        ZoukBeginnerSections.complex(this)
    }
