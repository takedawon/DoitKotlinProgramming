package five

open class Bird5(var name: String, var wing: Int, var beak: String, var color: String) {
    fun fly() = println("Fly wing :$wing")
    fun sing(vol:Int) = println("Sing vol: $vol")
}

class Lark(name: String, wing:Int, beak: String, color: String) : Bird5(name, wing, beak, color) {
    fun singHitone() = println("Happy Song!")
}

class Parrot : Bird5 {
    var language: String
    constructor(name:String, wing: Int, beak: String, color: String, language:String) : super(name, wing, beak, color) {
        this.language = language
    }

    fun speak() = println("Speak! $language")
}

fun main() {
    val coco = Bird5("mybird",2,"short","blue")
    val lark = Lark("mylark",2,"long","brown")
    val parrot = Parrot("myparrot",2,"short","multiple","korean")

    println("coco: ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("lark: ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("parrot: ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}")

    lark.singHitone()
    parrot.speak()
    lark.fly()
}