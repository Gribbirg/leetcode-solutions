package code.kotlin

class GenerateParentheses {
    fun generateParenthesis(n: Int): List<String> {
        val res = mutableListOf<String>()

        fun add(str: String, leftCount: Int, rightCount: Int) {
            if (str.length == 2 * n) {
                res.add(str)
                return
            }
            if (leftCount < n) add("$str(", leftCount + 1, rightCount)
            if (rightCount < leftCount) add("$str)", leftCount, rightCount + 1)
        }

        add("", 0, 0)
        return res
    }
}

fun main() {
    val sol = GenerateParentheses()::generateParenthesis
    println(sol(3))
    println(sol(1))
}