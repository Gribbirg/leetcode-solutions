package code.kotlin

class ContainerWithMostWater {
    fun maxArea(height: IntArray): Int {
        var res = 0
        var left = 0
        var right = height.lastIndex

        while (left < right) {
            res = maxOf(res, minOf(height[left], height[right]) * (right - left))

            if (height[left] < height[right])
                left++
            else
                right--
        }

        return res
    }
}

fun main() {
    val sol = ContainerWithMostWater()
    println(sol.maxArea(intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)))
    println(sol.maxArea(intArrayOf(1, 1)))
}