package code.kotlin

class IntervalListIntersections {
    fun intervalIntersection(firstList: Array<IntArray>, secondList: Array<IntArray>): Array<IntArray> {
        val res = mutableListOf<IntArray>()

        var firstIndex = 0
        var secondIndex = 0

        while (firstIndex < firstList.size && secondIndex < secondList.size) {
            val first = firstList[firstIndex]
            val second = secondList[secondIndex]

            if (
                second[0] in first[0]..first[1] ||
                first[0] in second[0]..second[1]
            ) {
                res.add(intArrayOf(maxOf(first[0], second[0]), minOf(first[1], second[1])))
            }

            if (first[1] < second[1])
                firstIndex++
            else
                secondIndex++
        }

        return res.toTypedArray()
    }
}

fun main() {
    val sol = IntervalListIntersections()
    println(
        sol.intervalIntersection(
            arrayOf(
                intArrayOf(0, 2),
                intArrayOf(5, 10),
                intArrayOf(13, 23),
                intArrayOf(24, 25),
            ),
            arrayOf(
                intArrayOf(1, 5),
                intArrayOf(8, 12),
                intArrayOf(15, 24),
                intArrayOf(25, 26),
            )
        ).map { it.toList() }
    )
    println(
        sol.intervalIntersection(
            arrayOf(
                intArrayOf(1, 3),
                intArrayOf(5, 9),
            ),
            arrayOf()
        ).map { it.toList() }
    )
}