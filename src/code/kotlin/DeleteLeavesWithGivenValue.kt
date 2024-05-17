package code.kotlin

import code.kotlin.structures.TreeNode

class DeleteLeavesWithGivenValue {
    fun removeLeafNodes(root: TreeNode?, target: Int): TreeNode? {
        if (root == null) return null
        root.left = removeLeafNodes(root.left, target)
        root.right = removeLeafNodes(root.right, target)
        return if (root.left == null && root.right == null && root.`val` == target) null else root
    }
}

fun main() {
    val sol = DeleteLeavesWithGivenValue()
    println(sol.removeLeafNodes(TreeNode(listOf(1, 2, 3, 2, null, 2, 4)), 2))
    println(sol.removeLeafNodes(TreeNode(listOf(1, 3, 3, 3, 2)), 3))
    println(sol.removeLeafNodes(TreeNode(listOf(1, 2, null, 2, null, 2)), 2))
}