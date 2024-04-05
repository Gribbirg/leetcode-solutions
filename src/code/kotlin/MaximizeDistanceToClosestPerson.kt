package code.kotlin

import kotlin.math.max

class MaximizeDistanceToClosestPerson {
    fun maxDistToClosest(seats: IntArray): Int {

        var i = 0
        while (seats[i] == 0) {
            i++
        }
        val firstSpace = i

        var lastOccupied = i
        var maxSpace = 0

        while (i < seats.size) {
            if (seats[i] == 1) {
                maxSpace = max(maxSpace, i - lastOccupied)
                lastOccupied = i
            }
            i++
        }

        val resSpace = maxSpace / 2
        val lastSpace = i - lastOccupied - 1
        if (firstSpace > resSpace || lastSpace > resSpace) {
            return max(firstSpace, lastSpace)
        }

        return resSpace
    }
}

fun main() {
    val sol = MaximizeDistanceToClosestPerson()::maxDistToClosest
    println(sol(intArrayOf(1, 0, 0, 0, 1, 0, 1)))
    println(sol(intArrayOf(1, 0, 0, 0)))
    println(sol(intArrayOf(0, 1)))
    println(sol(intArrayOf(0, 0, 1, 0, 1, 1)))
}