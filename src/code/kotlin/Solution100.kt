package code.kotlin

class Solution100 {
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean =
        if (p == null || q == null)
            p == q
        else
            p.`val` == q.`val` && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
}

fun main() {
    val solution = Solution100()

    val p = TreeNode(1)
//    p.left = TreeNode(2)
    p.right = TreeNode(3)

    val q = TreeNode(1)
    q.left = TreeNode(2)
    q.right = TreeNode(3)

    println(solution.isSameTree(p, q))
}