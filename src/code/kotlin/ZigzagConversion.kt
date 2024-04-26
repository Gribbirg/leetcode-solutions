package code.kotlin

class ZigzagConversion {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1 || numRows >= s.length) {
            return s
        }

        val rows = List(numRows) { mutableListOf<Char>() }
        var rowIndex = 0
        var direction = 1

        s.forEach { char ->
            rows[rowIndex].add(char)
            if (rowIndex == 0) {
                direction = 1
            } else if (rowIndex == rows.lastIndex) {
                direction = -1
            }
            rowIndex += direction
        }

        return rows.joinToString("") { it.joinToString("") }
    }
}

fun main() {
    val sol = ZigzagConversion()
    println(sol.convert("PAHNAPLSIIGYIR", 3))
    println(sol.convert("PAHNAPLSIIGYIR", 4))
    println(sol.convert("A", 1))
}