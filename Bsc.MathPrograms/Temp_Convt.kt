import java.util.*

fun main() {
    println("---WELCOME TO TEMPERATURE CONVERTER---")
    println("1. Celsius to Kelvin\n2. Kelvin to Celsius")

    val scanner = Scanner(System.`in`)
    print("Choose any one option: ")
    val a = scanner.nextInt()

    when (a) {
        1 -> {
            print("Enter Temperature to be converted (in Celsius): ")
            val temp = scanner.nextInt()
            val convT = temp + 273
            println("The Temperature in Kelvin for the given temperature is: $convT K")
        }
        2 -> {
            print("Enter Temperature to be converted (in Kelvin): ")
            val temp = scanner.nextInt()
            val convT = temp - 273
            println("The Temperature in Celsius for the given temperature is: $convT C")
        }
        else -> println("ERROR ! Please Choose a valid option.")
    }
}