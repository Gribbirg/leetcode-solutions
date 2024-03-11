package code.kotlin

class CustomSortString {
    fun customSortString(order: String, s: String): String {
        val power = MutableList(26) { Int.MAX_VALUE }
        order.forEachIndexed { index, char ->
            power[char.code - 'a'.code] = index
        }

        return s.toCharArray().sortedBy { char -> power[char.code - 'a'.code] }.joinToString("")
    }
}


fun main() {
    val sol = CustomSortString()
    println(sol.customSortString(order = "cba", s = "abcd"))
    println(sol.customSortString(order = "bcafg", s = "abcd"))
}