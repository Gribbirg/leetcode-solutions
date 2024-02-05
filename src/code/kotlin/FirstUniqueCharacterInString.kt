package code.kotlin

class FirstUniqueCharacterInString {
    fun firstUniqChar(s: String): Int {
        val map = HashMap<Char, Int>()
        s.forEach { c: Char -> map[c] = map.getOrDefault(c, 0) + 1 }
        for (i in s.indices)
            if (map[s[i]] == 1)
                return i
        return -1
    }
}

fun main() {
    val sol = FirstUniqueCharacterInString()
    println(sol.firstUniqChar("leetcode"))
    println(sol.firstUniqChar("loveleetcode"))
    println(sol.firstUniqChar("aabb"))
}