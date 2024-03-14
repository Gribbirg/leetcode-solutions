package code.kotlin

class BinarySubarraysWithSum {
    fun numSubarraysWithSum(nums: IntArray, goal: Int): Int {
        val map = HashMap<Int, Int>()
        map[0] = 1
        var count = 0
        var sum = 0

        for (num in nums) {
            sum += num
            count += map.getOrDefault(sum - goal, 0)
            map[sum] = map.getOrDefault(sum, 0) + 1
        }

        return count
    }
}

fun main() {
    val sol = BinarySubarraysWithSum()
    println(sol.numSubarraysWithSum(intArrayOf(1, 0, 1, 0, 1), 2))
    println(sol.numSubarraysWithSum(intArrayOf(0, 0, 0, 0, 0), 0))
}