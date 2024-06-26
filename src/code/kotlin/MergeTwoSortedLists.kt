package code.kotlin

import code.kotlin.structures.ListNode

class MergeTwoSortedLists {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if (list1 == null) return list2
        if (list2 == null) return list1

        if (list1.`val` < list2.`val`) {
            list1.next = mergeTwoLists(list1.next, list2)
            return list1
        } else {
            list2.next = mergeTwoLists(list1, list2.next)
            return list2
        }
    }
}

fun main() {
    val sol = MergeTwoSortedLists()::mergeTwoLists
    println(sol(ListNode(listOf(1, 2, 4)), ListNode(listOf(1, 3, 4))))
    println(sol(null, null))
}