package kotlincode

class Solution36 {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        val set = HashSet<Char>()
        for (i in 0..8) {
            for (j in 0..8) {
                if (board[i][j].isDigit() && !set.add(board[i][j])) {
                    return false
                }
            }
            set.clear()
        }
        for (i in 0..8) {
            for (j in 0..8) {
                if (board[j][i].isDigit() && !set.add(board[j][i])) {
                    return false
                }
            }
            set.clear()
        }
        for (i in 0..2) {
            for (j in 0..2) {
                for (a in i * 3..i * 3 + 2) {
                    for (b in j * 3..j * 3 + 2) {
                        if (board[a][b].isDigit() && !set.add(board[a][b])) {
                            return false
                        }
                    }
                }
                set.clear()
            }
        }
        return true
    }
}

fun main() {
    val solution = Solution36()
    val board = arrayOf(
        charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
    )
    println(solution.isValidSudoku(board))
}