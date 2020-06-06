package three

fun main() {
    val test = pointTest(point())
    println(test)
}

fun point(): () -> Boolean = {
    println("point call")
    true
}

fun pointTest(out: () -> Boolean): Boolean {
    println("pointTest Call")
    return out()
}
