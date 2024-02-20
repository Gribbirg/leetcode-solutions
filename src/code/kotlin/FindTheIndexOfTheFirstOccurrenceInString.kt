package code.kotlin

class FindTheIndexOfTheFirstOccurrenceInString {
    fun strStr(haystack: String, needle: String): Int = haystack.indexOf(needle)
}

fun main() {
    val sol = FindTheIndexOfTheFirstOccurrenceInString()
    println(sol.strStr("sadbutsad", "sad"))
    println(sol.strStr("leetcode", "leeto"))
}