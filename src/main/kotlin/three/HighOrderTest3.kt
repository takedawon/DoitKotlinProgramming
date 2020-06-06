package three


fun main() {
    val out = {println("Hello World!")}
    out()
    val new = out
    new()
}