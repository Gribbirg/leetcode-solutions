package code.kotlin

class SubarraysWithKDifferentIntegers {
    fun subarraysWithKDistinct(nums: IntArray, k: Int): Int {
        return maxSubarrayCount(nums, k) - maxSubarrayCount(nums, k - 1)
    }

    private fun maxSubarrayCount(nums: IntArray, k: Int): Int {
        val mapOfCount = HashMap<Int, Int>()
        var left = 0
        var count = 0

        nums.forEachIndexed { right, num ->
            mapOfCount[num] = mapOfCount.getOrDefault(num, 0) + 1
            while (mapOfCount.size > k) {
                mapOfCount[nums[left]] = mapOfCount[nums[left]]!! - 1
                if (mapOfCount[nums[left]]!! == 0) mapOfCount.remove(nums[left])
                left++
            }
            count += right - left + 1
        }

        return count
    }
}

fun main() {
    val sol = SubarraysWithKDifferentIntegers()::subarraysWithKDistinct
    println(sol(intArrayOf(1, 2, 1, 2, 3), 2))
    println(sol(intArrayOf(1, 2, 1, 3, 4), 3))
}