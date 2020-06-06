package three

data class User(var name:String, val age:Int)

fun main() {
    var user = User("다람이",2)
    print("user :: $user")
    setUser(user)
    print("user :: $user")


}

fun setUser(user: User) {
    user.name = "다원이"
}