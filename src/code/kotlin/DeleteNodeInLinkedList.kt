package code.kotlin

import code.kotlin.structures.ListNode

class DeleteNodeInLinkedList {
    fun deleteNode(node: ListNode?) {
        node!!.`val` = node.next!!.`val`
        node.next = node.next!!.next
    }
}

fun main() {
    val sol = DeleteNodeInLinkedList()
    val head = ListNode(intArrayOf(4,5,1,9))
    sol.deleteNode(head.next)
    println(head)
}