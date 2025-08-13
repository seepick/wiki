package acro

import Wiki
import acro.tabBeginner.beginner

object AcroTabs // via extensions

object AcroWiki : Wiki() {
    override val titleText = "AcroYoga Wiki"
    override val tabs = listOf(
        AcroTabs.beginner,
    )
    override val refIds = AcroRef.entries.map { it.id }
}
