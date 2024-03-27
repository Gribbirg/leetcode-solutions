package code.kotlin

class SubarrayProductLessThanK {
    fun numSubarrayProductLessThanK(nums: IntArray, k: Int): Int {
        if (k <= 1) return 0

        var l = 0
        var value = 1
        var count = 0

        nums.forEachIndexed { r, num ->
            value *= num

            while (value >= k)
                value /= nums[l++]

            count += r - l + 1
        }

        return count
    }
}

fun main() {
    val sol = SubarrayProductLessThanK()::numSubarrayProductLessThanK
    println(sol(intArrayOf(10, 5, 2, 6), 100))
    println(sol(intArrayOf(1, 2, 3), 0))
}