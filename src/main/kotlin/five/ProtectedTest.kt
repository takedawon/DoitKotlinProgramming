package five

open class Base2 {
    protected var i =1
    protected fun protectedFunc() {
        i += 1
    }
    fun access() {
        protectedFunc()
    }
    protected class Nested
}

class Derived : Base2() {
    fun test(base: Base2): Int {
        protectedFunc()
        return i
    }
}

fun main() {
    val base = Base2()
    //base.i 접근불가
    //base.protectedFunc() 접근불가
    base.access()


}