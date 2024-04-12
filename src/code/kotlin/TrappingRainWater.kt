package code.kotlin

class TrappingRainWater {
    fun trap(height: IntArray): Int {
        val prefix = IntArray(height.size)
        prefix[0] = height.first()
        for (i in 1..height.lastIndex) {
            prefix[i] = maxOf(prefix[i - 1], height[i])
        }

        val postfix = IntArray(height.size)
        postfix[prefix.lastIndex] = height.last()
        for (i in height.lastIndex - 1 downTo 0) {
            postfix[i] = maxOf(postfix[i + 1], height[i])
        }

        var sum = 0
        height.forEachIndexed { index, heightVal ->
            sum += minOf(prefix[index], postfix[index]) - heightVal
        }
        return sum
    }
}

fun main() {
    val sol = TrappingRainWater()
    println(sol.trap(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)))
    println(sol.trap(intArrayOf(4, 2, 0, 3, 2, 5)))
}