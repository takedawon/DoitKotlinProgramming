package three

fun main() {
    val func = FuncFunc()
    println("funcFunc : ${func.funcFunc()}")
}

class FuncFunc {
    fun sum(a: Int, b: Int) = a + b
    fun funcFunc():Int {
        return sum(2,2)
    }
}