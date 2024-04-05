package code.kotlin

class NumberOfRecentCalls {

    class RecentCounter {

        private val times = mutableListOf<Int>()

        fun ping(t: Int): Int {
            times.add(t)

            var left = 0
            var right = times.size

            while (left < right) {
                val mid = (left + right) / 2
                if (times[mid] >= t - 3000) {
                    right = mid
                } else {
                    left = mid + 1
                }
            }

            return times.size - left
        }
    }

}

fun main() {
    val counter = NumberOfRecentCalls.RecentCounter()
    println(counter.ping(1123))
    println(counter.ping(1785))
    println(counter.ping(2338))
    println(counter.ping(3576))
    println(counter.ping(5881))
}