package contact.tabCrossings

import contact.ContactTabs
import tabs.Tab
import tabs.sectionedTab

object ContactAnimalSections // via extensions

val ContactTabs.animalCrossings: Tab
    get() = sectionedTab("Animal Crossings") {
        ContactAnimalSections.introduction(this)
        ContactAnimalSections.hopOn(this)
        ContactAnimalSections.hopOff(this)
    }
