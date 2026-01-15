fun loginTraditional(account: UserAccount_Model?): LoginStatus {
    val username = "admin"
    val password = "123"
    if (account != null) {
        if (account?.email.isNullOrBlank() || account?.password.isNullOrBlank()) {
            return LoginStatus.LOGIN_EMPTY
        }
        if (account.email == username && account?.password == password) {
            return LoginStatus.LOGIN_SUCCESS
        }
        return LoginStatus.LOGIN_ERROR
    }
    return LoginStatus.LOGIN_EMPTY
}
fun main () {
    val account = UserAccount_Model("admin", "123")
    val login = loginTraditional(account)
    when (login) {
        LoginStatus.LOGIN_EMPTY -> println(LoginStatus.LOGIN_EMPTY.message)
        LoginStatus.LOGIN_SUCCESS -> println(LoginStatus.LOGIN_SUCCESS.message)
        LoginStatus.LOGIN_ERROR -> println(LoginStatus.LOGIN_ERROR.message)
    }
 }