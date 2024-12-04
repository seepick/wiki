import common.decodeURIComponent
import common.encodeURIComponent
import kotlinx.browser.document

enum class CookieKey(val key: String) {
    RECENT_TAB_ID("recentTabId")
}

object Cookies {
    private val values = mutableMapOf<String, String>()
    init {
//        document.cookie = "test=; expires=Thu, 01 Jan 1970 00:00:00 UTC;";
        println("COOKIE: ${document.cookie}")
        values += parseCookieString(document.cookie)
    }

    fun read(key: CookieKey): String? = values[key.key]

    fun write(key: CookieKey, value: String) {
        values[key.key] = value
        writeAll()
    }

    private fun writeAll() {
        values.forEach { (key, value) ->
            document.cookie = "$key=${encodeURIComponent(value)}"
        }
    }
}

private fun parseCookieString(raw: String): Map<String, String> =
    if(raw.trim().isEmpty()) emptyMap() else
        raw.split(";")
            .associate { cookie ->
                cookie.split("=")
                    .let { it[0].trim() to decodeURIComponent(it[1].trim()) }
            }
