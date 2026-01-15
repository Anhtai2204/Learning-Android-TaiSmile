package REGISTER
import DATA.RegisterInput
import ENUM.RegisterStatus
fun register(input: RegisterInput, existingEmails: List<String>): RegisterStatus {
    if (input.email.isNullOrBlank() || input.password.isNullOrBlank() || input.confirmPassword.isNullOrBlank()){
        return RegisterStatus.INVALID_INPUT
    }
    if(input.password != input.confirmPassword){
        return RegisterStatus.PASSWORD_NOT_MATCH
    }
    if (existingEmails.contains(input.email)){
        return RegisterStatus.EMAIL_EXIST
    }
    return RegisterStatus.SUCCESS
}
//fun main () {
//    val existingEmails: List<String> = listOf("A@gmail.com", "B@gmail.com")
//    print("Enter Email: ")
//    val email  = readln()
//    print("Enter Password: ")
//    val password  = readln()
//    print("Enter ConfirmPassword: ")
//    val confirmPassword  = readln()
//    val result = register(RegisterInput(email, password, confirmPassword), existingEmails)
//    println(result.message)
//}