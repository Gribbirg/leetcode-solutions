package code.kotlin.structures

class ListNode(var `val`: Int) {
    var next: ListNode? = null

    constructor(list: ArrayList<Int>) : this(list[0]) {
        if (list.size > 1)
            next = ListNode(list.subList(1, list.size))
    }

    constructor(list: Collection<Int>) : this(ArrayList(list))

    constructor(array: IntArray) : this(array.toList())

    constructor(`val`: Int, next: ListNode): this(`val`) {
        this.next = next
    }

    override fun toString(): String {
        return `val`.toString() + if (next != null) ", ${next.toString()}" else ""
    }
}