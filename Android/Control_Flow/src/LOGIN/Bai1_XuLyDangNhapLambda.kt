fun login(username: String, password: String, onResult: (String)-> Unit ) {
            val status = when {
                username.isEmpty() || password.isEmpty() ->
                    onResult("LOGIN_EMPTY")

                username == "admin" && password == "123" ->
                    onResult("LOGIN_SUCCESS")

                else ->
                    onResult("LOGIN_ERROR")
            }
        }
        fun main() {
            login("admin", "123") { status ->
//                print(status)
            }
        }





















//fun login(username: String, password: String, onResult: (String) -> Unit ) {
//    when {
//    username.isEmpty() || password.isEmpty() -> {
//        onResult("LOGIN_EMPTY")
//    }
//    username == "admin" && password == "123" -> {
//        onResult("LOGIN_SUCCESS")
//    }
//    else -> {
//        onResult("LOGIN_ERROR")
//    }
//}
//}
//    fun main() {
//    login("admin", "123") { result ->
//        println(result)
//    }
//}