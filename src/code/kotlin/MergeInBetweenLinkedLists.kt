package code.kotlin

import code.kotlin.structures.ListNode

class MergeInBetweenLinkedLists {
    fun mergeInBetween(list1: ListNode?, a: Int, b: Int, list2: ListNode?): ListNode? {
        var node = list1!!
        var i = 0

        while (i != a - 1) {
            node = node.next!!
            i++
        }
        val prevA = node

        while (i != b + 1) {
            node = node.next!!
            i++
        }
        val nextB = node

        node = list2!!
        while (node.next != null) {
            node = node.next!!
        }

        prevA.next = list2
        node.next = nextB

        return list1
    }
}

fun main() {
    val sol = MergeInBetweenLinkedLists()
    println(
        sol.mergeInBetween(
            ListNode(listOf(10, 1, 13, 6, 9, 5)),
            3,
            4,
            ListNode(listOf(1000000, 1000001, 1000002))
        )
    )
    println(
        sol.mergeInBetween(
            ListNode(listOf(0, 1, 2, 3, 4, 5, 6)),
            2,
            5,
            ListNode(listOf(1000000, 1000001, 1000002, 1000003, 1000004))
        )
    )
}