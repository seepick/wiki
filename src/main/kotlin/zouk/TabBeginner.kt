package zouk

import tabs.Tab
import tabs.sectionedTab
import zouk.tabBeginner.complex
import zouk.tabBeginner.general
import zouk.tabBeginner.simple
import zouk.tabBeginner.steps

object ZoukSections // via extensions

val ZoukTabs.beginner: Tab
    get() = sectionedTab("Beginner") {
        ZoukSections.general(this)
        ZoukSections.steps(this)
        ZoukSections.simple(this)
        ZoukSections.complex(this)
    }
