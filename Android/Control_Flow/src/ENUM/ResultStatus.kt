package ENUM

//5.ENUM.ResultStatus -> Trạng thái kết quả
enum class ResultStatus (val message: String) {
    RESULT_PASS("KẾT QUẢ ĐẬU"),
    RESULT_FAIL("KẾT QUẢ THẤT BẠI"),
    RESULT_INVALID("KẾT QUẢ KHÔNG HỢP LỆ"),
}