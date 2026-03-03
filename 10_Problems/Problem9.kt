/* 9. Number Guessing with While Loop */

fun main() {
    val secretNumber = (1..10).random() // Random number between 1 and 10
    var guess = 0 

    println("Guess a number between 1 and 10:")

    while (guess != secretNumber) { // looping until correct
        print("Enter your guess: ")
        val input = readLine() // input from the user
        if (input != null) {
            guess = input.toInt() // Convert input to number
            if (guess == secretNumber) {
                println("Congrats! You guessed the correct number: $secretNumber")
            } else {
                println("Wrong guess. Try again!")
            }
        }
    }
}