package code.kotlin

class LongestIdealSubsequence {
    fun longestIdealString(s: String, k: Int): Int {
        val idealsLengths = IntArray(26)

        s.forEach { char ->
            val charNum = char - 'a'
            val maxChar = minOf(25, charNum + k)
            val minChar = maxOf(0, charNum - k)
            var maxLen = 0
            for (i in minChar..maxChar) {
                maxLen = maxOf(maxLen, idealsLengths[i])
            }
            idealsLengths[charNum] = maxLen + 1
        }

        return idealsLengths.max()
    }
}

fun main() {
    val sol = LongestIdealSubsequence()
    println(sol.longestIdealString(s = "acfgbd", k = 2))
    println(sol.longestIdealString(s = "abcd", k = 3))
}