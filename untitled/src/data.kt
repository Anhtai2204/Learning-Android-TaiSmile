fun main () {
    data class Student(
        val id: Int,
        val name: String,
        val score: Int
    )
    val student: List<Student> = listOf(
        Student(1,"An",8),
        Student(2,"Binh",4),
        Student(3,"Chi",6)
    )
}