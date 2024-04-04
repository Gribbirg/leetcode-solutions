package code.kotlin

import kotlin.math.max

class MaximumNestingDepthOfParentheses {
    fun maxDepth(s: String): Int {
        var depth = 0
        var maxDepth = 0

        s.forEach { char ->
            if (char == '(') {
                maxDepth = max(maxDepth, ++depth)
            } else if (char == ')') {
                depth--
            }
        }

        return maxDepth
    }
}

fun main() {
    val sol = MaximumNestingDepthOfParentheses()::maxDepth
    println(sol("(1+(2*3)+((8)/4))+1"))
    println(sol("(1)+((2))+(((3)))"))
}