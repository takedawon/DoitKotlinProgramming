package four

fun main() {
    println("Enter : ")
    var score = readLine()!!.toDouble()
    var grade : Char = 'F'

    grade =  when {
        score >= 90.0 -> 'A'
        score in 80.0..89.9 -> 'B'
        score in 70.0..79.9 -> 'C'
        score < 70.0 -> 'F'
        else -> 'N'
    }

    print("$grade")

}