package code.kotlin

import code.kotlin.structures.TreeNode

class SmallestStringStartingFromLeaf {
    fun smallestFromLeaf(root: TreeNode?, current: String = ""): String =
        if (root == null)
            current
        else if (root.left != null && root.right == null)
            smallestFromLeaf(root.left, (root.`val` + 97).toChar() + current)
        else if (root.left == null && root.right != null)
            smallestFromLeaf(root.right, (root.`val` + 97).toChar() + current)
        else
            minOf(
                smallestFromLeaf(root.left, (root.`val` + 97).toChar() + current),
                smallestFromLeaf(root.right, (root.`val` + 97).toChar() + current)
            )
}

fun main() {
    val sol = SmallestStringStartingFromLeaf()
    println(sol.smallestFromLeaf(TreeNode(listOf(0, 1, 2, 3, 4, 3, 4))))
    println(sol.smallestFromLeaf(TreeNode(listOf(25, 1, 3, 1, 3, 0, 2))))
    println(sol.smallestFromLeaf(TreeNode(listOf(2, 2, 1, null, 1, 0, null, 0))))
    println(sol.smallestFromLeaf(TreeNode(listOf(4, 0, 1, 1))))
    println(sol.smallestFromLeaf(TreeNode(listOf(25, 1, null, 0, 0, 1, null, null, null, 0))))
}