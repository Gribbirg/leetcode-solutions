package code.kotlin

class FindAllGroupsOfFarmland {
    fun findFarmland(land: Array<IntArray>): Array<IntArray> {

        fun getRightDownCorner(stI: Int, stJ: Int): IntArray {
            var i = stI
            var j = stJ

            while (i < land.size && land[i][j] == 1) {
                i++
            }
            i--

            while (j < land[i].size && land[i][j] == 1) {
                j++
            }
            j--

            return intArrayOf(stI, stJ, i, j)
        }

        val res = mutableListOf<IntArray>()

        for (i in land.indices) {
            for (j in land[i].indices) {
                if (
                    land[i][j] == 1 &&
                    (i == 0 || land[i - 1][j] == 0) &&
                    (j == 0 || land[i][j - 1] == 0)
                ) {
                    res.add(getRightDownCorner(i, j))
                }
            }
        }

        return res.toTypedArray()
    }
}

fun main() {
    val sol = FindAllGroupsOfFarmland()
    println(
        sol.findFarmland(
            arrayOf(
                intArrayOf(1, 0, 0),
                intArrayOf(0, 1, 1),
                intArrayOf(0, 1, 1),
            )
        ).map { it.toList() }
    )
    println(
        sol.findFarmland(
            arrayOf(
                intArrayOf(1, 1),
                intArrayOf(1, 1),
            )
        ).map { it.toList() }
    )
    println(
        sol.findFarmland(
            arrayOf(
                intArrayOf(0),
            )
        ).map { it.toList() }
    )
}