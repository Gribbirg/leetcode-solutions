package code.kotlin

import code.kotlin.structures.TreeNode

class ValidateBinarySearchTree {
    fun isValidBST(root: TreeNode?, minVal: Long = Long.MIN_VALUE, maxVal: Long = Long.MAX_VALUE): Boolean =
        if (root == null) true
        else if (root.`val` !in (minVal + 1)..<maxVal) false
        else isValidBST(root.right, root.`val`.toLong(), maxVal) &&
                isValidBST(root.left, minVal, root.`val`.toLong())
}

fun main() {
    val sol = ValidateBinarySearchTree()
    println(sol.isValidBST(TreeNode(listOf(2, 1, 3))))
    println(sol.isValidBST(TreeNode(listOf(5, 1, 4, null, null, 3, 6))))
}