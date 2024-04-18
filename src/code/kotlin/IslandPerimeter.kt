package code.kotlin

class IslandPerimeter {
    private val DIRECTIONS = listOf(
        Pair(0, 1),
        Pair(0, -1),
        Pair(1, 0),
        Pair(-1, 0),
    )

    fun islandPerimeter(grid: Array<IntArray>): Int {
        var perimeter = 0

        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == 1) {
                    DIRECTIONS.forEach { (x, y) ->
                        val newI = i + x
                        val newJ = j + y

                        if (newI !in grid.indices || newJ !in grid[newI].indices || grid[newI][newJ] == 0) {
                            perimeter++
                        }
                    }
                }
            }
        }

        return perimeter
    }
}

fun main() {
    val sol = IslandPerimeter()
    println(
        sol.islandPerimeter(
            arrayOf(
                intArrayOf(0, 1, 0, 0),
                intArrayOf(1, 1, 1, 0),
                intArrayOf(0, 1, 0, 0),
                intArrayOf(1, 1, 0, 0),
            )
        )
    )
    println(
        sol.islandPerimeter(
            arrayOf(
                intArrayOf(1),
            )
        )
    )
    println(
        sol.islandPerimeter(
            arrayOf(
                intArrayOf(1, 0),
            )
        )
    )
}