package code.kotlin

import java.util.*

class FindIfPathExistsInGraph {
    fun validPath(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {

        if (source == destination) {
            return true
        }

        val routes = Array(n) { mutableListOf<Int>() }
        val visited = BooleanArray(n) { false }

        edges.forEach { edge ->
            routes[edge[0]].add(edge[1])
            routes[edge[1]].add(edge[0])
        }

        val queue: Queue<Int> = LinkedList()
        queue.add(source)
        visited[source] = true

        while (queue.isNotEmpty()) {
            val edge = queue.poll()
            routes[edge].forEach {
                if (it == destination) {
                    return true
                }
                if (!visited[it]) {
                    queue.add(it)
                    visited[it] = true
                }
            }
        }

        return false
    }
}

fun main() {
    val sol = FindIfPathExistsInGraph()
    println(
        sol.validPath(
            n = 3,
            edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 0)),
            source = 0,
            destination = 2
        )
    )
    println(
        sol.validPath(
            n = 6,
            edges = arrayOf(
                intArrayOf(0, 1),
                intArrayOf(0, 2),
                intArrayOf(3, 5),
                intArrayOf(5, 4),
                intArrayOf(4, 3)
            ),
            source = 0,
            destination = 5
        )
    )
}