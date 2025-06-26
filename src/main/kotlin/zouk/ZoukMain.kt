package zouk

import Wiki
import zouk.tabBeginner.beginner
import zouk.tabExternal.external
import zouk.tabGeneral.general
import zouk.tabIntermediate.intermediate
import zouk.tabPreadvanced.preadvanced

object ZoukTabs // via extensions

object ZoukWiki : Wiki() {
    override val titleText = "Brazilian Zouk Wiki"
    override val tabs = listOf(
        ZoukTabs.home,
        ZoukTabs.general,
        ZoukTabs.beginner,
        ZoukTabs.intermediate,
        ZoukTabs.preadvanced,
        ZoukTabs.external,
    )
    override val refIds = ZoukRef.entries.map { it.id }
}

