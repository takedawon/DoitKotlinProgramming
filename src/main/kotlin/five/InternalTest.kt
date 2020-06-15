package five

internal class InternalClass {
    internal val i = 1
    internal fun icFunc() = i + 1
    fun access() = icFunc()
}

class Other {
    internal val ic = InternalClass()
    fun test() {
        ic.i
        ic.icFunc()
    }
}

fun main() {
    val mic = InternalClass()
    mic.i
    mic.icFunc()
}