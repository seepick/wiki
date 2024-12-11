package lindy

import Wiki

object LindyTabs // via extensions

object LindyWiki : Wiki() {
    override val titleText = "Lindy Hop Wiki"
    override val tabs = listOf(
        LindyTabs.introduction,
        LindyTabs.beginner,
        LindyTabs.charleston,
    )
}
