package three

class Button {
    private lateinit var callback:Callback

    fun setOnClickListener(call:(Boolean)->Unit) {
        callback=object:Callback {
            override fun onSuccess(result: Boolean) {
                call(result)
            }

        }
    }

    fun powerOn() {
        callback.onSuccess(true)
    }

    fun powerOff() {
        callback.onSuccess(false)
    }
}