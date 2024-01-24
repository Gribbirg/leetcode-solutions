package code.kotlin

class Solution167 {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var left = 0
        var right = numbers.size - 1
        var sum = numbers[left] + numbers[right]

        while (sum != target) {
            if (sum > target)
                right--
            else
                left++
            sum = numbers[left] + numbers[right]
        }
        return intArrayOf(left + 1, right + 1)
    }
}