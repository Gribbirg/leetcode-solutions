package code.kotlin

import java.util.*

class MergeIntervals {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        intervals.sortBy { it[0] }
        val res = LinkedList<IntArray>().also { it.add(intervals[0]) }

        intervals.forEach { interval ->
            val current = res.last()
            if (interval[0] > current[1]) {
                res.add(interval)
            } else if (current[1] < interval[1]) {
                current[1] = interval[1]
            }
        }

        return res.toTypedArray()
    }
}

fun main() {
    val sol = MergeIntervals()::merge
    println(
        sol(arrayOf(intArrayOf(1, 3), intArrayOf(2, 6), intArrayOf(8, 10), intArrayOf(15, 18)))
            .map { it.toList() }
            .toList()
    )
    println(sol(arrayOf(intArrayOf(1, 4), intArrayOf(4, 5))).map { it.toList() }.toList())
}