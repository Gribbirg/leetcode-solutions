package code.kotlin

import kotlin.math.min

class MinimumNumberOfArrowsToBurstBalloons {
    fun findMinArrowShots(points: Array<IntArray>): Int {
        val pointsSorted = points.sortedBy { it[0] }
        var res = 0
        var i = 0
        while (i < pointsSorted.size) {
            var max = pointsSorted[i][1]
            while (i < pointsSorted.size && pointsSorted[i][0] <= max) {
                max = min(max, pointsSorted[i][1])
                i++
            }
            res++
        }
        return res
    }
}

fun main() {
    val sol = MinimumNumberOfArrowsToBurstBalloons()
    println(sol.findMinArrowShots(arrayOf(
        intArrayOf(8, 16),
        intArrayOf(2, 8),
        intArrayOf(1, 6),
        intArrayOf(7, 12),
    )))
    println(sol.findMinArrowShots(arrayOf(
        intArrayOf(1, 2),
        intArrayOf(3, 4),
        intArrayOf(5, 6),
        intArrayOf(7, 8),
    )))
    println(sol.findMinArrowShots(arrayOf(
        intArrayOf(1, 2),
        intArrayOf(2, 3),
        intArrayOf(3, 4),
        intArrayOf(4, 5),
    )))
    println(sol.findMinArrowShots(arrayOf(
        intArrayOf(3, 9),
        intArrayOf(7, 12),
        intArrayOf(3, 8),
        intArrayOf(6, 8),
        intArrayOf(9, 10),
        intArrayOf(2, 9),
        intArrayOf(0, 9),
        intArrayOf(3, 9),
        intArrayOf(0, 6),
        intArrayOf(2, 8),
    )))
}