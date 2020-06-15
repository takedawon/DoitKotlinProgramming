package test

import java.lang.ArithmeticException
import java.lang.NullPointerException

class TestException {
    constructor(e:Exception) {
        if(e is ArithmeticException) {
            println("0으로 못나눠잇!")
        } else if(e is NullPointerException) {
            println("널이야!")
        }
    }
}

fun main() {
    var a =10
    var b = 0
    val nul : String? = null
    try {
        //val test = a / b
        nul!!.length
    } catch (e:Exception) {
        TestException(e)
    }

}