package code.kotlin

class MinimumLengthOfStringAfterDeletingSimilarEnds {
    fun minimumLength(s: String): Int {
        var start = 0
        var end = s.lastIndex

        while (start < end && s[start] == s[end]) {
            val char = s[start]
            do {
                start++
            } while (start < end && s[start] == char)
            do {
                end--
            } while (start < end && s[end] == char)
        }

        return end - start + 1
    }
}

fun main() {
    val sol = MinimumLengthOfStringAfterDeletingSimilarEnds()
    println(sol.minimumLength("ca"))
    println(sol.minimumLength("cabaabac"))
    println(sol.minimumLength("aabccabba"))
}