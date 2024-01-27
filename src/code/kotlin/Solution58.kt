package code.kotlin

class Solution58 {
    fun lengthOfLastWord(s: String): Int {
        if (s.length <= 1)
            return s.length

        var i = s.length - 1

        while (i >= 0 && s[i] == ' ')
            i--

        val start = i

        while (i >= 0 && s[i] != ' ')
            i--

        return start - i
    }
}

fun main() {
    val solution = Solution58()
    println(solution.lengthOfLastWord("   fly me   to   the moon  "))
}