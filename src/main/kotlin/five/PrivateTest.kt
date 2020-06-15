package five

import four.isDouble

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1
    }
    fun access() {
        privateFunc()
    }
}

class OtherClass {
    private val opc = PrivateClass()
    fun test() {
        val pc = PrivateClass()
    }
}

fun main() {
    val pc = PrivateClass()
    //pc.i 접근불가
    //pc.privateFunc() 전근불가
}

fun topFunction() {
    val tpc = PrivateClass() // 객체생성가능
}