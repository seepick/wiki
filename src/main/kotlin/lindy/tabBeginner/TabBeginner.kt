package lindy.tabBeginner

import lindy.LindyTabs
import tabs.Tab
import tabs.sectionedTab

object LindyBeginnerSections // via extensions

val LindyTabs.beginner: Tab
    get() = sectionedTab("Beginner") {
        LindyBeginnerSections.general(this)
        LindyBeginnerSections.steps(this)
        LindyBeginnerSections.positioning(this)
        LindyBeginnerSections.simpleMoves(this)
        LindyBeginnerSections.complexMoves(this)
    }
