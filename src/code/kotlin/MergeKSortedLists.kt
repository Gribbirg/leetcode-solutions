package code.kotlin

import code.kotlin.structures.ListNode
import java.util.*

class MergeKSortedLists {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.isEmpty()) return null

        val queue = PriorityQueue<ListNode>(lists.size) { l1, l2 -> l1.`val` - l2.`val` }

        lists.forEach { list ->
            var node = list
            while (node != null ) {
                queue.add(node)
                node = node!!.next
            }
        }

        val preHead = ListNode(0)
        var node: ListNode? = preHead

        while (node != null) {
            node!!.next = queue.poll()
            node = node!!.next
        }

        return preHead.next
    }
}

fun main() {
    val solution = MergeKSortedLists()::mergeKLists
    println(solution(arrayOf(ListNode(listOf(1, 4, 5)), ListNode(listOf(1, 3, 4)), ListNode(listOf(2, 6)))))
    println(solution(arrayOf()))
    println(solution(arrayOf(null)))
}