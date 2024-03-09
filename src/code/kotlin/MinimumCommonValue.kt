package code.kotlin

class MinimumCommonValue {
    fun getCommon(nums1: IntArray, nums2: IntArray): Int {
        var i = 0
        var j = 0

        while (i < nums1.size && j < nums2.size) {

            if (nums1[i] == nums2[j])
                return nums1[i]

            if (nums1[i] > nums2[j])
                j++
            else
                i++

        }

        return -1
    }
}

fun main() {
    val sol = MinimumCommonValue()
    println(sol.getCommon(intArrayOf(1, 2, 3), intArrayOf(2, 4)))
    println(sol.getCommon(intArrayOf(1, 2, 3, 6), intArrayOf(2, 3, 4, 5)))
}