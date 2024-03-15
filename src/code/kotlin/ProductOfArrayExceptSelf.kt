package code.kotlin

class ProductOfArrayExceptSelf {
    fun productExceptSelf(nums: IntArray): IntArray {
        val left = IntArray(nums.size) { 1 }
        val right = IntArray(nums.size) { 1 }

        for (i in 0..<nums.lastIndex)
            left[i + 1] = left[i] * nums[i]
        for (i in nums.lastIndex  downTo 1)
            right[i - 1] = right[i] * nums[i]

        return IntArray(nums.size) { i -> right[i] * left[i] }
    }
}

fun main() {
    val sol = ProductOfArrayExceptSelf()
    println(sol.productExceptSelf(intArrayOf(1, 2, 3, 4)).toList())
    println(sol.productExceptSelf(intArrayOf(-1, 1, 0, -3, 3)).toList())
}