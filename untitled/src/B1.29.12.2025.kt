fun main() {
    val name: String? = "Anh Tai"
    val Xinchao: String
    if (name != null && name.isNotBlank()) {
        Xinchao = "$name"
    } else {
        Xinchao = "Xin chào khách"
    }
    println(Xinchao)
}

//name.isNotBlank() trả về khi true khi chuỗi có 1 ký tự
//name.isNotBlank() và trả về false khi chuỗi toàn khoảng trắng