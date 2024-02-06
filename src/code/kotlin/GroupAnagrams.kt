package code.kotlin

class GroupAnagrams {
    fun groupAnagrams(strs: Array<String>): List<List<String>> =
        strs.groupBy { str -> String(str.toCharArray().sortedArray()) }.values.toList()
}

fun main() {
    println(GroupAnagrams().groupAnagrams(arrayOf("eat","tea","tan","ate","nat","bat")))
    println(GroupAnagrams().groupAnagrams(arrayOf("")))
    println(GroupAnagrams().groupAnagrams(arrayOf("a")))
}