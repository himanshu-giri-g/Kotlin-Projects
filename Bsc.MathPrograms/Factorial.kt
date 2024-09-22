fun factorial(num: Int): Int {
    if (num == 0 || num == 1) {
        return 1
    } else {
        return num * factorial(num - 1)
    }
}

fun main() {
    print("Enter a number: ")
    val num = readLine()!!.toInt()
    println(factorial(num))
}