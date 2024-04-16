package code.kotlin

class SearchInRotatedSortedArray {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.lastIndex

        while (left <= right) {
            val mid = (left + right) / 2

            if (nums[mid] == target)
                return mid

            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid])
                    right = mid - 1
                else
                    left = mid + 1
            } else {
                if (nums[right] >= target && target > nums[mid])
                    left = mid + 1
                else
                    right = mid - 1
            }
        }

        return -1
    }
}

fun main() {
    val sol = SearchInRotatedSortedArray()
    println(sol.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0))
    println(sol.search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 3))
    println(sol.search(intArrayOf(1), 0))
}