package http

import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class HttpUrlConnectionTest {
    fun connect(url:URL) {
        val con = url.openConnection() as HttpURLConnection
        val br = BufferedReader(InputStreamReader(con.inputStream))
        var str:String?
        var rank = 0

        while (true) {
            str = br.readLine() ?:break
            if(str.contains("class=\"ah_k\"") && rank < 20) {
                println("${++rank}위:" + str.split(">")[1].split("<")[0])
            }
        }
        con.disconnect()
        br.close()
    }
}

fun main() {
    val https = HttpUrlConnectionTest()

    https.connect(URL("https://www.naver.com/"))
}