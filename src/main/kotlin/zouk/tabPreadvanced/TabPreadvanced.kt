package zouk.tabPreadvanced

import tabs.Tab
import tabs.sectionedTab
import zouk.ZoukTabs
import zouk.tabIntermediate.ZoukIntermediateSections
import zouk.tabIntermediate.general
import zouk.tabIntermediate.movesRevised
import zouk.tabIntermediate.newMoves

object ZoukPreadvancedSections // via extensions

val ZoukTabs.preadvanced: Tab
    get() = sectionedTab("Pre-Advanced") {
        ZoukPreadvancedSections.newMoves(this)
    }
