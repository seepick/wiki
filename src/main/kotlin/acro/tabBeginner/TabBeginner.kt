package acro.tabBeginner

import acro.AcroTabs
import tabs.Tab
import tabs.sectionedTab

object AcroBeginnerSections // via extensions

val AcroTabs.beginner: Tab
    get() = sectionedTab("Beginner") {
        AcroBeginnerSections.basics(this)
        AcroBeginnerSections.simpleTechniques(this)
        AcroBeginnerSections.intermediateTechniques(this)
        AcroBeginnerSections.inversions(this)

    }
