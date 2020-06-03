package two.section3

fun main() {
    checkAkg("Hello")
    checkAkg(5)
}

fun checkAkg(x: Any) {
    if(x is String) {
        println("x is String: $x")
    }
    if(x is Int) {
        println("x is Int: $x")
    }
}