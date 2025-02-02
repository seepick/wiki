package common

interface Tops<SUB> {
    val subs: List<SUB>
}

sealed interface Columns<E>
data class SingleColumn<E>(val tops: List<E>) : Columns<E>
data class DoubleColumn<E>(
    val tops1: List<E>,
    val tops2: List<E>,
) : Columns<E>

object Columnizer {
    fun <SUB, TOP : Tops<SUB>> columnize(tops: List<TOP>): Columns<TOP> {
        if (tops.size == 1) return SingleColumn(tops)
        val topFound = findTop(tops)
        if (topFound == tops.first()) return SingleColumn(tops)
        val topFoundIndex = tops.indexOf(topFound)
        return DoubleColumn(
            tops1 = tops.subList(0, topFoundIndex),
            tops2 = tops.subList(topFoundIndex, tops.size),
        )
    }

    private fun <SUB, TOP : Tops<SUB>>  findTop(tops: List<TOP>): TOP {
        val topsAndSubs = tops.map { mutableListOf(Top(it)) + it.subs.map { Sub(it) } }.flatten()
        val pivot = topsAndSubs.size / 2
        var topFound: TOP? = null
        var i = pivot + 1
        while (topFound == null && i < topsAndSubs.size) {
            val next = topsAndSubs[i]
            if (next is Top) {
                @Suppress("UNCHECKED_CAST")
                topFound = next.top as TOP
                break
            }
            i++
        }
        var j = pivot
        while (topFound == null) {
            val prev = topsAndSubs[j]
            if (prev is Top) {
                @Suppress("UNCHECKED_CAST")
                topFound = prev.top as TOP
            }
            j--
        }
        return topFound
    }
}

private sealed interface TopOrSub<SUB, TOP : Tops<SUB>>
private class Top<SUB, TOP : Tops<SUB>>(val top: TOP) : TopOrSub<SUB, TOP>
private class Sub<SUB, TOP : Tops<SUB>>(val sub: SUB) : TopOrSub<SUB, TOP>
