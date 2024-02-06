package code.kotlin

import code.kotlin.structures.TreeNode

class SameTree {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean =
        if (p == null || q == null)
            p == q
        else
            p.`val` == q.`val` && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
}

fun main() {
    val solution = SameTree()

    val p = TreeNode(1)
//    p.left = TreeNode(2)
    p.right = TreeNode(3)

    val q = TreeNode(1)
    q.left = TreeNode(2)
    q.right = TreeNode(3)

    println(solution.isSameTree(p, q))
}