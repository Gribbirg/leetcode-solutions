package code.kotlin

class CountElementsWithMaximumFrequency {
    fun maxFrequencyElements(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        var maxCount = 0
        var maxCountElementsCount = 0

        nums.forEach {num ->
            val count = map.getOrDefault(num, 0) + 1
            map[num] = count
            if (count > maxCount) {
                maxCount = count
                maxCountElementsCount = count
            } else if (count == maxCount) {
                maxCountElementsCount += count
            }
        }

        return maxCountElementsCount
    }
}

fun main() {
    val sol = CountElementsWithMaximumFrequency()
    println(sol.maxFrequencyElements(intArrayOf(1, 2, 2, 3, 1, 4)))
    println(sol.maxFrequencyElements(intArrayOf(1, 2, 3, 4, 5)))
}