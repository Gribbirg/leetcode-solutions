package code.kotlin

class JewelsAndStones {
    fun numJewelsInStones(jewels: String, stones: String): Int =
        jewels.sumOf { jewel -> stones.count { it == jewel } }
}

fun main() {
    val sol = JewelsAndStones()::numJewelsInStones
    println(sol("aA", "aAAbbbb"))
    println(sol("z", "ZZ"))
}