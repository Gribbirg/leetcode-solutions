package code.kotlin

class FindTheTownJudge {
    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        val trustMap = IntArray(n + 1) { 0 }
        val candidates = HashSet<Int>()
        for (i in 1..n) {
            candidates.add(i)
        }

        for (personData in trust) {
            candidates.remove(personData[0])
            trustMap[personData[1]]++
        }

        for (person in candidates) {
            if (trustMap[person] == n - 1)
                return person
        }

        return -1
    }
}

fun main() {
    val sol = FindTheTownJudge()
    println(sol.findJudge(2, arrayOf(intArrayOf(1, 2))))
    println(sol.findJudge(3, arrayOf(intArrayOf(1, 3), intArrayOf(2, 3))))
    println(sol.findJudge(3, arrayOf(intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(3, 1))))
    println(sol.findJudge(1, arrayOf()))
}