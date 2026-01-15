package ENUM

//6.ENUM.CourseListStatus -> Trạng thái danh sách khóa học
enum class CourseListStatus (val message: String) {
    COURSE_LIST_EMPTY("DANH SÁCH KHÓA HỌC CHÍNH"),
    COURSE_LIST_SUCCESS("DANH SÁCH KHÓA HỌC THÀNH CÔNG")
}