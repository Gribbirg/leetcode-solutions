package code.kotlin

import code.kotlin.structures.TreeNode
import java.util.LinkedList
import java.util.Queue

class FindBottomLeftTreeValue {
    fun findBottomLeftValue(root: TreeNode?): Int {
        val queue: Queue<TreeNode> = LinkedList()
        queue.add(root)
        var res: Int = root!!.`val`

        while (queue.isNotEmpty()) {
            val node = queue.poll()
            res = node.`val`

            node.right?.also { queue.add(it) }
            node.left?.also { queue.add(it) }
        }

        return res
    }
}

fun main() {
    val sol = FindBottomLeftTreeValue()
    println(sol.findBottomLeftValue(TreeNode(arrayListOf(2, 1, 3))))
    println(sol.findBottomLeftValue(TreeNode(arrayListOf(1, 2, 3, 4, null, 5, 6, null, null, 7))))
}