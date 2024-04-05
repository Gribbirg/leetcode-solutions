package code.kotlin

import java.util.*


class ImplementQueueUsingStacks {
    class MyQueue {
        private val stack = Stack<Int>()

        fun push(x: Int) {
            val tempStack = Stack<Int>()
            while (stack.isNotEmpty()) tempStack.push(stack.pop())
            stack.push(x)
            while (tempStack.isNotEmpty()) stack.push(tempStack.pop())
        }

        fun pop(): Int = stack.pop()


        fun peek(): Int = stack.peek()

        fun empty(): Boolean = stack.isEmpty()
    }
}

fun main() {
    val myQueue = ImplementQueueUsingStacks.MyQueue()
    myQueue.push(1) // queue is: [1]
    myQueue.push(2) // queue is: [1, 2] (leftmost is front of the queue)
    println(myQueue.peek()) // return 1
    println(myQueue.pop()) // return 1, queue is [2]
    println(myQueue.empty()) // return false
}