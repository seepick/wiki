package lindy.tabIntermediate

import lindy.LindyTabs
import tabs.Tab
import tabs.sectionedTab

object LindyIntermediateSections // via extensions

val LindyTabs.intermediate: Tab
    get() = sectionedTab("Intermediate") {
        LindyIntermediateSections.moves(this)
    }
