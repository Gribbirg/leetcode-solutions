package problem1457

import kotlin.math.max

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution {
    fun pseudoPalindromicPaths (root: TreeNode?): Int {
        if (root == null) return 0
        return pseudoPalindromicPathsFounder(root, HashSet())
    }

    private fun pseudoPalindromicPathsFounder(node: TreeNode, set: HashSet<Int>): Int {
        if (!set.add(node.`val`)) {
            set.remove(node.`val`)
        }

        if (node.left != null && node.right != null) return pseudoPalindromicPathsFounder(node.left!!, set) + pseudoPalindromicPathsFounder(node.right!!, set)
        if (node.left != null) return pseudoPalindromicPathsFounder(node.left!!, set)
        if (node.right != null) return pseudoPalindromicPathsFounder(node.right!!, set)
        return if (set.size <= 1) 1 else 0
    }
}

fun main() {
    val ti = TreeNode(2)
    ti.left = TreeNode(3)
    ti.left?.left = TreeNode(3)
    ti.left?.right = TreeNode(1)
    ti.right = TreeNode(1)
    ti.right?.right = TreeNode(1)

    val solution = Solution()
    println(solution.pseudoPalindromicPaths(ti))
}

