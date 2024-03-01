package code.kotlin

class MaximumOddBinaryNumber {
    fun maximumOddBinaryNumber(s: String): String {
        var i = 0
        val res = CharArray(s.length) { '0' }

        for (ch in s) {
            if (ch == '1') {
                if (res.last() != '1') {
                    res[res.lastIndex] = '1'
                } else {
                    res[i] = '1'
                    i++
                }
            }
        }

        return res.joinToString(separator = "")
    }
}

fun main() {
    val sol = MaximumOddBinaryNumber()
    println(sol.maximumOddBinaryNumber("010"))
    println(sol.maximumOddBinaryNumber("0101"))
}