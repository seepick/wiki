package acro

import Wiki
import acro.tabBeginner.beginner
import common.Ref

object AcroTabs // via extensions

object AcroWiki : Wiki() {
    override val titleText = "AcroYoga Wiki"
    override val tabs = listOf(
        AcroTabs.beginner,
    )
    override val refIds = AcroRef.entries.map { it.id }
}

enum class AcroRef(
    override val label: String,
    override val id: String,
) : Ref {

}
