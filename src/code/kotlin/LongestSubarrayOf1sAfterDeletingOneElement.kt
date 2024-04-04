package code.kotlin

class LongestSubarrayOf1sAfterDeletingOneElement {
    fun longestSubarray(nums: IntArray): Int {
        var current = -1
        var prev = -1
        var maxCount = 0

        nums.forEachIndexed { index, num ->
            if (num == 0) {
                maxCount = maxOf(maxCount, index - prev - if (current == prev) 1 else 2)
                prev = current
                current = index
            }
        }

        return if (current == -1) nums.size - 1 else maxOf(maxCount, nums.lastIndex - prev - 1)
    }
}

fun main() {
    val sol = LongestSubarrayOf1sAfterDeletingOneElement()::longestSubarray
    println(sol(intArrayOf(1, 1, 0, 1)))
    println(sol(intArrayOf(0, 1, 1, 1, 0, 1, 1, 0, 1)))
    println(sol(intArrayOf(1, 1, 1)))
}