package code.kotlin

class Solution205 {
    fun isIsomorphic(s: String, t: String): Boolean {
        val map = HashMap<Char, Char>()

        for (i in s.indices) {
            if (map.contains(s[i])) {
                if (map[s[i]] != t[i]) return false
            } else if (map.containsValue(t[i])) {
                return false
            } else {
                map[s[i]] = t[i]
            }
        }

        return true
    }
}

fun main() {
    val sol = Solution205()
    println(sol.isIsomorphic("egg", "adh"))
}