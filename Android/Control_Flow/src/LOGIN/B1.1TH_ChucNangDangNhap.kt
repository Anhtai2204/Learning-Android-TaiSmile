fun login(account: UserAccount_Model?, onResult: (LoginStatus) -> Unit) {
    val status = when {
        account?.email.isNullOrEmpty() || account?.password.isNullOrEmpty() -> LoginStatus.LOGIN_EMPTY
        account.email == "Admin" && account?.password == "123" -> LoginStatus.LOGIN_SUCCESS
        else ->LoginStatus.LOGIN_ERROR
    }
    onResult(status)
}
    fun main () {
        login (UserAccount_Model("Admin","123")) {
            status -> println(status.message)
        }
    }


