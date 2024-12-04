package contact

import Wiki

object ContactTabs // via extensions

object ContactWiki : Wiki() {
    override val titleText = "Contact Improvisation Wiki"
    override val tabs = listOf(
        ContactTabs.animalCrossings
    )
}
