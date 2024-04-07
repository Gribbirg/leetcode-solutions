package code.kotlin

class ValidParenthesisString {
    fun checkValidString(s: String): Boolean {
        var openMin = 0
        var openMax = 0

        s.forEach { char ->
            when (char) {
                '(' -> {
                    openMin++
                    openMax++
                }

                ')' -> {
                    openMin--
                    openMax--
                }

                else -> {
                    openMin--
                    openMax++
                }
            }
            if (openMax < 0) return false
            openMin = maxOf(openMin, 0)
        }

        return openMin == 0
    }
}

fun main() {
    val sol = ValidParenthesisString()
    println(sol.checkValidString("()"))
    println(sol.checkValidString("(*)"))
    println(sol.checkValidString("(*))"))
}