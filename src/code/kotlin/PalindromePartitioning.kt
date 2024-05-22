package code.kotlin

class PalindromePartitioning {
    fun partition(s: String): List<List<String>> {
        val res = mutableListOf<List<String>>()
        val curr = mutableListOf<String>()

        fun explore(index: Int) {
            if (index >= s.length) {
                res.add(curr.toList())
                return
            }

            for (i in index..s.lastIndex) {
                val sub = s.substring(index, i + 1)
                if (isPalindrome(sub)) {
                    curr.add(sub)
                    explore(i + 1)
                    curr.removeAt(curr.lastIndex)
                }
            }
        }

        explore(0)
        return res
    }

    private fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.lastIndex
        while (left < right) {
            if (s[left] != s[right]) return false
            left++
            right--
        }
        return true
    }
}

fun main() {
    val sol = PalindromePartitioning()
    println(sol.partition("aab"))
    println(sol.partition("a"))
}