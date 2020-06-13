package four

import org.omg.CORBA.DynAnyPackage.Invalid
import java.lang.Exception

class InvalidNameException(message:String) : Exception(message)

fun main() {
    var name = "Kildong123"
    try {
        validateName(name)
    } catch (e:InvalidNameException) {
        println(e.printStackTrace())
    } catch (e:Exception) {
        println(e.message)
    }
}

fun validateName(name: String) {
    if(name.matches(Regex(".*\\d+.*"))) {
        throw InvalidNameException("Your name : $name : contains numerals.")
    }
}
