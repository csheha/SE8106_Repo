/* 5. Remove Duplicates from a List */

fun main() {
    val numbers = listOf(1, 2, 2, 3, 4, 4, 5) 
    val uniqueNumbers = numbers.distinct()  
    println("List without duplicates: $uniqueNumbers")
}