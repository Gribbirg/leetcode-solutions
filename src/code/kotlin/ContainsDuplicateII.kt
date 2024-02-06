package code.kotlin

class ContainsDuplicateII {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        if (nums.isEmpty() || k == 0) return false

        val set = HashSet<Int>()

        for (i in nums.indices) {
            if (!set.add(nums[i])) return true
            if (i >= k) set.remove(nums[i - k])
        }

        return false
    }
}

fun main() {
    println(ContainsDuplicateII().containsNearbyDuplicate(intArrayOf(1, 2, 3, 1), 3))
    println(ContainsDuplicateII().containsNearbyDuplicate(intArrayOf(1, 0, 1, 1), 1))
    println(ContainsDuplicateII().containsNearbyDuplicate(intArrayOf(1, 2, 3, 1, 2, 3), 2))
    println(ContainsDuplicateII().containsNearbyDuplicate(intArrayOf(1, 6, 3, 5, 2, 3), 10))
    println(ContainsDuplicateII().containsNearbyDuplicate(intArrayOf(-1, -1), 1))
}