package zouk.tabIntermediate

import tabs.Tab
import tabs.sectionedTab
import zouk.ZoukTabs

object ZoukIntermediateSections // via extensions

val ZoukTabs.intermediate: Tab
    get() = sectionedTab("Intermediate") {
        ZoukIntermediateSections.general(this)
        ZoukIntermediateSections.movesRevised(this)
        ZoukIntermediateSections.newMoves(this)
    }
