package code.kotlin

import code.kotlin.auxiliary.TreeNode

class InvertBinaryTree {
    fun invertTree(root: TreeNode?): TreeNode? =
        root?.apply {
            right = invertTree(left).also { left = invertTree(right) }
        }
}


fun main() {
    val sol = InvertBinaryTree()
    val root = TreeNode(arrayListOf(4, 2, 7, 1, 3, 6, 9))
    println(sol.invertTree(root))
}