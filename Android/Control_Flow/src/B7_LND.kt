data class User(
    val ten: String,
    val dangHoatDong: Boolean
)
fun main() {
    val danhSachNguoiDung = listOf(
        User("An", true),
        User("Bình", false),
        User("Chi", true),
        User("Dũng", false)
    )
    val nguoiDungHoatDong = danhSachNguoiDung.filter { it.dangHoatDong }
    println("Danh sách người dùng đang hoạt động:")
    nguoiDungHoatDong.forEach {
        println(it.ten)
    }
}
