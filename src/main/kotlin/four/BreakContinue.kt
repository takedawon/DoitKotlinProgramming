package four

class BreakContinue {
}

fun main() {
    labelBreak()
}

fun labelBreak() {
    println("labelBreak")
    for(i in 1..5) {
        second@for(j in 1..5) {
            if(j == 3) continue@second
            println("i:$i, j$j")
        }
        println("after for j")
    }
}

fun labelBreak2() {
    println("labelBreak")
    for(i in 1..5) {
        second@for(j in 1..5) {
            if(j == 3) break
            println("i:$i, j$j")
        }
        println("after for j")
    }
}