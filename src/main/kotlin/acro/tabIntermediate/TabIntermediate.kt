package acro.tabIntermediate

import acro.AcroTabs
import tabs.Tab
import tabs.sectionedTab

object AcroIntermediateSections // via extensions

val AcroTabs.intermediate: Tab
    get() = sectionedTab("Intermediate") {
        AcroIntermediateSections.intermediateTechniques(this)
        AcroIntermediateSections.inversions(this)
        AcroIntermediateSections.trio(this)
    }
