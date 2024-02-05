package code.kotlin

import code.kotlin.auxiliary.TreeNode
import kotlin.math.max

class MaximumDepthOfBinaryTree {
    fun maxDepth(root: TreeNode?): Int =
        if (root == null)
            0
        else
            max(maxDepth(root.left), maxDepth(root.right)) + 1
}

fun main() {
    val sol = MaximumDepthOfBinaryTree()
    val root = TreeNode(3)
    root.left = TreeNode(9)
    root.right = TreeNode(20)
    root.right?.left = TreeNode(15)
    root.right?.right = TreeNode(7)
    println(sol.maxDepth(root))
}