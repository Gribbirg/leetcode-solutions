package code.kotlin

import java.util.*

class MinimumHeightTrees {
    fun findMinHeightTrees(n: Int, edges: Array<IntArray>): List<Int> {
        if (n == 1) return listOf(0)

        val ind = IntArray(n)
        val map = HashMap<Int, MutableList<Int>>()
        for (edge in edges) {
            ind[edge[0]]++
            ind[edge[1]]++
            map.putIfAbsent(edge[0], mutableListOf())
            map.putIfAbsent(edge[1], mutableListOf())
            map[edge[0]]!!.add(edge[1])
            map[edge[1]]!!.add(edge[0])
        }

        val queue: Queue<Int> = LinkedList()
        ind.forEachIndexed { i, value ->
            if (value == 1) {
                queue.add(i)
            }
        }

        var processed = 0
        while (n - processed > 2) {
            val size = queue.size
            processed += size
            for (i in 0..<size) {
                val poll = queue.poll()
                for (adj in map[poll]!!) {
                    if (--ind[adj] == 1) {
                        queue.add(adj)
                    }
                }
            }
        }

        return queue.toList()
    }
}

fun main() {
    val sol = MinimumHeightTrees()
    println(sol.findMinHeightTrees(4, arrayOf(intArrayOf(1, 0), intArrayOf(1, 2), intArrayOf(1, 3))))
    println(
        sol.findMinHeightTrees(
            6,
            arrayOf(intArrayOf(3, 0), intArrayOf(3, 1), intArrayOf(3, 2), intArrayOf(3, 4), intArrayOf(5, 4))
        )
    )
}