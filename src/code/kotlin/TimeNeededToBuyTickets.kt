package code.kotlin

class TimeNeededToBuyTickets {
    fun timeRequiredToBuy(tickets: IntArray, k: Int): Int =
        tickets.mapIndexed { index, ticket -> minOf(ticket, tickets[k] + (if (index <= k) 0 else -1)) }.sum()
}

fun main() {
    val sol = TimeNeededToBuyTickets()
    println(sol.timeRequiredToBuy(intArrayOf(2, 3, 2), 2))
    println(sol.timeRequiredToBuy(intArrayOf(5, 1, 1, 1), 0))
}