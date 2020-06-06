package three

fun main() {
    val number = 5
    println("Factorial: $number -> ${factorial2(number)}")
}

tailrec fun factorial2(n:Int,run:Int=1):Long {
    return if(n==1) run.toLong() else factorial2(n-1, run*n)
}