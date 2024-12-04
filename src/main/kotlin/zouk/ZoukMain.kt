package zouk

import Wiki

object ZoukTabs // via extensions

object ZoukWiki : Wiki() {
    override val titleText = "Brazilian Zouk Wiki"
    override val tabs = listOf(
        ZoukTabs.introduction,
        ZoukTabs.beginner,
    )
}
