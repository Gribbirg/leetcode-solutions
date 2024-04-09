package code.kotlin

class IntersectionOfTwoArraysII {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val nums1Map = mutableMapOf<Int, Int>().also { map ->
            nums1.forEach { map[it] = (map[it] ?: 0) + 1 }
        }

        val res = mutableListOf<Int>()
        nums2.forEach { num ->
            if ((nums1Map[num] ?: 0) != 0) {
                res.add(num)
                nums1Map[num] = nums1Map[num]!! - 1
            }
        }

        return res.toIntArray()
    }
}

fun main() {
    val sol = IntersectionOfTwoArraysII()
    println(sol.intersect(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)).toList())
    println(sol.intersect(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)).toList())
}