package ENUM

//7.ENUM.DownloadStatus -> Trạng thái tải xuống
enum class DownloadStatus (val message: String) {
    DOWNLOAD_SUCCESS("TẢI XUỐNG THÀNH CÔNG"),
    DOWNLOAD_TIMEOUT("THỜI GIAN TẢI XUỐNG ĐÃ HẾT"),
    DOWNLOAD_ERROR("LỖI TẢI XUỐNG"),
    NETWORK_ERROR("LỖI MẠNG")
}