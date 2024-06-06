package code.kotlin

class HandOfStraights {
    fun isNStraightHand(hand: IntArray, groupSize: Int): Boolean {
        if (hand.size % groupSize != 0) return false

        val counter = HashMap<Int, Int>()
        hand.forEach { counter[it] = (counter[it] ?: 0) + 1 }

        counter.keys.sorted().forEach { card ->
            if (counter[card]!! > 0) {
                val count = counter[card]!!
                for (i in card..<(card + groupSize)) {
                    if ((counter[i] ?: 0) < count) return false
                    counter[i] = counter[i]!! - count
                }
            }
        }

        return true
    }
}

fun main() {
    val sol = HandOfStraights()
    println(sol.isNStraightHand(intArrayOf(1, 2, 3, 6, 2, 3, 4, 7, 8), 3))
    println(sol.isNStraightHand(intArrayOf(1, 2, 3, 4, 5), 4))
}