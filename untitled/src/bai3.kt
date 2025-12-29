fun main () {
    val map = mutableMapOf<String, Int>(
        "Hiếu" to 5,
        "Tài" to 9,
        "Thanh" to 2
    )
    val Diem = map.filter {
        it.value >= 5
    }
    print(Diem)
}