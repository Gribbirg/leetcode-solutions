package code.kotlin

class IsomorphicStrings {
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
    val sol = IsomorphicStrings()
    println(sol.isIsomorphic("egg", "adh"))
}