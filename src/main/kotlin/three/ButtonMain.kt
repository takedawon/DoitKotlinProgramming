package three

fun main() {
    val button = Button()
    button.setOnClickListener { result ->
        if (result) {
            println("게임 시작 버튼이 눌렸어요! $result")
        } else {
            println("게임 종료 버튼이 눌렸어요! $result")
        }
    }

    println("전원이 켜졌어요!")
    button.powerOn()
    println("게임이 진행중이에요!")
    button.powerOff()
    println("게임이 종료되었어요!")

    var test = "Daram".also { println(it) }
    var test2 = "Daram".also(::println)
}