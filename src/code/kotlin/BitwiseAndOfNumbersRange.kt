package code.kotlin

import kotlin.math.pow

class BitwiseAndOfNumbersRange {

    fun rangeBitwiseAnd(left: Int, right: Int): Int {
        var leftCopy = left
        var rightCopy = right

        var i = 0
        while (leftCopy != rightCopy) {
            leftCopy = leftCopy shr 1
            rightCopy = rightCopy shr 1
            i++
        }

        return leftCopy shl i
    }

    fun myRangeBitwiseAnd(left: Int, right: Int): Int {
        val bitLeft = Integer.toBinaryString(left)
        val bitRight = Integer.toBinaryString(right)
        if (bitLeft.length != bitRight.length) return 0

        var res = 0
        for (i in bitLeft.indices) {
            if (bitLeft[i] != bitRight[i])
                break
            if (bitLeft[i] == '1')
                res += 2.0.pow(bitLeft.length - i - 1).toInt()
        }
        return res
    }
}

fun main() {
    val sol = BitwiseAndOfNumbersRange()
    println(sol.rangeBitwiseAnd(5, 7))
    println(sol.rangeBitwiseAnd(0, 0))
    println(sol.rangeBitwiseAnd(1, 2147483647))
    println(sol.rangeBitwiseAnd(1, 2147483647))
    println(sol.rangeBitwiseAnd(100, 111))
    println(sol.rangeBitwiseAnd(109, 111))
    println(sol.rangeBitwiseAnd(111, 111))
}