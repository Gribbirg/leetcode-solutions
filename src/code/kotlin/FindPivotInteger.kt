package code.kotlin

import kotlin.math.sqrt

class FindPivotInteger {
    fun pivotInteger(n: Int): Int =
        (sqrt(n * (n + 1) / 2.0)).let { num -> if (num % 1.0 == 0.0) num.toInt() else -1 }
}

fun main() {
    val sol = FindPivotInteger()
    println(sol.pivotInteger(8))
    println(sol.pivotInteger(1))
    println(sol.pivotInteger(4))
}