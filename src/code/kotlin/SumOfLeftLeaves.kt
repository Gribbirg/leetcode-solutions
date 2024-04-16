package code.kotlin

import code.kotlin.structures.TreeNode

class SumOfLeftLeaves {
    fun sumOfLeftLeaves(root: TreeNode?, isLeft: Boolean = false): Int =
        if (root == null) 0
        else if (root.left == null && root.right == null && isLeft) root.`val`
        else sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false)
}

fun main() {
    val sol = SumOfLeftLeaves()
    println(sol.sumOfLeftLeaves(TreeNode(listOf(3, 9, 20, null, null, 15, 7))))
    println(sol.sumOfLeftLeaves(TreeNode(listOf(1))))
}