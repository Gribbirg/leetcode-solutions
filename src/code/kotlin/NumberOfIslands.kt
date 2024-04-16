package code.kotlin

class NumberOfIslands {
    fun numIslands(grid: Array<CharArray>): Int {

        fun fillIsland(i: Int, j: Int) {
            if (i !in grid.indices || j !in grid[0].indices || grid[i][j] == '0' || grid[i][j] == 'x')
                return

            grid[i][j] = 'x'

            fillIsland(i + 1, j)
            fillIsland(i - 1, j)
            fillIsland(i, j + 1)
            fillIsland(i, j - 1)
        }

        var count = 0

        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == '1') {
                    fillIsland(i, j)
                    count++
                }
            }
        }

        return count
    }
}

fun main() {
    val sol = NumberOfIslands()
    println(
        sol.numIslands(
            arrayOf(
                charArrayOf('1', '1', '1', '1', '1', '0'),
                charArrayOf('1', '1', '1', '0', '1', '0'),
                charArrayOf('1', '1', '0', '0', '0', '0'),
                charArrayOf('0', '0', '0', '0', '0', '0'),
            )
        )
    )
    println(sol.numIslands(arrayOf(
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('0', '0', '1', '0', '0'),
        charArrayOf('0', '0', '0', '1', '1'),
    )))
}