package three

class AttackMain {
    private lateinit var attack: Attack

    fun setAttack(atk: (Boolean) -> Unit) {
        attack = object : Attack {
            override fun onSuccess(result: Boolean) {
                atk(result)
            }

        }
    }

    fun attack() {
        attack.onSuccess(true)
    }

    fun miss() {
        attack.onSuccess(false)
    }
}

fun main() {
    var person: AttackMain = AttackMain()

    person.setAttack {
        println("공격 성공! $it")
    }

    person.attack()


}