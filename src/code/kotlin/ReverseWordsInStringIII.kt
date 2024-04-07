package code.kotlin

class ReverseWordsInStringIII {
    fun reverseWords(s: String) =
        s.split(' ').joinToString(" ") { it.reversed() }
}

fun main() {
    val sol = ReverseWordsInStringIII()
    println(sol.reverseWords("Let's take LeetCode contest"))
    println(sol.reverseWords("Mr Ding"))
}