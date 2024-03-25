package code.kotlin

import kotlin.math.abs

class FindAllDuplicatesInArray {
    fun findDuplicates(nums: IntArray): List<Int> {
        val res = mutableListOf<Int>()

        nums.forEach { num ->
            val absNum = abs(num)
            val idx = absNum - 1
            if (nums[idx] < 0)
                res.add(absNum)
            else
                nums[idx] *= -1
        }

        return res
    }
}

fun main() {
    val sol = FindAllDuplicatesInArray()::findDuplicates
    println(sol(intArrayOf(4, 3, 2, 7, 8, 2, 3, 1)))
    println(sol(intArrayOf(1, 1, 2)))
    println(sol(intArrayOf(1)))
}