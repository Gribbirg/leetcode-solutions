package code.kotlin

class Solution290 {
    fun wordPattern(pattern: String, s: String): Boolean {
        val wordsList = s.split(' ')

        if (pattern.length != wordsList.size) return false

        val map = HashMap<Char, String>()

        for (i in pattern.indices) {
            if (map.contains(pattern[i])) {
                if (map[pattern[i]] != wordsList[i]) return false
            } else if (map.containsValue(wordsList[i])) {
                return false
            } else {
                map[pattern[i]] = wordsList[i]
            }
        }

        return true
    }
}

fun main() {
    val sol = Solution290()
    println(sol.wordPattern("abba", "dog cat cat fish"))
}