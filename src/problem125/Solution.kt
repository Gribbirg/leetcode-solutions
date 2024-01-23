package problem125

class Solution {
    fun isPalindrome(s: String): Boolean {
        if (s.isEmpty() || s.length == 1 && isAlphanumeric(s[0]))
            return true

        var begin = 0
        var end = s.length - 1
        var beginChar = s[begin].lowercaseChar()
        var endChar = s[end].lowercaseChar()

        while (begin < end) {
            if (!isAlphanumeric(beginChar)) {
                beginChar = s[++begin].lowercaseChar()
            } else if (!isAlphanumeric(endChar)) {
                endChar = s[--end].lowercaseChar()
            } else if (beginChar == endChar) {
                beginChar = s[++begin].lowercaseChar()
                endChar = s[--end].lowercaseChar()
            } else {
                return false
            }
        }

        return true
    }

    private fun isAlphanumeric(char: Char): Boolean {
        val num = char.code
        return num in 48..57 || num in 65..90 || num in 97..122
    }
}

fun main() {
    val solution = Solution()
    println(solution.isPalindrome("A man, a plan, a canal: Panama"))
    println(solution.isPalindrome("race a car"))
}