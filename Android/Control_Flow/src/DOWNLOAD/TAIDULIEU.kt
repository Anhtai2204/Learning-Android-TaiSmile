package DOWNLOAD

import ENUM.DownloadStatus

object DOWNLOAD {
    fun downloadStatus(statusCode: Int?): DownloadStatus {
        return when (statusCode) {
            200 -> DownloadStatus.DOWNLOAD_SUCCESS
            408 -> DownloadStatus.DOWNLOAD_TIMEOUT
            503 -> DownloadStatus.DOWNLOAD_ERROR
            else -> DownloadStatus.NETWORK_ERROR
        }
    }
}