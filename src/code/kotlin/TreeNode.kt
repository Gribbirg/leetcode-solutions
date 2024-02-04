package code.kotlin

import java.util.LinkedList
import java.util.Queue

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null


    constructor(array: ArrayList<Int?>) : this(array[0]!!) {
        val queue: Queue<TreeNode> = LinkedList()
        queue.add(this)

        val iterator = array.iterator()
        iterator.next()
        while (iterator.hasNext()) {
            var x = iterator.next()
            val node = queue.poll()

            x?.let {
                node.left = TreeNode(it)
                queue.add(node.left)
            }

            if (iterator.hasNext()) {
                x = iterator.next()
                x?.let {
                    node.right = TreeNode(it)
                    queue.add(node.right)
                }
            } else {
                break
            }
        }
    }

    override fun toString(): String {
        val queue: Queue<TreeNode?> = LinkedList()
        queue.add(this)

        var res = "["

        while (queue.isNotEmpty()) {
            val node = queue.poll()

            res += node?.`val` ?: "null"
            res += ", "

            node?.left?.let { queue.add(it) }
            node?.right?.let { queue.add(it) }
        }
        res = res.substring(0, res.lastIndex - 1)
        res += "]"
        return res
    }
}