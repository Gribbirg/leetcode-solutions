package code.kotlin

import kotlin.math.min

class TaskScheduler {
    fun leastInterval(tasks: CharArray, n: Int): Int {
        val freq = IntArray(26)
        tasks.forEach { task ->
            freq[task - 'A']++
        }
        freq.sort()

        val chunk = freq.last() - 1
        var idle = chunk * n

        for (i in 24 downTo 0) {
            idle -= min(chunk, freq[i])
        }

        return tasks.size + (if (idle > 0) idle else 0)
    }
}

fun main() {
    val sol = TaskScheduler()
    println(sol.leastInterval(charArrayOf('A', 'A', 'A', 'B', 'B', 'B'), 2))
    println(sol.leastInterval(charArrayOf('A', 'C', 'A', 'B', 'D', 'B'), 1))
    println(sol.leastInterval(charArrayOf('A', 'A', 'A', 'B', 'B', 'B'), 3))
}