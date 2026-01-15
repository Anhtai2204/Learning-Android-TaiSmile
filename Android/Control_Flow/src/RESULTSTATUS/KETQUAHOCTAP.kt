package RESULTSTATUS

import ENUM.ResultStatus

object RESULTSTATUS {
    fun evaluateScore(score: Double?): ResultStatus {
        if (score == null || score < 0 || score > 10) {
            return ResultStatus.RESULT_INVALID
        }
        if (score >= 5) {
            return ResultStatus.RESULT_PASS
        }
        return ResultStatus.RESULT_FAIL
    }
}