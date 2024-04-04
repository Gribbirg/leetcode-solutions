package code.kotlin

class StringCompression {
    fun compress(chars: CharArray): Int {
        var i = 0
        var outputIndex = 0

        while (i < chars.size) {

            val start = i
            while (i < chars.size && chars[i] == chars[start]) {
                i++
            }

            chars[outputIndex++] = chars[start]
            (i - start).let {
                if (it != 1)
                    it.toString().forEach { sym -> chars[outputIndex++] = sym }
            }

        }

        return outputIndex
    }
}

fun main() {
    val sol = StringCompression()::compress
    println(sol(charArrayOf('a', 'a', 'b', 'b', 'c', 'c', 'c')))
    println(sol(charArrayOf('a')))
    println(sol(charArrayOf('a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b')))
}