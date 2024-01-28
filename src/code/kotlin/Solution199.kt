package code.kotlin

import java.util.LinkedList
import java.util.Queue

class Solution199 {
    fun rightSideView(root: TreeNode?): List<Int> {
        val list = ArrayList<Int>()

        if (root == null)
            return list

        val order: Queue<TreeNode> = LinkedList()
        order.add(root)
        var node = root
        while (!order.isEmpty()) {
            val size = order.size
            for (i in 0..<size) {
                node = order.poll()
                if (node.left != null) order.add(node.left)
                if (node.right != null) order.add(node.right)
            }
            list.add(node!!.`val`)
        }

        return list
    }
}

fun main() {
    val sol = Solution199()
    val root = TreeNode(1)
    root.left = TreeNode(2)
    root.left?.right = TreeNode(5)
    root.right = TreeNode(3)
//    root.right?.right = TreeNode(4)
    println(sol.rightSideView(root))
}