package common

import Wiki
import kotlinx.browser.document
import kotlinx.browser.window

fun showAlertIfInvalidRefsFound(wiki: Wiki) {
    val invalids = findInvalidRefs(wiki.refIds)
    if(invalids.isNotEmpty()) {
            window.alert(
                "Invalid references found:\n" + invalids.joinToString("\n") { "- $it" }
            )
    }
}

private fun findInvalidRefs(ids: List<String>): List<String> =
    ids.mapNotNull { id ->
        val found = document.getElementById(id)
        if (found == null) id else null
    }