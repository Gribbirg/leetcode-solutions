package code.kotlin

class MinimumNumberOfOperationsToMakeArrayXOREqualToK {
    fun minOperations(nums: IntArray, k: Int): Int =
        nums.fold(k) { a, b -> a xor b }.countOneBits()
}

fun main() {
    val sol = MinimumNumberOfOperationsToMakeArrayXOREqualToK()
    println(sol.minOperations(nums = intArrayOf(2, 1, 3, 4), k = 1))
    println(sol.minOperations(nums = intArrayOf(2, 0, 2, 0), k = 0))
}