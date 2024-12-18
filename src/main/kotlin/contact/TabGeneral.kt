package contact

import kotlinx.html.*
import tabs.Tab
import tabs.tab

val ContactTabs.general: Tab
    get() = tab("General") {
        h1 { +"About" }
        p { +"Just a collection of techniques." }
    }
