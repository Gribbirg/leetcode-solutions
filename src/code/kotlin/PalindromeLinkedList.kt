package code.kotlin

import code.kotlin.structures.ListNode

class PalindromeLinkedList {
    fun isPalindrome(head: ListNode?): Boolean {
        if (head?.next == null)
            return true

        var slow: ListNode? = head
        var fast: ListNode? = head
        var prev: ListNode? = null

        while (fast?.next != null) {
            fast = fast.next!!.next
            slow!!.next = prev.also {
                prev = slow
                slow = slow!!.next
            }
        }

        if (fast != null)
            slow = slow!!.next

        while (prev != null && slow != null) {
            if (prev!!.`val` != slow!!.`val`)
                return false

            prev = prev!!.next
            slow = slow!!.next
        }

        return true
    }
}

fun main() {
    val sol = PalindromeLinkedList()
    println(sol.isPalindrome(ListNode(listOf(1, 2, 2, 1))))
    println(sol.isPalindrome(ListNode(listOf(1, 2))))
}