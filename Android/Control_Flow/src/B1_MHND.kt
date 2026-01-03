fun main() {
    val name: String? = "Anh Tài"
    val xinChao = if (name.isNullOrBlank()) {
        "Xin chào khách"
    } else {
        "Xin chào $name"
    }
    println(xinChao)
}
