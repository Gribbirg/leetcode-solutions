package code.kotlin

import code.kotlin.auxiliary.TreeNode

class ConvertSortedArrayToBinarySearchTree {
    fun sortedArrayToBST(nums: IntArray, start: Int = 0, end: Int = nums.size - 1): TreeNode? {
        if (start > end)
            return null

        val middle = start + (end - start) / 2

        return TreeNode(nums[middle]).apply {
            left = sortedArrayToBST(nums, start, middle - 1)
            right = sortedArrayToBST(nums, middle + 1, end)
        }
    }
}

fun main() {
    val sol = ConvertSortedArrayToBinarySearchTree()
    val root = sol.sortedArrayToBST(intArrayOf(-10, -3, 0, 5, 9))
    println(root)
}