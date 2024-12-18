package common

external fun encodeURIComponent(str: String): String
external fun decodeURIComponent(str: String): String

external fun setTimeout(function: () -> Unit, delay: Long)

private val arabicToRoman = mutableMapOf(
    Pair(1, "I"),
    Pair(4, "IV"),
    Pair(5, "V"),
    Pair(9, "IX"),
    Pair(10, "X"),
    Pair(40, "XL"),
    Pair(50, "L"),
    Pair(90, "XC"),
    Pair(100, "C")
)
private val arrayRoman = arrayOf(100, 90, 50, 40, 10, 9, 5, 4, 1)

fun convertArabicNumberToRoman(arabicInput: Int): String {
    if (arabicInput > 100) error("Only numbers up to 100 supported")
    val startCount = calcStartCount(arabicInput)
    var romanOutput = ""
    var num = arabicInput
    for (i in startCount..<arrayRoman.size) {
        var count = num / arrayRoman[i]
        num %= arrayRoman[i]
        while (count > 0) {
            romanOutput += arabicToRoman[arrayRoman[i]]
            count--
        }
    }
    return romanOutput
}

private fun calcStartCount(arabicInput: Int): Int =
    when {
        arabicInput > 90 -> 1
        arabicInput > 50 -> 2
        arabicInput > 40 -> 3
        arabicInput > 10 -> 4
        arabicInput > 5 -> 5
        arabicInput > 4 -> 6
        arabicInput > 1 -> 7
        else -> 0
    }
