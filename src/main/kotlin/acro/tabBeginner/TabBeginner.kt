package acro.tabBeginner

import acro.AcroTabs
import acro.tabIntermediate.trio
import tabs.Tab
import tabs.sectionedTab

object AcroBeginnerSections // via extensions

val AcroTabs.beginner: Tab
    get() = sectionedTab("Beginner") {
        AcroBeginnerSections.basics(this)
        AcroBeginnerSections.birds(this)
        AcroBeginnerSections.simpleTechniques(this)
        AcroBeginnerSections.inversions(this)
        AcroBeginnerSections.simpleFlows(this)
    }
