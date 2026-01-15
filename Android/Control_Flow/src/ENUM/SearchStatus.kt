package ENUM

//8.ENUM.SearchStatus - Trạng thái tìm kiếm
enum class SearchStatus (val message: String) {
    EMPTY_KEYWORD("TỪ KHÓA TRỐNG"),
    SEARCH_SUCCESS("TÌM KIẾM THÀNH CÔNG"),
    SEARCH_NO_RESULTS("KHÔNG TÌM THẤY KẾT QUẢ NÀO")
}
