package code.kotlin

import code.kotlin.structures.TreeNode
import kotlin.math.pow

class BinaryTreeMaximumPathSum {
    fun maxPathSum(root: TreeNode?): Int {
        var maxSum = -(10.0.pow(8)).toInt()

        fun findMaxSum(node: TreeNode?): Int {
            if (node == null) {
                return 0
            }

            val leftSum = maxOf(findMaxSum(node.left), 0)
            val rightSum = maxOf(findMaxSum(node.right), 0)

            maxSum = maxOf(maxSum, leftSum + rightSum + node.`val`)

            return maxOf(leftSum, rightSum) + node.`val`
        }

        findMaxSum(root)
        return maxSum
    }
}

fun main() {
    val sol = BinaryTreeMaximumPathSum()
    println(sol.maxPathSum(root = TreeNode(listOf(1, 2, 3))))
    println(sol.maxPathSum(root = TreeNode(listOf(-10, 9, 20, null, null, 15, 7))))
}