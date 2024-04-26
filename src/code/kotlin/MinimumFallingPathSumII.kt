package code.kotlin

class MinimumFallingPathSumII {
    fun minFallingPathSum(grid: Array<IntArray>): Int {
        val dp = List(grid.size) { IntArray(grid[it].size) { -1 } }
        for (i in dp[0].indices) {
            dp[0][i] = grid[0][i]
        }

        for (i in 1..grid.lastIndex) {
            for (j in grid[i].indices) {
                var temp = Int.MAX_VALUE

                for (k in grid[i].indices) {
                    if (j != k) {
                        temp = minOf(temp, grid[i][j] + dp[i - 1][k])
                    }
                    dp[i][j] = temp
                }
            }
        }

        return dp.last().min()
    }
}

fun main() {
    val sol = MinimumFallingPathSumII()
    println(sol.minFallingPathSum(arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))))
    println(
        sol.minFallingPathSum(
            arrayOf(
                intArrayOf(2, 2, 1, 2, 2),
                intArrayOf(2, 2, 1, 2, 2),
                intArrayOf(2, 2, 1, 2, 2),
                intArrayOf(2, 2, 1, 2, 2),
                intArrayOf(2, 2, 1, 2, 2)
            )
        )
    )
}