package four

fun Any.isDouble() : Boolean {
    return this.isDouble()
}

fun main() {

    var grade: Char = 'F'

    print("Enter the score:")
    var score:Double = readLine()?.toDouble() ?: 0.0


    when(score) {
        in 90.0..100.0 -> grade = 'A'
        in 80.0..90.0 -> grade = 'B'
        in 70.0..80.0 -> grade = 'C'
        !in 70.0..100.0 -> grade = 'F'
    }

    println("grade: $grade")
}
