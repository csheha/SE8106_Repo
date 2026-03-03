/* 3. FizzBuzz */

fun main() {
    for (num in 1..50) {
        when {
            num % 3 == 0 && num % 5 == 0 -> println("Fizzbuzz")
            num % 3 == 0 -> println("Fizz")
            num % 5 == 0 -> println("Buzz")
            else -> println(num)
        }
    }
}