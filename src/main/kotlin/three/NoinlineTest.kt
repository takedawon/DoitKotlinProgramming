package three

fun main() {
    shortFunc2(3) {
        println("First Call : $it")
        return
    }
}

inline fun shortFunc2(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}