package code.kotlin

class Solution383 {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val magazineMap = HashMap<Char, Int>()

        for (i in magazine) {
            val value = magazineMap[i] ?: 0
            magazineMap[i] = value + 1
        }

        for (i in ransomNote) {
            val value = magazineMap[i] ?: 0
            if (value == 0) return false
            magazineMap[i] = value - 1
        }
        return true
    }
}

fun main() {
    val solution = Solution383()
    println(solution.canConstruct("aa", "aabb"))
}