package common

external fun encodeURIComponent(str: String): String
external fun decodeURIComponent(str: String): String

private val duplicates = "__+".toRegex()

fun String.toAnchorId(): String =
    map { if(it.isLetterOrDigit()) it else '_' }.joinToString("")
        .lowercase()
        .replace(duplicates, "_")
