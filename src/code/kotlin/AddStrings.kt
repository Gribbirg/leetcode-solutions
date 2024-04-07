package code.kotlin

class AddStrings {
    fun addStrings(num1: String, num2: String): String {
        val res = StringBuilder()
        var add = 0

        for (i in 0..maxOf(num1.lastIndex, num2.lastIndex)) {
            val value = num1.getOrElse(num1.lastIndex - i) { '0' }.code - '0'.code +
                    num2.getOrElse(num2.lastIndex - i) { '0' }.code - '0'.code +
                    add
            add = value / 10
            res.append(value % 10)
        }
        if (add != 0) res.append(add)

        return res.reverse().toString()
    }
}

fun main() {
    val sol = AddStrings()
    println(sol.addStrings("11", "123"))
    println(sol.addStrings("456", "77"))
    println(sol.addStrings("0", "0"))
}