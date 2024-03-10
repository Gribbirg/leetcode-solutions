package code.kotlin

class IntersectionOfTwoArrays {
    fun intersection(nums1: IntArray, nums2: IntArray): IntArray =
        HashSet<Int>().apply { nums1.forEach { num1 -> if (nums2.contains(num1)) add(num1) } }.toIntArray()
}

fun main() {
    val sol = IntersectionOfTwoArrays()
    println(sol.intersection(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2)).asList())
    println(sol.intersection(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4)).asList())
}