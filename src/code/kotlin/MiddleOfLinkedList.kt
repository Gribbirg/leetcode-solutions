package code.kotlin

import code.kotlin.structures.ListNode

class MiddleOfLinkedList {
    fun middleNode(head: ListNode?): ListNode? {
        var last = head!!.next
        var middle = head

        while (last != null) {
            last = last.next?.next
            middle = middle!!.next
        }

        return middle
    }
}

fun main() {
    val sol = MiddleOfLinkedList()
    println(sol.middleNode(ListNode(listOf(1, 2, 3, 4, 5))))
    println(sol.middleNode(ListNode(listOf(1, 2, 3, 4, 5, 6))))
    println(sol.middleNode(ListNode(listOf(1, 2))))
}