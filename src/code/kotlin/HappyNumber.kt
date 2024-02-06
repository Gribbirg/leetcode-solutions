package code.kotlin

class HappyNumber {
    fun isHappy(n: Int): Boolean {
        val valuesSet = HashSet<Int>()
        valuesSet.add(n)

        var x = n

        while (x != 1) {

            var sum = 0
            while (x > 0) {
                val num = x % 10
                sum += num * num
                x /= 10
            }
            x = sum

            if (!valuesSet.add(x))
                return false
        }

        return true
    }
}

fun main() {
    println(HappyNumber().isHappy(19))
    println(HappyNumber().isHappy(2))
}