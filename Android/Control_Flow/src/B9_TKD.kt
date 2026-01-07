fun main() {
    val danhSachDiem = listOf(3, 5, 7, 4, 8, 6)
    val tong = danhSachDiem
        .filter { it >= 5 }
        .map { it * 2 }
        .sum()
    println(tong)
}
