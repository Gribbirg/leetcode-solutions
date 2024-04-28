package code.kotlin

import java.util.*

class MinStack {
    private val stack = Stack<Int>()
    private val minStack = Stack<Int>()

    fun push(`val`: Int) {
        stack.push(`val`)
        minStack.push(minOf(minStack.lastOrNull() ?: Int.MAX_VALUE, `val`))
    }

    fun pop() {
        stack.pop()
        minStack.pop()
    }

    fun top(): Int = stack.peek()

    fun getMin(): Int = minStack.peek()
}

fun main() {
    val sol = MinStack()
    sol.push(-2)
    sol.push(0)
    sol.push(-3)
    println(sol.getMin())
    sol.pop()
    println(sol.top())
    println(sol.getMin())
}