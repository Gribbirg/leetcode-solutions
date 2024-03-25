package code.kotlin

class FindDuplicateNumber {
    fun findDuplicate(nums: IntArray): Int {
        var slow = nums.first()
        var fast = nums.first()

        do {
            slow = nums[slow]
            fast = nums[nums[fast]]
        } while (slow != fast)

        slow = nums.first()
        while (slow != fast) {
            slow = nums[slow]
            fast = nums[fast]
        }

        return slow
    }
}

fun main() {
    val sol = FindDuplicateNumber()
    println(sol.findDuplicate(intArrayOf(1, 3, 4, 2, 2)))
    println(sol.findDuplicate(intArrayOf(3, 1, 3, 4, 2)))
    println(sol.findDuplicate(intArrayOf(3, 3, 3, 3, 3)))
}