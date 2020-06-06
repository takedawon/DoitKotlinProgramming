package three

fun main() {
    var result = {x:Int,y:Int->x+y}
    println(highOrder(result,10,20))
}

fun highOrder(sum:(Int,Int)->Int, a:Int,b:Int):Int {
    return sum(a,b)
}

class HighOrderTest2 {

}