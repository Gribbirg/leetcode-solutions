package code.kotlin

class FirstMissingPositive {
    fun firstMissingPositive(nums: IntArray): Int {
        val size = nums.size
        val numsList = nums.toMutableList().also { it.add(0) }

        nums.indices.forEach { i ->
            while (numsList[i] in 1..size && numsList[i] != numsList[numsList[i]])
                numsList[i] = numsList[numsList[i]].also { numsList[numsList[i]] = numsList[i] }
        }
        println(numsList)
        (1..size).forEach { i ->
            if (numsList[i] != i)
                return i
        }

        return size + 1
    }
}

fun main() {
    val sol = FirstMissingPositive()::firstMissingPositive
    println(sol(intArrayOf(1, 2, 0)))
    println(sol(intArrayOf(3, 4, -1, 1)))
    println(sol(intArrayOf(7, 8, 9, 11, 12)))
}