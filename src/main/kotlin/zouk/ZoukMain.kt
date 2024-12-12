package zouk

import Wiki

object ZoukTabs // via extensions

object ZoukWiki : Wiki() {
    override val titleText = "Brazilian Zouk Wiki"
    override val tabs = listOf(
        ZoukTabs.introduction,
        ZoukTabs.beginner,
    )
    override val refIds = ZoukRef.entries.map { it.id }
}

enum class ZoukRef(
    val label: String,
    val id: String,
) {
}
