package code.kotlin

import code.kotlin.structures.TreeNode
import kotlin.math.abs

class DistributeCoinsInBinaryTree {
    fun distributeCoins(root: TreeNode?): Int {
        var res = 0

        fun countSteps(node: TreeNode?): Int {
            if (node == null) return 0
            val leftCoins = countSteps(node.left)
            val rightCoins = countSteps(node.right)
            res += abs(leftCoins) + abs(rightCoins)
            return (node.`val` - 1) + leftCoins + rightCoins
        }

        countSteps(root)
        return res
    }
}

fun main() {
    val sol = DistributeCoinsInBinaryTree()
    println(sol.distributeCoins(TreeNode(listOf(3, 0, 0))))
    println(sol.distributeCoins(TreeNode(listOf(0, 3, 0))))
}