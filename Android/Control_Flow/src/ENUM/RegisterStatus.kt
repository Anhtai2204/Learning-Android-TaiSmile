package ENUM

//2.ENUM.RegisterStatus ->Trạng thái đăng ký
enum class RegisterStatus (val message: String) {
    INVALID_INPUT("DỮ LIỆU NHẬP KHÔNG HỢP LỆ"),
    PASSWORD_NOT_MATCH("MẬT KHẨU KHÔNG KHỚP"),
    EMAIL_EXIST("EMAIL ĐÃ TỒN TẠI"),
    SUCCESS("THÀNH CÔNG")
}