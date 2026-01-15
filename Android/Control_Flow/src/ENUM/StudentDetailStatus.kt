package ENUM

//4.ENUM.StudentDetailStatus -> Trạng thái chi tiết sinh viên
enum class StudentDetailStatus (val message: String) {
    DETAIL_FOUND("CHI TIẾT ĐÃ TÌM THẤY"),
    DETAIL_NOT_FOUND("CHI TIẾT KHÔNG TÌM THẤY")
}