fun main() {
    val user = "admin"
    val password = "123456"
    var soLanSai = 0

    while (soLanSai < 3) {
        print("tài khoản: ")
        val tk = readLine() ?: ""

        print("mật khẩu: ")
        val mk = readLine() ?: ""

        if (tk == user && mk == password) {
            println("Thành công")

        } else {
            soLanSai++
            println("Si")
        }
    }
    println("Khóa tài khoản")
}
