package code.kotlin

class NthTribonacciNumber {
    fun tribonacci(n: Int): Int {
        var prevPrev = 0
        var prev = 1
        var current = 1

        if (n == 0) {
            return prevPrev
        }
        if (n == 1) {
            return prev
        }
        if (n == 2) {
            return current
        }

        repeat(n - 2) {
            current = (current + prev + prevPrev).also {
                prevPrev = prev
                prev = current
            }
        }

        return current
    }
}

fun main() {
    val sol = NthTribonacciNumber()
    println(sol.tribonacci(4))
    println(sol.tribonacci(25))
}