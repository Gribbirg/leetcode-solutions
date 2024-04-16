package code.kotlin

class FindMinimumInRotatedSortedArray {
    fun findMin(nums: IntArray): Int {
        var left = 0
        var right = nums.lastIndex

        while (left < right) {
            val mid = (left + right) / 2

            if (nums[mid] > nums[right])
                left = mid + 1
            else
                right = mid
        }

        return nums[left]
    }
}

fun main() {
    val sol = FindMinimumInRotatedSortedArray()
    println(sol.findMin(intArrayOf(3, 4, 5, 1, 2)))
    println(sol.findMin(intArrayOf(4, 5, 6, 7, 0, 1, 2)))
    println(sol.findMin(intArrayOf(11, 13, 15, 17)))
}