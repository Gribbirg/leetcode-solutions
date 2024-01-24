package code.kotlin

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class Solution1457 {
    fun pseudoPalindromicPaths (root: TreeNode?): Int {
        if (root == null) return 0
        return pseudoPalindromicPathsFounder(root, HashSet())
    }

    private fun pseudoPalindromicPathsFounder(node: TreeNode, set: HashSet<Int>): Int {
        if (!set.add(node.`val`)) {
            set.remove(node.`val`)
        }
        var ans = 0
        ans = if (node.left != null && node.right != null) pseudoPalindromicPathsFounder(node.left!!, set) + pseudoPalindromicPathsFounder(node.right!!, set)
        else if (node.left != null) pseudoPalindromicPathsFounder(node.left!!, set)
        else if (node.right != null) pseudoPalindromicPathsFounder(node.right!!, set)
        else if (set.size <= 1) 1 else 0
        if (!set.add(node.`val`)) {
            set.remove(node.`val`)
        }
        return ans
    }
}

fun main() {
    val ti = TreeNode(2)
    ti.left = TreeNode(3)
    ti.left?.left = TreeNode(3)
    ti.left?.right = TreeNode(1)
    ti.right = TreeNode(1)
    ti.right?.right = TreeNode(1)

    val solution = Solution1457()
    println(solution.pseudoPalindromicPaths(ti))
}

