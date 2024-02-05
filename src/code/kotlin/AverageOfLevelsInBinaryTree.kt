package code.kotlin

import code.kotlin.auxiliary.TreeNode
import java.util.LinkedList
import java.util.Queue

class AverageOfLevelsInBinaryTree {
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        val res = ArrayList<Double>()

        if (root == null) {
            return res.toDoubleArray()
        }

        val queue: Queue<TreeNode> = LinkedList()

        queue.add(root)
        while (!queue.isEmpty()) {
            val size = queue.size
            var sum = .0
            repeat(size) {
                queue.poll().run {
                    sum += `val`
                    left?.let { queue.add(it) }
                    right?.let { queue.add(it) }
                }
            }
            res.add(sum / size)
        }

        return res.toDoubleArray()
    }
}

fun main() {
    val sol = AverageOfLevelsInBinaryTree()
    val root = TreeNode(arrayListOf(2147483647,2147483647,2147483647))
    println(sol.averageOfLevels(root).toList())
}