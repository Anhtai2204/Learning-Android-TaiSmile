enum class LoginScreen (val message: String) {
    chuaNhapThongTin("Chưa Nhập USER hoặc PASS"),
    dangDangNhap("Đang đăng nhập"),
    dangNhapThatBai("Đăng nhập thành công"),
    dangNhapThanhCong("Đăng nhập thất bại")
}
fun validateLogin (user: String?, pass: String?): LoginScreen {
    val username = "Admin"
    val password = "123"

    if (user.isNullOrBlank() || pass.isNullOrBlank()) {
        return LoginScreen.chuaNhapThongTin
    }
    if (username != user || password != pass) {
        return LoginScreen.dangNhapThatBai
    }
    return LoginScreen.dangNhapThanhCong
}
fun main () {
    val name = validateLogin("admin", "123")

    when(name) {
        LoginScreen.chuaNhapThongTin ->println(LoginScreen.chuaNhapThongTin.message)
        LoginScreen.dangDangNhap -> println(LoginScreen.dangDangNhap.message)
        LoginScreen.dangNhapThatBai -> println(LoginScreen.dangNhapThatBai.message)
        LoginScreen.dangNhapThanhCong -> println(LoginScreen.dangNhapThanhCong.message)
    }
}

//Cách In Khác
//fun main () {
//    val name = validateLogin("admin", "123")
//
//    val Mess = when(name) {
//        LoginScreen.chuaNhapThongTin ->LoginScreen.chuaNhapThongTin.message
//        LoginScreen.dangDangNhap -> LoginScreen.dangDangNhap.message
//        LoginScreen.dangNhapThatBai -> LoginScreen.dangNhapThatBai.message
//        LoginScreen.dangNhapThanhCong -> LoginScreen.dangNhapThanhCong.message
//    }
//    println(Mess)
//}