package four

fun main() {
    print("Enter : ")
    val n = readLine()!!.toInt()

    for(lint in 1..n) {
        for(space in 1..(n-lint)) print(" ")
        for(star in 1 until 2*lint) print("*")
        println()
    }
}