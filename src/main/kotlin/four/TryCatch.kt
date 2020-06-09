package four

import java.lang.ArithmeticException
import java.lang.Exception

fun main() {
    val a = 6
    val b = 0
    val c : Int

    try {
        c = a/b
    } catch (e: ArithmeticException) {
        println("ArithmeticException is handled.")
        println("${e.message}")
        println(e.printStackTrace())
    } finally {
        println("finally는 항상 실행됨")
    }
}