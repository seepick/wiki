package zouk.tabGeneral

import tabs.Tab
import tabs.sectionedTab
import zouk.ZoukTabs

object ZoukGeneralSections // via extensions

val ZoukTabs.general: Tab
    get() = sectionedTab("General") {
        ZoukGeneralSections.basics(this)
        ZoukGeneralSections.advice(this)
        ZoukGeneralSections.latin(this)
    }
