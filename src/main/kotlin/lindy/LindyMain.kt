package lindy

import Wiki
import common.Ref

object LindyTabs // via extensions

object LindyWiki : Wiki() {
    override val titleText = "Lindy Hop Wiki"
    override val tabs = listOf(
        LindyTabs.introduction,
        LindyTabs.beginner,
        LindyTabs.charleston,
    )
    override val refIds = LindyRef.entries.map { it.id }
}

enum class LindyRef(
    override val label: String,
    override val id: String,
) : Ref {
    SendOut("Send-out", "beginner/simple_moves/send_out"),
    Franky6("Franky 6", "beginner/complex_moves/franky_6"),
    Tandem("Tandem", "charleston/moves/tandem")
}
