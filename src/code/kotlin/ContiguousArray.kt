package code.kotlin

import kotlin.math.max

class ContiguousArray {
    fun findMaxLength(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        var res = 0
        var sum = 0

        nums.forEachIndexed { i, value ->
            sum += if (value == 0) -1 else 1
            if (sum == 0) {
                res = i + 1
            } else if (map.containsKey(sum)) {
                res = max(res, i - map[sum]!!)
            } else {
                map[sum] = i
            }
        }

        return res
    }
}

fun main() {
    val sol = ContiguousArray()
    println(sol.findMaxLength(intArrayOf(0, 1)))
    println(sol.findMaxLength(intArrayOf(0, 1, 0)))
}