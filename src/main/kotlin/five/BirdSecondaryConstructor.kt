package five

class Bird2 {
    var name: String
    var wing: Int
    var beak: String
    var color: String


    constructor(name: String, wing: Int, beak: String, color: String) {
        this.name = name
        this.wing = wing
        this.beak = beak
        this.color = color
    }

    constructor(name: String, beak: String) {
        this.name = name
        this.wing = 2
        this.beak = beak
        this.color = "grey"
    }

    fun fly() = println("Fly wing: $wing")
    fun sing(vol: Int) = println("Sing vol: $vol")
}

fun main() {
    val coco = Bird2("mybird", 2, "short", "blue")
    val coco2 = Bird2("mybird","short")
    coco.color = "yellow"
    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(3)
}