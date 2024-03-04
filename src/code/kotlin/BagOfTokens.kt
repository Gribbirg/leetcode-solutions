package code.kotlin

import kotlin.math.max

class BagOfTokens {
    fun bagOfTokensScore(tokens: IntArray, power: Int): Int {
        val tokensSorted = tokens.sorted()
        var myPower = power
        var score = 0
        var maxScore = 0
        var left = 0
        var right = tokensSorted.lastIndex

        while (left <= right) {
            if (myPower >= tokensSorted[left]) {
                myPower -= tokensSorted[left]
                score++
                left++
                maxScore = max(maxScore, score)
            } else if (score > 0) {
                myPower += tokensSorted[right]
                score--
                right--
            } else {
                break
            }
        }

        return maxScore
    }
}

fun main() {
    val sol = BagOfTokens()
    println(sol.bagOfTokensScore(intArrayOf(100), 50))
    println(sol.bagOfTokensScore(intArrayOf(200, 100), 150))
    println(sol.bagOfTokensScore(intArrayOf(100, 200, 300, 400), 200))
}