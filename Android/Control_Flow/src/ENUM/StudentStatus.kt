package ENUM

//3.StudentListStatus -> Trạng thái danh sách sinh viên
enum class StudentStatus (val message: String) {
    STUDENT_LIST_EMPTY("DANH SÁCH SINH VIÊN TRỐNG"),
    STUDENT_LIST_SUCCESS("DANH SÁCH SINH VIÊN THÀNH CÔNG")
}