package code.kotlin

import java.util.Stack

// You should not implement it, or speculate about its implementation
// This is the interface that allows for creating nested lists.
class NestedInteger {
    var num: Int? = null
    val list: MutableList<NestedInteger>

    // Constructor initializes an empty nested list.
    constructor() {
        list = mutableListOf()
    }

    // Constructor initializes a single integer.
    constructor(value: Int) {
        num = value
        list = mutableListOf()
    }

    constructor(list: List<NestedInteger>) {
        num = null
        this.list = list.toMutableList()
    }

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    fun isInteger(): Boolean =
        num != null


    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    fun getInteger(): Int? =
        num

    // Set this NestedInteger to hold a single integer.
    fun setInteger(value: Int): Unit {
        list.clear()
        num = value
    }

    // Set this NestedInteger to hold a nested list and adds a nested integer to it.
    fun add(ni: NestedInteger): Unit {
        list.add(ni)
    }

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    fun getList(): List<NestedInteger>? =
        if (list.isEmpty()) null else list
}


class NestedIterator(val nestedList: List<NestedInteger>) {
    val iterators = Stack<Iterator<NestedInteger>>()

    init {
        iterators.add(nestedList.iterator())
    }

    fun next(): Int {

    }

    fun hasNext(): Boolean =

}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * var obj = NestedIterator(nestedList)
 * var param_1 = obj.next()
 * var param_2 = obj.hasNext()
 */

fun main() {
    val obj = NestedInteger(
        listOf(
            NestedInteger(
                listOf(
                    NestedInteger(1),
                    NestedInteger(1)
                )
            ),
            NestedInteger(2),
            NestedInteger(
                listOf(
                    NestedInteger(1),
                    NestedInteger(1)
                )
            )
        )
    )
    val iter = NestedIterator(nestedList = obj.getList()!!)

    while (iter.hasNext()) {
        println(iter.next())
    }
}