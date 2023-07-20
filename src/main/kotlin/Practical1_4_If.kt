fun main() {
    println("Enter the number")
    val number = readLine()!!.toInt()
    if (number % 2 == 0) {
        println("number is even")
    } else {
        println("Number is oddd")
    }
}