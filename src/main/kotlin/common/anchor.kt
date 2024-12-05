package common

import kotlinx.browser.document

private val duplicates = "__+".toRegex()

fun String.toAnchorId(): String =
    map { if(it.isLetterOrDigit()) it else '_' }.joinToString("")
        .lowercase()
        .replace(duplicates, "_")

fun setAnchor(anchorIncludingPrefixedHashSign: String) {
    document.location!!.href = anchorIncludingPrefixedHashSign
}

fun parseAnchor(): AnchorElements {
    val href = document.location!!.href
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
}
