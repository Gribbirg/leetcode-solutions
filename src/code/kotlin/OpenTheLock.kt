package code.kotlin

import java.util.*

class OpenTheLock {
    fun openLock(deadends: Array<String>, target: String): Int {

        if (target == "0000") {
            return 0
        }

        val deltas = intArrayOf(-1, 1)

        val blocksSet = HashSet<String>()
        deadends.forEach { blocksSet.add(it) }
        if ("0000" in blocksSet) {
            return -1
        }

        val queue: Queue<String> = LinkedList()
        queue.add("0000")

        val visited = HashSet<String>()

        var steps = 1

        while (queue.isNotEmpty()) {
            val size = queue.size
            repeat(size) {
                val start = queue.poll()
                for (i in start.indices) {
                    for (delta in deltas) {
                        val newNum = (start[i] - '0' + delta + 10) % 10
                        val end = start.substring(0, i) + newNum + start.substring(i + 1)

                        if (end !in blocksSet && end !in visited) {
                            if (end == target) {
                                return steps
                            }
                            queue.add(end)
                            visited.add(end)
                        }
                    }
                }
            }
            steps++
        }

        return -1
    }
}

fun main() {
    val sol = OpenTheLock()
    println(sol.openLock(arrayOf("0201", "0101", "0102", "1212", "2002"), "0202"))
    println(sol.openLock(arrayOf("8888"), "0009"))
    println(sol.openLock(arrayOf("8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"), "8888"))
}