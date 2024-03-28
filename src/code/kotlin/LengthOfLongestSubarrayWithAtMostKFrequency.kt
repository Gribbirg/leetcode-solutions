package code.kotlin

import kotlin.math.max

class LengthOfLongestSubarrayWithAtMostKFrequency {
    fun maxSubarrayLength(nums: IntArray, k: Int): Int {
        val mapOfCount = HashMap<Int, Int>()
        var left = 0
        var count = 0

        nums.forEachIndexed { right, num ->
            mapOfCount[num] = mapOfCount.getOrDefault(num, 0) + 1
            while (left <= right && mapOfCount.getOrDefault(num, 0) > k) {
                mapOfCount[nums[left]] = mapOfCount[nums[left++]]!! - 1
            }
            count = max(count, right - left + 1)
        }

        return count
    }
}

fun main() {
    val sol = LengthOfLongestSubarrayWithAtMostKFrequency()::maxSubarrayLength
    println(sol(intArrayOf(1, 2, 3, 1, 2, 3, 1, 2), 2))
    println(sol(intArrayOf(1, 2, 1, 2, 1, 2, 1, 2), 1))
    println(sol(intArrayOf(5, 5, 5, 5, 5, 5, 5), 4))
}