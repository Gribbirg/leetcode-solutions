package code.kotlin

class ReversePrefixOfWord {
    fun reversePrefix(word: String, ch: Char): String {
        val chars = word.toCharArray()
        var second = word.indexOf(ch)
        var first = 0

        while (first < second) {
            chars[second] = chars[first].also { chars[first] = chars[second] }
            first++
            second--
        }

        return chars.joinToString("")
    }
}

fun main() {
    val sol = ReversePrefixOfWord()
    println(sol.reversePrefix("abcdefd", 'd'))
    println(sol.reversePrefix("xyxzxe", 'z'))
    println(sol.reversePrefix("abcd", 'z'))
}