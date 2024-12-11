package lindy

import lindy.tabIntroduction.general
import tabs.Tab
import tabs.sectionedTab

object LindyIntroductionSections // via extensions

val LindyTabs.introduction: Tab
    get() = sectionedTab("Introduction") {
        LindyIntroductionSections.general(this)
    }
