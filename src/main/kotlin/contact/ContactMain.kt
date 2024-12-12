package contact

import Wiki

object ContactTabs // via extensions

object ContactWiki : Wiki() {
    override val titleText = "Contact Improvisation Wiki"
    override val tabs = listOf(
        ContactTabs.animalCrossings
    )
    override val refIds = ContactRef.entries.map { it.id }
}

enum class ContactRef(
    val label: String,
    val id: String,
) {
}
