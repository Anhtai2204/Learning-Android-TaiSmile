enum class RegisterScreen(val message: String) {
    INVALID_INPUT("Invalid input"),
    EMAIL_EXIST("Email exist"),
    SUCCESS("Register success")
}
fun validateRegister(email: String?, password: String?, confirmPassword: String?): RegisterScreen {
    val emailDaTonTai = listOf("A@gmail.com", "B@gmail.com")
    if (email.isNullOrBlank() || password.isNullOrBlank() || confirmPassword.isNullOrBlank()) {
        return RegisterScreen.INVALID_INPUT
    }
    if (email in emailDaTonTai) {
        return RegisterScreen.EMAIL_EXIST
    }
    if (password != confirmPassword) {
        return RegisterScreen.INVALID_INPUT
    }
    return RegisterScreen.SUCCESS
}

fun main() {
    val result = validateRegister("A@gmail.com", "123456", "123456")
    when (result) {
        RegisterScreen.SUCCESS -> println("register_success")
        RegisterScreen.INVALID_INPUT,
        RegisterScreen.EMAIL_EXIST -> println("register_error")
    }
}
