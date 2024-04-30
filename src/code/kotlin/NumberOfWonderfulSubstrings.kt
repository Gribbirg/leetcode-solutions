package code.kotlin

class NumberOfWonderfulSubstrings {
    fun wonderfulSubstrings(word: String): Long {
        val count = LongArray(1024).also { it[0] = 1 }
        var mask = 0
        var res = 0L
        word.forEach { char ->
            mask = mask xor (1 shl (char - 'a'))
            res += count[mask]
            repeat(10) { i ->
                res += count[mask xor (1 shl i)]
            }
            count[mask]++
        }

        return res
    }
}

fun main() {
    val sol = NumberOfWonderfulSubstrings()
    println(sol.wonderfulSubstrings(word = "aba"))
    println(sol.wonderfulSubstrings(word = "aabb"))
    println(sol.wonderfulSubstrings(word = "he"))
}