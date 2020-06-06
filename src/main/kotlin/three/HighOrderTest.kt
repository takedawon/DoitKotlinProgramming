package three

fun main() {
    val result: Int
    val multi: (Int, Int) -> Int = { x, y -> x * y }

    result = multi(10, 20)
    println(result)
}