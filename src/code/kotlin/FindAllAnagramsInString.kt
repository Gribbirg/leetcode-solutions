package code.kotlin

class FindAllAnagramsInString {
    fun findAnagrams(s: String, p: String): List<Int> {
        val res = mutableListOf<Int>()

        if (s.length < p.length) return res

        var correctCharCount = 0

        val soughtMap = HashMap<Char, Int>().also {
            p.forEach { c -> it[c] = it.getOrDefault(c, 0) + 1 }
        }
        val fieldMap = HashMap<Char, Int>().also {
            p.indices.forEach { i ->
                it[s[i]] = it.getOrDefault(s[i], 0) + 1
            }
            it.forEach { (key, value) ->
                if (soughtMap.containsKey(key) && value == soughtMap[key]) correctCharCount++
            }
        }
        if (correctCharCount == soughtMap.size) res.add(0)


        (p.length..s.lastIndex).forEach { i ->
            val old = s[i - p.length]
            val new = s[i]

            if (soughtMap.containsKey(old) && fieldMap[old]!! == soughtMap[old])
                correctCharCount--
            if (soughtMap.containsKey(new) && fieldMap.containsKey(new) && fieldMap[new]!! == soughtMap[new])
                correctCharCount--

            fieldMap[old] = fieldMap[old]!! - 1
            fieldMap[new] = fieldMap.getOrDefault(new, 0) + 1

            if (soughtMap.containsKey(old) && fieldMap[old]!! == soughtMap[old])
                correctCharCount++
            if (soughtMap.containsKey(new) && fieldMap[new]!! == soughtMap[new])
                correctCharCount++

            if (correctCharCount == soughtMap.size) res.add(i - p.length + 1)
        }

        return res
    }
}

fun main() {
    val sol = FindAllAnagramsInString()
    println(sol.findAnagrams(s = "cbaebabacd", p = "abc"))
    println(sol.findAnagrams(s = "abab", p = "ab"))
    println(sol.findAnagrams(s = "aaaaaaaaaa", p = "aaaaaaaaaaaaa"))
}