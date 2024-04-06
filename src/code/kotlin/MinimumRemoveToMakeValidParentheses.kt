package code.kotlin

import kotlin.math.min

class MinimumRemoveToMakeValidParentheses {
    fun minRemoveToMakeValid(s: String): String {
        var openCount = 0
        var closeCount = 0

        s.forEach { char ->
            if (char == '(') {
                openCount++
            } else if (char == ')' && openCount > closeCount) {
                closeCount++
            }
        }

        openCount = min(openCount, closeCount)
        closeCount = openCount
        val res = StringBuilder()

        s.forEach { char ->
            when (char) {
                '(' -> {
                    if (openCount > 0) {
                        res.append('(')
                        openCount--
                    }
                }

                ')' -> {
                    if (closeCount > 0 && closeCount > openCount) {
                        res.append(')')
                        closeCount--
                    }
                }

                else -> res.append(char)
            }
        }

        return res.toString()
    }
}

fun main() {
    val sol = MinimumRemoveToMakeValidParentheses()::minRemoveToMakeValid
    println(sol("lee(t(c)o)de)"))
    println(sol("a)b(c)d"))
    println(sol("))(("))
}