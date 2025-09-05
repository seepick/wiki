package acro

import Wiki
import acro.tabBeginner.beginner
import acro.tabIntermediate.intermediate

object AcroTabs // via extensions

object AcroWiki : Wiki() {
    override val titleText = "AcroYoga Wiki"
    override val tabs = listOf(
        AcroTabs.beginner,
        AcroTabs.intermediate,
    )
    override val refIds = AcroRef.entries.map { it.id }
}
