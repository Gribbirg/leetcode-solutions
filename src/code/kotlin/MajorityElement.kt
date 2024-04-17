package code.kotlin

class MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        var count = 0
        var candidate = 0

        nums.forEach { num ->
            if (count == 0)
                candidate = num

            if (num == candidate)
                count++
            else
                count--
        }

        return candidate
    }
}

fun main() {
    val sol = MajorityElement()
    println(sol.majorityElement(intArrayOf(3, 2, 3)))
    println(sol.majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2)))
}