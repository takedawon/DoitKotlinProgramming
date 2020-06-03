package two.section3

fun main() {
    var str1:String? = "Hello Kotlin"
    str1 = null
    println("str1 : $str1")
    //println("str1 length : ${str1!!.toInt()}")
    println("str1 length : ${str1?.toInt() ?: "null이기 때문에 정상적으로 수행하지 못했습니다."}")
}