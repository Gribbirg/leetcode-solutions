package code.kotlin

class SumOfAllSubsetXORTotals {
    fun subsetXORSum(nums: IntArray): Int =
        nums.reduce { s, num -> s or num } shl nums.lastIndex
}

fun main() {
    val sol = SumOfAllSubsetXORTotals()
    println(sol.subsetXORSum(intArrayOf(1, 3)))
    println(sol.subsetXORSum(intArrayOf(5, 1, 6)))
    println(sol.subsetXORSum(intArrayOf(3, 4, 5, 6, 7, 8)))
}