enum class TrangThaiDangNhap {
    chuaNhapTen,
    chuaNhapMatKhau,
    dangNhapThanhCong,
    saiTaiKhoan
}
fun checkLogin(tenDangNhap: String?, matKhau: String?): TrangThaiDangNhap {
    if (tenDangNhap.isNullOrBlank()) {
        return TrangThaiDangNhap.chuaNhapTen
    }
    if (matKhau.isNullOrBlank()) {
        return TrangThaiDangNhap.chuaNhapMatKhau
    }
    if (tenDangNhap == "admin" && matKhau == "123456") {
        return TrangThaiDangNhap.dangNhapThanhCong
    }
    return TrangThaiDangNhap.saiTaiKhoan
}
fun main() {
    val trangThai = checkLogin("admin", "123456")
    when (trangThai) {
        TrangThaiDangNhap.chuaNhapTen ->
            println("Chưa nhập tên")
        TrangThaiDangNhap.chuaNhapMatKhau ->
            println("Chưa nhập mật khẩu")
        TrangThaiDangNhap.dangNhapThanhCong ->
            println("Đăng nhập thành công")
        TrangThaiDangNhap.saiTaiKhoan ->
            println("Sai tài khoản")
    }
}
