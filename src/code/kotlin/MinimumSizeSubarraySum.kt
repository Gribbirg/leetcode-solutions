package code.kotlin

class MinimumSizeSubarraySum {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var left = 0
        var sum = 0
        var res = nums.size + 1

        nums.forEachIndexed { right, value ->
            sum += value
            while (sum >= target) {
                sum -= nums[left]
                res = minOf(res, right - left + 1)
                left++
            }
        }

        return if (res == nums.size + 1) 0 else res
    }
}

fun main() {
    val sol = MinimumSizeSubarraySum()
    println(sol.minSubArrayLen(7, intArrayOf(2, 3, 1, 2, 4, 3)))
    println(sol.minSubArrayLen(4, intArrayOf(1, 4, 4)))
    println(sol.minSubArrayLen(11, intArrayOf(1, 1, 1, 1, 1, 1, 1, 1)))
}