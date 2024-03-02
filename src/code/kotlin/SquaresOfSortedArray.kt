package code.kotlin

import kotlin.math.abs

class SquaresOfSortedArray {
    fun sortedSquares(nums: IntArray): IntArray {
        var start = 0
        var end = nums.lastIndex
        val res = IntArray(nums.size)

        for (i in nums.lastIndex downTo 0) {
            if (abs(nums[start]) >= abs(nums[end])) {
                res[i] = nums[start] * nums[start]
                start++
            } else {
                res[i] = nums[end] * nums[end]
                end--
            }
        }

        return res
    }
}

fun main() {
    val sol = SquaresOfSortedArray()
    println(sol.sortedSquares(intArrayOf(-4, -1, 0, 3, 10)).toList())
    println(sol.sortedSquares(intArrayOf(-7, -3, 2, 3, 11)).toList())
}