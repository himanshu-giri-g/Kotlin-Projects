import kotlin.math.pow

fun main() {
    print("Enter a Number: ")
    val a = readLine()?.toIntOrNull()
    if (a != null) {
        val b = a.toString()
        val c = b.length
        var sum = 0.0
        for (i in b) {
            sum += (i.toString().toInt()).toDouble().pow(c.toDouble())
        }
        if (sum == a.toDouble()) {
            println("The No. $a is an Armstrong Number.")
        } else {
            println("The No. $a is not an Armstrong Number.")
        }
    } else {
        println("Invalid input. Please enter a valid number.")
    }
}