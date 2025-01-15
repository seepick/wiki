package zouk

import Wiki
import common.Ref
import zouk.tabBeginner.beginner

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
    override val label: String,
    override val id: String,
): Ref {
}
