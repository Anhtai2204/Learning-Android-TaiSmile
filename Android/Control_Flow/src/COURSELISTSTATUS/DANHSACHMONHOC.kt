package COURSELISTSTATUS

import DATA.Course_Model
import ENUM.CourseListStatus

object COURSELISTSTATUS {
    fun getCourseListStatus(course: List<Course_Model>): CourseListStatus {
        if (course.isEmpty()) {
            return CourseListStatus.COURSE_LIST_EMPTY
        }
        return CourseListStatus.COURSE_LIST_SUCCESS
    }
}