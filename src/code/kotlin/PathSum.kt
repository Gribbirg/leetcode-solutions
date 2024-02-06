package code.kotlin

import code.kotlin.structures.TreeNode

class PathSum {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if (root == null)
            return false
        val target = targetSum - root.`val`
        return root.left == null && root.right == null && target == 0 ||
                hasPathSum(root.left, target) ||
                hasPathSum(root.right, target)
    }
}

fun main() {
    val sol = PathSum()
    val root = TreeNode(5)
    root.left = TreeNode(4)
    root.left?.left = TreeNode(11)
    root.left?.left?.left = TreeNode(7)
    root.left?.left?.right = TreeNode(2)
    root.right = TreeNode(8)
    root.right?.left = TreeNode(13)
    root.right?.right = TreeNode(4)
    root.right?.right?.right = TreeNode(1)
    println(sol.hasPathSum(root, 22))
}