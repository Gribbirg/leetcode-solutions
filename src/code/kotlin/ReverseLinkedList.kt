package code.kotlin

import code.kotlin.structures.ListNode

class ReverseLinkedList {
    fun reverseList(head: ListNode?): ListNode? {
        if (head == null) return null

        var node = head
        var prev: ListNode? = null

        while (node != null) {
            val next = node.next
            node.next = prev

            prev = node
            node = next
        }

        return prev
    }
}

fun main() {
    val sol = ReverseLinkedList()
    println(sol.reverseList(ListNode(listOf(1,2,3,4,5))))
    println(sol.reverseList(ListNode(listOf(1,2))))
}