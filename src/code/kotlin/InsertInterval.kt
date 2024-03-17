package code.kotlin

import kotlin.math.max
import kotlin.math.min

class InsertInterval {
    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        val res = ArrayList<IntArray>()
        var i = 0

        while (i < intervals.size && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i])
            i++
        }

        var newIntervalMutable = newInterval
        if (i < intervals.size && intervals[i][0] <= newInterval[1]) {
            val newIntervalStart = min(intervals[i][0], newInterval[0])
            var newIntervalEnd = max(newInterval[1], intervals[i][1])
            i++
            while (i < intervals.size && intervals[i][0] <= newInterval[1]) {
                newIntervalEnd = max(newInterval[1], intervals[i][1])
                i++
            }
            newIntervalMutable = intArrayOf(newIntervalStart, newIntervalEnd)
        }
        res.add(newIntervalMutable)

        while (i < intervals.size) {
            res.add(intervals[i])
            i++
        }

        return Array(res.size) { res[it] }
    }
}

fun main() {
    val sol = InsertInterval()
    println(
        sol.insert(
            arrayOf(
                intArrayOf(1, 3),
                intArrayOf(6, 9)
            ),
            intArrayOf(2, 5)
        ).map { it.toList() }.toList()
    )
    println(
        sol.insert(
            arrayOf(
                intArrayOf(1, 2),
                intArrayOf(3, 5),
                intArrayOf(6, 7),
                intArrayOf(8, 10),
                intArrayOf(12, 16)
            ),
            intArrayOf(4, 8)
        ).map { it.toList() }.toList()
    )
}