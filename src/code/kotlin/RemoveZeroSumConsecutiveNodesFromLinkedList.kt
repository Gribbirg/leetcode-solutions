package code.kotlin

import code.kotlin.structures.ListNode

class RemoveZeroSumConsecutiveNodesFromLinkedList {
    fun removeZeroSumSublists(head: ListNode?): ListNode? {
        var prefixSum = 0
        val map = HashMap<Int, ListNode>()
        val beforeHead = ListNode(0).apply { next = head }
        map[0] = beforeHead

        var current = head
        while (current != null) {
            prefixSum += current.`val`
            if (map.containsKey(prefixSum)) {
                val start = map[prefixSum]
                var temp = start
                var pSum = prefixSum
                if (temp != current) {
                    temp = temp!!.next
                    pSum += temp!!.`val`
                }
                while (temp != current) {
                    map.remove(pSum)
                    temp = temp!!.next
                    pSum += temp!!.`val`
                }
                start!!.next = current.next
            } else {
                map[prefixSum] = current
            }
            current = current.next
        }

        return beforeHead.next
    }
}

fun main() {
    val sol = RemoveZeroSumConsecutiveNodesFromLinkedList()
    println(sol.removeZeroSumSublists(ListNode(listOf(1, 2, -3, 3, 1))))
    println(sol.removeZeroSumSublists(ListNode(listOf(1, 2, 3, -3, 4))))
    println(sol.removeZeroSumSublists(ListNode(listOf(1, 2, 3, -3, -2))))
}