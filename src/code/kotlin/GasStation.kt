package code.kotlin

class GasStation {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        val prefix = IntArray(gas.size) { i -> gas[i] - cost[i] }
        var resIndex = if (prefix.first() < 0) 0 else -1
        var minVal = if (prefix.first() < 0) prefix.first() else 0
        for (i in 1..prefix.lastIndex) {
            prefix[i] += prefix[i - 1]
            if (prefix[i] < minVal) {
                resIndex = i
                minVal = prefix[i]
            }
        }

        return if (prefix.last() < 0) -1 else resIndex + 1
    }
}

fun main() {
    val sol = GasStation()
    println(sol.canCompleteCircuit(gas = intArrayOf(1, 2, 3, 4, 5), cost = intArrayOf(3, 4, 5, 1, 2)))
    println(sol.canCompleteCircuit(gas = intArrayOf(2, 3, 4), cost = intArrayOf(3, 4, 3)))
}