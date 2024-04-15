package code.kotlin

import code.kotlin.structures.TreeNode

class SumRootToLeafNumbers {
    fun sumNumbers(root: TreeNode?, path: Int = 0): Int {
        if (root == null) return 0

        val newPath = path * 10 + root.`val`

        return if (root.left == null && root.right == null) newPath
        else sumNumbers(root.left, newPath) + sumNumbers(root.right, newPath)
    }
}

fun main() {
    val sol = SumRootToLeafNumbers()
    println(sol.sumNumbers(TreeNode(listOf(1, 2, 3))))
    println(sol.sumNumbers(TreeNode(listOf(4, 9, 0, 5, 1))))
}