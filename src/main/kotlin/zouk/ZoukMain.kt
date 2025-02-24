package zouk

import Wiki
import zouk.tabBeginner.beginner
import zouk.tabGeneral.general
import zouk.tabIntermediate.intermediate

object ZoukTabs // via extensions

object ZoukWiki : Wiki() {
    override val titleText = "Brazilian Zouk Wiki"
    override val tabs = listOf(
        ZoukTabs.home,
        ZoukTabs.general,
        ZoukTabs.beginner,
        ZoukTabs.intermediate,
    )
    override val refIds = ZoukRef.entries.map { it.id }
}

