package code.kotlin

import java.util.*

class RevealCardsInIncreasingOrder {
    fun deckRevealedIncreasing(deck: IntArray): IntArray {
        deck.sort()
        val queue = LinkedList<Int>()
        queue.addFirst(deck.last())
        for (i in deck.lastIndex - 1 downTo 0) {
            queue.addFirst(queue.removeLast())
            queue.addFirst(deck[i])
        }
        return IntArray(deck.size) { queue.removeFirst() }
    }
}

fun main() {
    val sol = RevealCardsInIncreasingOrder()
    println(sol.deckRevealedIncreasing(deck = intArrayOf(17, 13, 11, 2, 3, 5, 7)).toList())
    println(sol.deckRevealedIncreasing(deck = intArrayOf(1, 1000)).toList())
}