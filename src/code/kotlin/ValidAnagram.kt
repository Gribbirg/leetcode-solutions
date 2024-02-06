package code.kotlin

class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean =
        s.toCharArray().sortedArray().contentEquals(t.toCharArray().sortedArray())
}

fun main() {
    val sol = ValidAnagram()
    println(sol.isAnagram("anagram", "nagaram"))
    println(sol.isAnagram("rat", "car"))
}