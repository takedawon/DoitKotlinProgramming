package three


fun main() {
    noParam({ "daram" })
    noParam { "daram" }
    oneParam { a -> "hello $a" }
    oneParam { "Hello $it" }
    twoParam { x, y ->
        println(x + y)
        x + y
    }
    testParam({ x: Int, y: Int -> x + y }, 1, 2)
    moreParam { _,b -> " $b" }
    withArgs("da","ram") { a, b-> "$a$b"}
    twoLambda({a,b->"$a$b"}, {a-> a})
    twoLambda({a,b->"$a da $b ram"}) {a-> a}
}

fun noParam(out: () -> String) = println(out())
fun oneParam(out: (Any) -> Any) = println(out("Daram"))
fun twoParam(out: (x: Int, y: Int) -> Int) = println(out(5, 6))
fun testParam(a: (x: Int, y: Int) -> Int, b: Int, c: Int) = println(a(b, c))
fun moreParam(out:(String, String)->String) = println(out("OneParam","twoParam"))
fun withArgs(a:String, b:String, out:(String,String)->String) = println(out(a,b))
fun twoLambda(first: (String,String)->String, second:(String)->String) {
    println(first("dda","ram"))
    println(second("daram"))
}