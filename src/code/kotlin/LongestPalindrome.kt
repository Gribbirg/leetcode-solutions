package code.kotlin

class LongestPalindrome {
    fun longestPalindrome(s: String): Int {
        val charCount = HashMap<Char, Int>()
        s.forEach { charCount[it] = (charCount[it] ?: 0) + 1 }
        return charCount.values.sumOf { it / 2 } * 2 + if (charCount.values.any { it % 2 == 1 }) 1 else 0
    }
}

fun main() {
    val sol = LongestPalindrome()
    println(sol.longestPalindrome("abccccdd"))
    println(sol.longestPalindrome("a"))
}