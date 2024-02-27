package code.kotlin

import code.kotlin.structures.TreeNode
import kotlin.math.max

class DiameterOfBinaryTree {
    private var max = 0
    fun diameterOfBinaryTree(root: TreeNode?): Int {
        max = 0
        findDiameterOfBinaryTree(root)
        return max
    }

    private fun findDiameterOfBinaryTree(node: TreeNode?): Int {
        if (node == null) return -1

        val left = findDiameterOfBinaryTree(node.left) + 1
        val right = findDiameterOfBinaryTree(node.right) + 1

        max = max.coerceAtLeast(left + right)

        return max(left, right)
    }
}

fun main() {
    val sol = DiameterOfBinaryTree()
    println(sol.diameterOfBinaryTree(TreeNode(arrayListOf(1, 2, 3, 4, 5))))
    println(sol.diameterOfBinaryTree(TreeNode(arrayListOf(1, 2))))
}