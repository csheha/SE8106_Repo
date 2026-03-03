/* 10. Print a Pattern */

fun main() {
    val rows = 5 

    for (i in 1..rows) { // Outer loop for rows
        for (j in 1..i) { // Inner loop for each row
            print("*")
        }
        println() // next line after each row
    }
}