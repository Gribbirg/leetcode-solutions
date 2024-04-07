package code.kotlin

class ConsecutiveCharacters {
    fun maxPower(s: String): Int {
        var start = 0
        var res = 0

        for (i in 1..s.lastIndex) {
            if (s[i] != s[start]) {
                res = maxOf(res, i - start)
                start = i
            }
        }

        return maxOf(res, s.length - start)
    }
}

fun main() {
    val sol = ConsecutiveCharacters()
    println(sol.maxPower("leetcode"))
    println(sol.maxPower("llleetcode"))
    println(sol.maxPower("abbcccddddeeeeedcba"))
    println(sol.maxPower("l"))
    println(sol.maxPower("laaa"))
}