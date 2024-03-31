package code.kotlin

import kotlin.math.max
import kotlin.math.min

class CountSubarraysWithFixedBounds {
    fun countSubarrays(nums: IntArray, minK: Int, maxK: Int): Long {
        var res = 0L
        var maxI = -1
        var minI = -1

        var left = 0
        nums.forEachIndexed { right, rightNum ->

            if (rightNum < minK || rightNum > maxK) {

                left = right + 1

            } else {

                if (rightNum == minK)
                    minI = right
                if (rightNum == maxK)
                    maxI = right

                res += max(0, min(maxI, minI) - left + 1)
            }
        }

        return res
    }
}

fun main() {
    val sol = CountSubarraysWithFixedBounds()::countSubarrays
    println(sol(intArrayOf(1, 3, 5, 2, 7, 5), 1, 5))
    println(sol(intArrayOf(1, 1, 1, 1), 1, 1))
}