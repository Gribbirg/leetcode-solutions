package code.kotlin

import kotlin.math.abs
import kotlin.math.min

class Solution530 {
    fun getMinimumDifference(root: TreeNode?): Int {
        var prev: Int? = null
        var diff = Int.MAX_VALUE

        fun dfs(node: TreeNode?) {
            if (node == null) return

            dfs(node.left)

            prev?.let { diff = min(diff, abs(it - node.`val`)) }
            prev = node.`val`

            dfs(node.right)
        }

        dfs(root)
        return diff
    }
}

fun main() {
    val sol = Solution530()
    val root = TreeNode(arrayListOf(236, 104, 701, null, 227, null, 911))
    println(sol.getMinimumDifference(root))
}