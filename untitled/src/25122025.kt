fun main () {
    val list: List<Int> = listOf(0, 1, 2, 3, 4, 5, 6)
    val result = list
        .filter {
            it % 3 == 0
        }
        .map {
            it * 2
        }
    print(result)
}
