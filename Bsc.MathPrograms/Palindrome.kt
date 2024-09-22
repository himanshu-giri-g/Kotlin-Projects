import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter a word: ")
    val strN = scanner.next()

    if (strN == strN.reversed()) {
        println("The word $strN is a Palindrome.")
    } else {
        println("The word $strN is not a Palindrome.")
    }
}