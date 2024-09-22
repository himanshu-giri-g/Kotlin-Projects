import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter Principal Amount (in ₹): ")
    val P = scanner.nextInt()

    print("Enter Rate of Interest (in %): ")
    val R = scanner.nextFloat()

    print("Enter Time Period (in years): ")
    val T = scanner.nextInt()

    val SI = (P * R * T) / 100.0  // Simple Interest
    println("Simple Interest for the given amount is: Rs.$SI")
}