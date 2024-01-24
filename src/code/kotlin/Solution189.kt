package code.kotlin

class Solution189 {
    fun rotate(nums: IntArray, k: Int): Unit {
        val point = k % nums.size
        with(nums) {
            reverse(0, nums.size)
            reverse(0, point)
            reverse(point, nums.size)
        }
    }
}

fun main() {
    val nums = intArrayOf(1,2,3,4,5,6,7)
    val solution = Solution189()
    solution.rotate(nums, 3)
    nums.forEach { println(it) }
}