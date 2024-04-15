package code.kotlin

class PartitionLabels {
    fun partitionLabels(s: String): List<Int> {
        val lastCharsIndex = IntArray('z' - 'a' + 1)
        s.forEachIndexed { index, char ->
            lastCharsIndex[char - 'a'] = index
        }

        val res = mutableListOf<Int>()
        var start = 0
        var end = 0

        s.forEachIndexed { index, char ->
            end = maxOf(end, lastCharsIndex[char - 'a'])

            if (index == end) {
                res.add(end - start + 1)
                start = end + 1
            }
        }

        return res
    }
}

fun main() {
    val sol = PartitionLabels()
    println(sol.partitionLabels("ababcbacadefegdehijhklij"))
    println(sol.partitionLabels("eccbbbbdec"))
    println(sol.partitionLabels("qvmwtmzzse"))
}