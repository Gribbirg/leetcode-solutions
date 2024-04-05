package code.kotlin

class SubarraySumEqualsK {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val prefixCount = HashMap<Int, Int>().also { map -> map[0] = 1 }
        var sum = 0
        var res = 0

        nums.forEach { num ->
            sum += num
            res += prefixCount.getOrDefault(sum - k, 0)
            prefixCount[sum] = prefixCount.getOrDefault(sum, 0) + 1
        }

        return res
    }
}

fun main() {
    val sol = SubarraySumEqualsK()::subarraySum
    println(sol(intArrayOf(1, 1, 1), 2))
    println(sol(intArrayOf(1, 2, 3), 3))
}