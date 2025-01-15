package lindy

import Wiki
import common.Ref
import lindy.tabBeginner.beginner
import lindy.tabCharleston.charleston
import lindy.tabIntermediate.intermediate
import lindy.tabIntroduction.introduction

object LindyTabs // via extensions

object LindyWiki : Wiki() {
    override val titleText = "Lindy Hop Wiki"
    override val tabs = listOf(
        LindyTabs.introduction,
        LindyTabs.beginner,
        LindyTabs.intermediate,
        LindyTabs.charleston,
    )
    override val refIds = LindyRef.entries.map { it.id }
}

enum class LindyRef(
    override val label: String,
    override val id: String,
) : Ref {
    // beginner - general
    LindyPositioning("Lindy Hop positioning", "beginner/general/positioning"),
    // beginner - simple
    SendOut("Send-out", "beginner/simple_moves/send_out"),
    Circle("Circle", "beginner/simple_moves/circle"),
    // beginner - complex
    Franky6("Franky 6", "beginner/complex_moves/franky_6"),
    // charleston
    Tandem("Tandem", "charleston/moves/tandem"),
    HandToHand("Hand-to-Hand", "charleston/moves/hand_to_hand"),
}
