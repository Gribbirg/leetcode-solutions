package code.kotlin

class SumOfDistancesInTree {
    fun sumOfDistancesInTree(n: Int, edges: Array<IntArray>): IntArray {
        val graph = List<MutableList<Int>>(n) { mutableListOf() }
        val count = IntArray(n) { 1 }
        val res = IntArray(n)

        edges.forEach {
            graph[it[0]].add(it[1])
            graph[it[1]].add(it[0])
        }

        fun dfs(node: Int, parent: Int) {
            for (child in graph[node]) {
                if (child != parent) {
                    dfs(child, node)
                    count[node] += count[child]
                    res[node] += res[child] + count[child]
                }
            }
        }

        fun dfs2(node: Int, parent: Int) {
            for (child in graph[node]) {
                if (child != parent) {
                    res[child] = res[node] - count[child] + (count.size - count[child])
                    dfs2(child, node)
                }
            }
        }

        dfs(0, -1)
        dfs2(0, -1)

        return res
    }
}

fun main() {
    val sol = SumOfDistancesInTree()
    println(
        sol.sumOfDistancesInTree(
            n = 6,
            edges = arrayOf(
                intArrayOf(0, 1),
                intArrayOf(0, 2),
                intArrayOf(2, 3),
                intArrayOf(2, 4),
                intArrayOf(2, 5)
            )
        ).toList()
    )
    println(
        sol.sumOfDistancesInTree(
            n = 1, edges = arrayOf()
        ).toList()
    )
    println(sol.sumOfDistancesInTree(n = 2, edges = arrayOf(intArrayOf(1,0))).toList())
}