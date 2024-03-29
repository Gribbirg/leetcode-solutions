package code.kotlin

class SetMatrixZeroes {
    fun setZeroes(matrix: Array<IntArray>): Unit {
        val zerosRows = HashSet<Int>()
        val zerosColumns = HashSet<Int>()

        matrix.forEachIndexed { i, row ->
            row.forEachIndexed { j, element ->
                if (element == 0) {
                    zerosRows.add(i)
                    zerosColumns.add(j)
                }
            }
        }

        zerosRows.forEach { i ->
            matrix[i].indices.forEach { j ->
                matrix[i][j] = 0
            }
        }
        zerosColumns.forEach { i ->
            matrix.indices.forEach { j ->
                matrix[j][i] = 0
            }
        }
    }
}

fun main() {
    val sol = SetMatrixZeroes()::setZeroes

    var matrix = arrayOf(intArrayOf(1, 1, 1), intArrayOf(1, 0, 1), intArrayOf(1, 1, 1))
    sol(matrix)
    println(matrix.map { it.toList() }.toList())

    matrix = arrayOf(intArrayOf(0, 1, 2, 0), intArrayOf(3, 4, 5, 2), intArrayOf(1, 3, 1, 5))
    sol(matrix)
    println(matrix.map { it.toList() }.toList())
}