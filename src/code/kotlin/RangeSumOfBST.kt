package code.kotlin

import code.kotlin.structures.TreeNode

class RangeSumOfBST {
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int =
        if (root == null) 0
        else (if (root.`val` >= low) rangeSumBST(root.left, low, high) else 0) +
                (if (root.`val` <= high) rangeSumBST(root.right, low, high) else 0) +
                (if (root.`val` in low..high) root.`val` else 0)

}

fun main() {
    val sol = RangeSumOfBST()::rangeSumBST
    println(sol(TreeNode(listOf(10, 5, 15, 3, 7, null, 18)), 7, 15))
    println(sol(TreeNode(listOf(10, 5, 15, 3, 7, 13, 18, 1, null, 6)), 6, 10))
}