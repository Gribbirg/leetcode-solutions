package code.kotlin

class ContinuousSubarraySum {
    fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
        val remainders = mutableMapOf<Int, Int>()
        remainders[0] = -1
        var sum = 0

        nums.forEachIndexed { index,  num ->
            sum += num
            sum %= k
            if (remainders.containsKey(sum) && index - remainders[sum]!! > 1) {
                return true
            }
            remainders.putIfAbsent(sum, index)
        }

        return false
    }
}

fun main() {
    val sol = ContinuousSubarraySum()
    println(sol.checkSubarraySum(intArrayOf(23, 2, 4, 6, 7), 6))
    println(sol.checkSubarraySum(intArrayOf(23, 2, 6, 4, 7), 13))
    println(sol.checkSubarraySum(intArrayOf(5, 0, 0, 0), 3))
    println(sol.checkSubarraySum(intArrayOf(2, 4, 3), 6))
}