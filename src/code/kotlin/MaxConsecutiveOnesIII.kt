package code.kotlin

class MaxConsecutiveOnesIII {
    fun longestOnes(nums: IntArray, k: Int): Int {
        var res = 0
        var zerosCount = 0

        var left = 0
        var right = 0

        while (right < nums.size) {
            if (zerosCount <= k) {
                if (nums[right++] == 0)
                    zerosCount++
            } else {
                if (nums[left++] == 0)
                    zerosCount--
            }

            if (zerosCount <= k) {
                res = maxOf(res, right - left)
            }
        }

        return res
    }
}

fun main() {
    val sol = MaxConsecutiveOnesIII()
    println(sol.longestOnes(intArrayOf(1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0), 2))
    println(sol.longestOnes(intArrayOf(0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1), 3))
}