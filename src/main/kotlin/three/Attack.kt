package three

@FunctionalInterface
interface Attack {
    fun onSuccess(result: Boolean)
}