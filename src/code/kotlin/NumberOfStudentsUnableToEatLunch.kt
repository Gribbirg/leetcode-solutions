package code.kotlin

class NumberOfStudentsUnableToEatLunch {
    fun countStudents(students: IntArray, sandwiches: IntArray): Int {
        val studentsByWish = IntArray(2)
        students.forEach { student -> studentsByWish[student]++ }

        for (sandwiche in sandwiches) {
            if (studentsByWish[sandwiche] == 0) break
            studentsByWish[sandwiche]--
        }

        return studentsByWish.sum()
    }
}

fun main() {
    val sol = NumberOfStudentsUnableToEatLunch()
    println(sol.countStudents(intArrayOf(1, 1, 0, 0), intArrayOf(0, 1, 0, 1)))
    println(sol.countStudents(intArrayOf(1, 1, 1, 0, 0, 1), intArrayOf(1, 0, 0, 0, 1, 1)))
}