package code.kotlin

private val OFFSETS = listOf(
    listOf(1, 0),
    listOf(-1, 0),
    listOf(0, 1),
    listOf(0, -1)
)

class WordSearch {

    fun exist(board: Array<CharArray>, word: String): Boolean {

        fun findChar(i: Int, j: Int, wordCharIndex: Int = 0): Boolean {

            if (
                !(i >= 0 && i <= board.lastIndex) ||
                !(j >= 0 && j <= board[i].lastIndex) ||
                word[wordCharIndex] != board[i][j]
            )
                return false

            if (wordCharIndex == word.lastIndex)
                return true

            val char = board[i][j]
            board[i][j] = ' '

            val res = OFFSETS
                .map { listOf(i + it[0], j + it[1]) }
                .any { findChar(it[0], it[1], wordCharIndex + 1) }

            board[i][j] = char

            return res
        }


        board.indices.forEach { i ->
            board[i].indices.forEach { j ->
                if (findChar(i, j))
                    return true
            }
        }

        return false
    }
}

fun main() {
    val sol = WordSearch()::exist
    println(
        sol(
            arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E')
            ), "ABCCED"
        )
    )
    println(
        sol(
            arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E')
            ), "SEE"
        )
    )
    println(
        sol(
            arrayOf(
                charArrayOf('A', 'B', 'C', 'E'),
                charArrayOf('S', 'F', 'C', 'S'),
                charArrayOf('A', 'D', 'E', 'E')
            ), "ABCB"
        )
    )
}