package code.kotlin

import kotlin.math.abs

class MakeTheStringGreat {
    fun makeGood(s: String): String {
        val res = StringBuilder()

        s.forEach { char ->
            if (res.isNotEmpty() && abs(char - res.last()) == 32) {
                res.deleteCharAt(res.lastIndex)
            } else {
                res.append(char)
            }
        }

        return res.toString()
    }
}

fun main() {
    val sol = MakeTheStringGreat()::makeGood
    println(sol("leEeetcode"))
    println(sol("abBAcC"))
    println(sol("s"))
}