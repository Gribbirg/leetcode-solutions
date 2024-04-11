package code.kotlin

import java.util.Stack

class RemoveKDigits {
    fun removeKdigits(num: String, k: Int): String {
        val stack = Stack<Char>()
        var removeCount = k

        num.forEach { char ->
            while (stack.isNotEmpty() && removeCount > 0 && stack.peek() > char) {
                stack.pop()
                removeCount--
            }
            stack.push(char)
        }

        while (stack.isNotEmpty() && removeCount > 0) {
            stack.pop()
            removeCount--
        }

        val res = StringBuilder()
        while (stack.isNotEmpty()) {
            res.append(stack.pop())
        }

        while (res.isNotEmpty() && res.last() == '0') {
            res.deleteCharAt(res.lastIndex)
        }

        if (res.isEmpty()) {
            res.append('0')
        }

        return res.reverse().toString()
    }
}

fun main() {
    val sol = RemoveKDigits()
    println(sol.removeKdigits("1432219", 3))
    println(sol.removeKdigits("10200", 1))
    println(sol.removeKdigits("10", 2))
}