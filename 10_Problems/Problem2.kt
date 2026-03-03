/* 2. Maximum in a List */
 
fun main() {
    val numbers = listOf(5, 12, 3, 9, 20, 7) 
    
    var maxNum = numbers[0] 

    for (num in numbers) {
        if (num > maxNum) {
            maxNum = num
        }
    }

    println("The largest number is: $maxNum")
}