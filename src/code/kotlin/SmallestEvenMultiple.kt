package code.kotlin

class SmallestEvenMultiple {
    fun smallestEvenMultiple(n: Int): Int = n * (n % 2 + 1)
}

fun main() {
    val sol = SmallestEvenMultiple()
    println(sol.smallestEvenMultiple(5))
    println(sol.smallestEvenMultiple(6))
}