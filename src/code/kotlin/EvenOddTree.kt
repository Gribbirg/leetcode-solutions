package code.kotlin

import code.kotlin.structures.TreeNode
import java.util.*

class EvenOddTree {
    fun isEvenOddTree(root: TreeNode?): Boolean {
        val queue = LinkedList<TreeNode>()
        queue.add(root!!)

        var level = 0
        while (queue.isNotEmpty()) {
            var prevValue = -1
            val size = queue.size
            for (i in 0..<size) {
                val curNode = queue.pollFirst() ?: continue
                if (curNode.`val` % 2 == level % 2) return false
                if (prevValue != -1) {
                    val correctOrder = if (level % 2 == 0) {
                        curNode.`val` > prevValue
                    } else {
                        curNode.`val` < prevValue
                    }
                    if (!correctOrder) return false
                }
                prevValue = curNode.`val`

                curNode.left?.let { queue.add(it) }
                curNode.right?.let { queue.add(it) }
            }
            level++
        }
        return true
    }
}

fun main() {
    val sol = EvenOddTree()
    println(sol.isEvenOddTree(TreeNode(arrayListOf(1, 10, 4, 3, null, 7, 9, 12, 8, 6, null, null, 2))))
    println(sol.isEvenOddTree(TreeNode(arrayListOf(5, 4, 2, 3, 3, 7))))
    println(sol.isEvenOddTree(TreeNode(arrayListOf(5, 9, 1, 3, 5, 7))))
    println(sol.isEvenOddTree(TreeNode(arrayListOf(11, 18, 14, 3, 7, null, null, null, null, 18, null, 6))))
}