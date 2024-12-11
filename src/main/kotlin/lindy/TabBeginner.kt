package lindy

import lindy.tabBeginner.complexMoves
import lindy.tabBeginner.general
import lindy.tabBeginner.positioning
import lindy.tabBeginner.simpleMoves
import lindy.tabBeginner.steps
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
