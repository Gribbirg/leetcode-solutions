package code.kotlin

import code.kotlin.auxiliary.TreeNode

class SymmetricTree {
    fun isSymmetric(root: TreeNode?): Boolean {

        fun areNodesSymmetric(nodeLeft: TreeNode?, nodeRight: TreeNode?): Boolean =
            nodeLeft == null && nodeRight == null ||
                    nodeLeft != null && nodeRight != null
                    && nodeLeft.`val` == nodeRight.`val`
                    && areNodesSymmetric(nodeLeft.left, nodeRight.right)
                    && areNodesSymmetric(nodeLeft.right, nodeRight.left)

        return areNodesSymmetric(root?.left, root?.right)
    }
}

fun main() {
    val sol = SymmetricTree()
    val root = TreeNode(arrayListOf(1,2,3))
    println(sol.isSymmetric(root))

}