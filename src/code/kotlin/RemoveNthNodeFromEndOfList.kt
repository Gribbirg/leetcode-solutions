package code.kotlin

import code.kotlin.structures.ListNode

class RemoveNthNodeFromEndOfList {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {

        if (head == null) return null

        val preHead = ListNode(0)
        preHead.next = head

        var current = head
        var prev: ListNode? = preHead

        repeat(n) {
            current = current?.next
        }

        while (current != null) {
            prev = prev!!.next
            current = current!!.next
        }

        prev!!.next = prev.next?.next
        return preHead.next
    }
}

fun main() {
    val sol = RemoveNthNodeFromEndOfList()
    println(sol.removeNthFromEnd(ListNode(listOf(1, 2, 3, 4, 5)), 2))
    println(sol.removeNthFromEnd(ListNode(listOf(1)), 1))
    println(sol.removeNthFromEnd(ListNode(listOf(1, 2)), 1))
    println(sol.removeNthFromEnd(ListNode(listOf(1, 2)), 2))
}