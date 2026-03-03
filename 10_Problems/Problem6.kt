/* 6. Reverse a List */

fun main() {
    val list = listOf("apple", "banana", "cherry", "date")
    val reversedList = mutableListOf<String>()

    for (i in list.size - 1 downTo 0) {
        reversedList.add(list[i])
    }

    println("Reversed list: $reversedList")
}