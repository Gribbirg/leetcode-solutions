package code.kotlin

import code.kotlin.structures.TreeNode

class EvaluateBooleanBinaryTree {
    fun evaluateTree(root: TreeNode): Boolean = when (root.`val`) {
        0 -> false
        1 -> true
        2 -> evaluateTree(root.left!!) || evaluateTree(root.right!!)
        3 -> evaluateTree(root.left!!) && evaluateTree(root.right!!)
        else -> throw IllegalArgumentException("Unknown evaluate tree ${root.`val`}")
    }
}

fun main() {
    val sol = EvaluateBooleanBinaryTree()
    println(sol.evaluateTree(TreeNode(listOf(2, 1, 3, null, null, 0, 1))))
    println(sol.evaluateTree(TreeNode(listOf(0))))
}