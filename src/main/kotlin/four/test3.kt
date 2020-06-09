package four

fun main() {
    fun great() = fun() { println("lanic")}
    great()()
}