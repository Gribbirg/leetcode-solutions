package code.kotlin

class LargestPositiveIntegerThatExistsWithItsNegative {
    fun findMaxK(nums: IntArray): Int =
        nums.toSet().let { set -> set.filter { -it in set }.let { if (it.isEmpty()) -1 else it.max() } }
}

fun main() {
    val sol = LargestPositiveIntegerThatExistsWithItsNegative()
    println(sol.findMaxK(intArrayOf(-1, 2, -3, 3)))
    println(sol.findMaxK(intArrayOf(-1, 10, 6, 7, -7, 1)))
    println(sol.findMaxK(intArrayOf(-10, 8, 6, 7, -2, -3)))
}