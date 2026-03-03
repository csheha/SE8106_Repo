/* 7. Factorial of a Number */

fun main() {
    val number = 4 
    var factorial = 1L 

    for (i in 1..number) {
        factorial *= i
    }

    println("Factorial of $number is $factorial")
}