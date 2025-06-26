package zouk.tabExternal

import tabs.Tab
import tabs.sectionedTab
import zouk.ZoukTabs

object ZoukExternalSections // via extensions

val ZoukTabs.external: Tab
    get() = sectionedTab("External") {
        ZoukExternalSections.footwork(this)
    }
