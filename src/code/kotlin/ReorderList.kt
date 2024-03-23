package code.kotlin

import code.kotlin.structures.ListNode

class ReorderList {
    fun reorderList(head: ListNode?) {
        if (head?.next?.next == null) return

        var slow: ListNode? = head
        var fast: ListNode? = head

        while (fast?.next?.next != null) {
            fast = fast.next!!.next
            slow = slow!!.next
        }

        var node = slow!!.next
        var prev: ListNode? = null

        while (node != null) {
            val next = node.next
            node.next = prev

            prev = node
            node = next
        }
        slow.next = null

        var node1 = head
        var node2 = prev

        while (node1 != null && node2 != null) {
            val node1Next = node1.next
            val node2Next = node2.next

            node1.next = node2
            node2.next = node1Next

            node1 = node1Next
            node2 = node2Next
        }
    }
}

fun main() {
    val sol = ReorderList()
    println(ListNode(listOf(1, 2, 3, 4)).also { sol.reorderList(it) })
    println(ListNode(listOf(1, 2, 3, 4, 5)).also { sol.reorderList(it) })
}