package common

external fun encodeURIComponent(str: String): String
external fun decodeURIComponent(str: String): String

external fun setTimeout(function: () -> Unit, delay: Long)
