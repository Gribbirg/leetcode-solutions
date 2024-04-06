package code.kotlin

class LongestSubstringWithoutRepeatingCharacters {
    fun lengthOfLongestSubstring(s: String): Int {
        var maxLen = 0
        val currentSet = HashSet<Char>()

        s.forEachIndexed { i, char ->
            while (char in currentSet) {
                currentSet.remove(s[i - currentSet.size])
            }
            currentSet.add(char)
            maxLen = maxOf(maxLen, currentSet.size)
        }

        return maxLen
    }
}

fun main() {
    val sol = LongestSubstringWithoutRepeatingCharacters()
    println(sol.lengthOfLongestSubstring(s = "abcabcbb"))
    println(sol.lengthOfLongestSubstring(s = "bbbbb"))
    println(sol.lengthOfLongestSubstring(s = "pwwkew"))
}