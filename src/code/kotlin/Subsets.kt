package code.kotlin

class Subsets {
    fun subsets(nums: IntArray): List<List<Int>> {
        val res = mutableListOf(listOf<Int>())

        nums.forEach { num ->
            res.toMutableList().forEach { resList ->
                res.add(resList + listOf(num))
            }
        }

        return res
    }
}

fun main() {
    val sol = Subsets()
    println(sol.subsets(intArrayOf(1, 2, 3)))
    println(sol.subsets(intArrayOf(0)))
}