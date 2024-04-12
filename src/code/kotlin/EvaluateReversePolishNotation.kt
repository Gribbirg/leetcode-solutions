package code.kotlin

import java.util.*

class EvaluateReversePolishNotation {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = Stack<Int>()

        tokens.forEach { token ->
            when (token) {
                "+" -> stack.push(stack.pop() + stack.pop())
                "-" -> stack.pop().also { stack.push(stack.pop() - it) }
                "*" -> stack.push(stack.pop() * stack.pop())
                "/" -> stack.pop().also { stack.push(stack.pop() / it) }
                else -> stack.push(token.toInt())
            }
        }

        return stack.pop()
    }
}

fun main() {
    val sol = EvaluateReversePolishNotation()
    println(sol.evalRPN(arrayOf("2", "1", "+", "3", "*")))
    println(sol.evalRPN(arrayOf("4", "13", "5", "/", "+")))
    println(sol.evalRPN(arrayOf("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")))
}