/* 8. Sum of Positive Numbers */

fun main() {
    val numbers = listOf(-5, 3, 7, -2, 0, 10) 
    
    val positiveSum = numbers.filter { it > 0 }.sum()
    
    println("Sum of positive numbers: $positiveSum")
}