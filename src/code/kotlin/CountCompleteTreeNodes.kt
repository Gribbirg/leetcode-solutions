package code.kotlin

import code.kotlin.auxiliary.TreeNode

class CountCompleteTreeNodes {
    fun countNodes(root: TreeNode?): Int =
        when {
            root == null -> 0
            else -> countNodes(root.left) + countNodes(root.right) + 1
        }
}

fun main() {
    val sol = CountCompleteTreeNodes()
    val root = TreeNode(1)
    root.left = TreeNode(2)
    root.left?.left = TreeNode(4)
    root.left?.right = TreeNode(5)
    root.right = TreeNode(3)
    root.right?.left = TreeNode(6)
    println(sol.countNodes(root))
}