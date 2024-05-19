package code.kotlin

class FindTheMaximumSumOfNodeValues {
    fun maximumValueSum(nums: IntArray, k: Int, edges: Array<IntArray>): Long {
        var sum = 0L
        var count = 0
        var posMin = Int.MAX_VALUE
        var negMax = Int.MIN_VALUE

        nums.forEach { node ->
            sum += node
            val after = node xor k
            val change = after - node

            if (change > 0) {
                posMin = minOf(posMin, change)
                sum += change
                count += 1
            } else {
                negMax = maxOf(negMax, change)
            }
        }

        return if (count % 2 == 0) sum else maxOf(sum - posMin, sum + negMax)
    }
}

fun main() {
    val sol = FindTheMaximumSumOfNodeValues()
    println(sol.maximumValueSum(nums = intArrayOf(1, 2, 1), k = 3, edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2))))
    println(sol.maximumValueSum(nums = intArrayOf(2, 3), k = 7, edges = arrayOf(intArrayOf(0, 1))))
    println(
        sol.maximumValueSum(
            nums = intArrayOf(7, 7, 7, 7, 7, 7),
            k = 3,
            edges = arrayOf(
                intArrayOf(0, 1),
                intArrayOf(0, 2),
                intArrayOf(0, 3),
                intArrayOf(0, 4),
                intArrayOf(0, 5)
            )
        )
    )
}