fun main() {
    var n = 10
    var num1 = 0
    var num2 = 1
    var nextNumber = num2
    var count = 1

    while (count <= n) {
        print("$nextNumber ")
        count++
        num1 = num2
        num2 = nextNumber
        nextNumber = num1 + num2
    }
    println()
}