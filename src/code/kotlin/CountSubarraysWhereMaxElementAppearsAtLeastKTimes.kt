package code.kotlin

class CountSubarraysWhereMaxElementAppearsAtLeastKTimes {
    fun countSubarrays(nums: IntArray, k: Int): Long {
        val maxNum = nums.max()
        var res = 0L
        var l = 0
        var count = k

        nums.forEach { num ->
            count -= if (num == maxNum) 1 else 0
            while (count == 0) {
                count += if (nums[l++] == maxNum) 1 else 0
            }
            res += l
        }

        return res
    }
}

fun main() {
    val sol = CountSubarraysWhereMaxElementAppearsAtLeastKTimes()::countSubarrays
    println(sol(intArrayOf(1, 3, 2, 3, 3), 2))
    println(sol(intArrayOf(1, 4, 2, 1), 3))
}