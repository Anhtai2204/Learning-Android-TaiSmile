package ENUM

//1.ENUM.LoginStatus -> Trạng thái đăng nhập
enum class LoginStatus (val message: String) {
    LOGIN_EMPTY("ĐĂNG NHẬP TRỐNG"),
    LOGIN_SUCCESS("ĐĂNG NHẬP THÀNH CÔNG"),
    LOGIN_ERROR("LỖI ĐĂNG NHẬP")
}