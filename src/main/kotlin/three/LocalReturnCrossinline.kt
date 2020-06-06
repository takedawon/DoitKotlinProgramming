package three

fun main() {
    shortFunc3(3) {
        println("First call $it")
    }
}

inline fun shortFunc3(a:Int, crossinline out:(Int)->Unit) {
    println("Before call out()")
    nestedFunc { out(a)}
    println("After calling out()")
}

fun nestedFunc(body:()->Unit) {
    body()
}