fun main() {
    print("Nhập điểm: ")
    val diem = readLine()?.toDoubleOrNull()
    val xepLoai = when {
        diem == null -> "Điểm không hợp lệ"
        diem >= 8.0 -> "Giỏi"
        diem >= 6.5 -> "Khá"
        diem >= 5.0 -> "Trung bình"
        else -> "Yếu"
    }
    println("Xếp loại: $xepLoai")
}
