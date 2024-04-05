package code.kotlin

class PermutationInString {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false
        var correctCharCount = 0

        val soughtMap = HashMap<Char, Int>().also {
            s1.forEach { c -> it[c] = it.getOrDefault(c, 0) + 1 }
        }
        val fieldMap = HashMap<Char, Int>().also {
            s1.indices.forEach { i ->
                it[s2[i]] = it.getOrDefault(s2[i], 0) + 1
            }
            it.forEach { (key, value) ->
                if (soughtMap.containsKey(key) && value == soughtMap[key]) correctCharCount++
            }
        }
        if (correctCharCount == soughtMap.size) return true


        (s1.length..s2.lastIndex).forEach { i ->
            val old = s2[i - s1.length]
            val new = s2[i]

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

            if (correctCharCount == soughtMap.size) return true
        }

        return false
    }
}

fun main() {
    val sol = PermutationInString()
    println(sol.checkInclusion(s1 = "ab", s2 = "eidbaooo"))
    println(sol.checkInclusion(s1 = "ab", s2 = "eidboaoo"))
    println(sol.checkInclusion(s1 = "abcdxabcde", s2 = "abcdeabcdx"))
}