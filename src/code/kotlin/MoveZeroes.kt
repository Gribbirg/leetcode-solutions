package code.kotlin

class MoveZeroes {
    fun moveZeroes(nums: IntArray): Unit {
        var current = 0

        for (i in nums.indices) {
            if (nums[i] != 0) {
                nums[current++] = nums[i]
            }
        }

        for (i in current..nums.lastIndex) {
            nums[i] = 0
        }
    }
}

fun test(sol: (IntArray) -> Unit, nums: IntArray) {
    sol(nums)
    println(nums.contentToString())
}

fun main() {
    val sol = MoveZeroes()::moveZeroes
    test(sol, intArrayOf(0, 1, 0, 3, 12))
    test(sol, intArrayOf(0))
}