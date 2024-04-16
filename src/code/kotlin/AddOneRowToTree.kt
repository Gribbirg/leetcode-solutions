package code.kotlin

import code.kotlin.structures.TreeNode

class AddOneRowToTree {
    fun addOneRow(root: TreeNode?, `val`: Int, depth: Int): TreeNode? {
        if (root == null) return null

        if (depth == 1) {
            return TreeNode(`val`).also { it.left = root }
        }

        if (depth == 2) {
            root.left = TreeNode(`val`).also { it.left = root.left }
            root.right = TreeNode(`val`).also { it.right = root.right }
        } else {
            root.left = addOneRow(root.left, `val`, depth - 1)
            root.right = addOneRow(root.right, `val`, depth - 1)
        }

        return root
    }
}

fun main() {
    val sol = AddOneRowToTree()
    println(sol.addOneRow(TreeNode(listOf(4, 2, 6, 3, 1, 5)), 1, 2))
    println(sol.addOneRow(TreeNode(listOf(4, 2, null, 3, 1)), 1, 3))
}