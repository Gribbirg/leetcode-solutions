package code.kotlin

class SimplifyPath {
    fun simplifyPath(path: String): String {
        val list = mutableListOf<String>()

        path.split("/").forEach { s ->
            if (s.isEmpty() || s == ".") {
                return@forEach
            }

            if (s == "..") {
                if (list.isNotEmpty())
                    list.removeLast()
                return@forEach
            }

            list.add(s)
        }

        return "/" + list.joinToString("/")
    }
}

fun main() {
    val sol = SimplifyPath()
    println(sol.simplifyPath("/home/"))
    println(sol.simplifyPath("/../"))
    println(sol.simplifyPath("/home//foo/"))
}