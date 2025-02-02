package common

import kotlinx.browser.document
import org.w3c.dom.HashChangeEvent
import tabs.openTab

private val duplicates = "__+".toRegex()

fun String.toAnchorId(): String =
    map { if(it.isLetterOrDigit()) it else '_' }.joinToString("")
        .lowercase()
        .replace(duplicates, "_")

fun setAnchor(anchorIncludingPrefixedHashSign: String) {
    document.location!!.href = anchorIncludingPrefixedHashSign
}

fun setAnchor(anchor: AnchorElements) {
    document.location!!.href = anchor.asAnchorString
}

fun parseAnchor(href: String = document.location!!.href): AnchorElements {
    val elements = if (!href.contains("#")) {
        emptyList()
    } else {
        href.substringAfter("#").split("/")
    }
    return AnchorElements(elements.elementAtOrNull(0), elements.elementAtOrNull(1), elements.elementAtOrNull(2))
}

data class AnchorElements(
    val tabId: String?,
    val sectionId: String?,
    val subSectionId: String?,
) {
    val navigationalId =
        if(sectionId == null) null else {
            if(subSectionId == null) "$tabId/$sectionId" else "$tabId/$sectionId/$subSectionId"
        }
    val asAnchorString = listOfNotNull(tabId, sectionId, subSectionId).let {
        if(it.isEmpty()) "" else "#${it.joinToString("/")}"
    }
}

fun onAnchorChanged(event: HashChangeEvent) {
    val old = parseAnchor(event.oldURL)
    val new = parseAnchor(event.newURL)
    console.log("hash changed from [$old] to [$new]")
    if(old.tabId != null && new.tabId != null && old.tabId != new.tabId) {
        openTab(new.tabId)
        setAnchor(new)
    }
}
