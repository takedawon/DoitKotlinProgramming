package five

class Bird4(var name:String="daram", var wing:Int, var beak:String, var color:String) {

    init {
        println("---------초기화 블록 시작-----------")
        println("이름은 $name, 부리는 $beak")
        this.sing(3)
        println("---------초기화 블록 끝-------------")
        this.wing = 4
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco=Bird4("mybird",2,"short","blue")
    val coco2=Bird4(wing = 2,beak = "short",color = "blue")
    coco2.color = "yellow"
    println("coco.color : ${coco2.color}")
    coco2.fly()
}