package code.kotlin

import java.util.*

class MaximalRectangle {
    fun maximalRectangle(matrix: Array<CharArray>): Int {

        val heights = IntArray(matrix.first().size + 1)
        var maxArea = 0

        matrix.forEach { row ->
            row.forEachIndexed { i, value ->
                heights[i] = if (value == '1') heights[i] + 1 else 0
            }

            val stack = Stack<Int>()
            heights.forEachIndexed { i, height ->
                while (stack.isNotEmpty() && height < heights[stack.peek()]) {
                    maxArea = maxOf(
                        maxArea,
                        heights[stack.pop()] *
                                (if (stack.isEmpty()) i else i - stack.peek() - 1)
                    )
                }
                stack.push(i)
            }
        }

        return maxArea
    }
}

fun main() {
    val sol = MaximalRectangle()
    println(
        sol.maximalRectangle(
            arrayOf(
                charArrayOf('1', '0', '1', '0', '0'),
                charArrayOf('1', '0', '1', '1', '1'),
                charArrayOf('1', '1', '1', '1', '1'),
                charArrayOf('1', '0', '0', '1', '0')
            )
        )
    )
    println(
        sol.maximalRectangle(
            arrayOf(
                charArrayOf('1'),
            )
        )
    )
    println(
        sol.maximalRectangle(
            arrayOf(
                charArrayOf('0'),
            )
        )
    )
}