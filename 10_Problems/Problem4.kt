/* 4. Count Vowels in a String */

 
fun main() {
    val text = "Hello World"
    val vowels = text.count { it.lowercaseChar() in "aeiou" }
    println("Number of vowels: $vowels")
}