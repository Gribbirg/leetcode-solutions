package code.kotlin

class InsertDeleteGetRandom {
    class RandomizedSet() {
        val list = mutableListOf<Int>()
        val indexMap = hashMapOf<Int, Int>()

        fun insert(`val`: Int): Boolean {
            if (indexMap.containsKey(`val`)) return false

            indexMap[`val`] = list.size
            list.add(`val`)

            return true
        }

        fun remove(`val`: Int): Boolean {
            if (!indexMap.containsKey(`val`)) return false

            list[indexMap[`val`]!!] = list.last()
            indexMap[list.last()] = indexMap[`val`]!!

            list.removeLast()
            indexMap.remove(`val`)

            return true
        }

        fun getRandom(): Int {
            return list.random()
        }
    }
}

fun main() {

}