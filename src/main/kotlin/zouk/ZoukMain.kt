package zouk

import tabs.Tab
import Wiki
import kotlinx.html.*

object ZoukWiki : Wiki() {
    override val titleText = "Zouk Cheatsheet"
    override val tabs = listOf(
        IntroTab
    )
}

object IntroTab : Tab(tabId = "intro", title = "Intro") {
    override fun renderContentIn(root: HtmlBlockTag) {
        root.p { +"Some intro disclaimer" }
    }
}
