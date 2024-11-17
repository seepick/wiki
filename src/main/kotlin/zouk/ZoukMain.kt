package zouk

import Wiki
import kotlinx.html.*

object ZoukWiki : Wiki() {
    override val titleText = "Zouk Cheatsheet"
    override fun renderContentIn(root: HtmlBlockTag) {
        root.div {
            p { +"Zouk" }
        }
    }
}
