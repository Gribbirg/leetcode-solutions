package code.kotlin

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            map[target - nums[i]]?.let {
                return intArrayOf(it, i)
            }
            map[nums[i]] = i
        }

        return intArrayOf(-1, -1)
    }
}

fun main() {
    println(TwoSum().twoSum(intArrayOf(2,7,11,15), 9).asList())
    println(TwoSum().twoSum(intArrayOf(3,2,4), 6).asList())
    println(TwoSum().twoSum(intArrayOf(3,3), 6).asList())
}