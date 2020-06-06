package three

class InfixFunction {
    infix fun plusFive(int: Int):Int {
        return int+5
    }
}

fun main() {
    val infixFunction = InfixFunction()
    println(3 multiply 5)

    println(infixFunction plusFive 5)
}

infix fun Int.multiply(x:Int) : Int = this * x