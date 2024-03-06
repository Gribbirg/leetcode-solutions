package code.kotlin

import code.kotlin.structures.ListNode

class LinkedListCycle {
    fun hasCycle(head: ListNode?): Boolean {
        val visited = HashSet<ListNode>()
        var current = head

        while (current != null) {
            if (visited.contains(current))
                return true

            visited.add(current)
            current = current.next
        }

        return false
    }
}

fun main() {
    val sol = LinkedListCycle()

    val node = ListNode(2)
    val node2 = ListNode(0, ListNode(-4, node))
    node.next = node2
    val nodeStart = ListNode(3, node)

    println(sol.hasCycle(nodeStart))
}