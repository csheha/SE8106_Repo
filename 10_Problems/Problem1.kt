/* 1. Sum of Even Numbers */
 
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6) 
    val sumEven = numbers.filter { it % 2 == 0 }.sum()
    println("Sum of even numbers: $sumEven")
} 