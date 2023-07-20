/**
 * Find the factorial of number by recursion.
 * https://kotlinlang.org/docs/functions.html#tail-recursive-functions
 */
fun main() {
    print("Enter Number:")
    val number = readLine()!!.toInt()
    val result: Long = factorial(number)
    val tailResult: Long = fact(number)
    println("Factorial of $number = $result")
    println("By TailRec Keyword, Factorial of $number = $tailResult")
}

fun factorial(n: Int): Long = if(n == 1) n.toLong() else factorial(n-1)*n
tailrec fun fact(n: Int,temp:Long = 1): Long = if(n == 1) temp else fact(n-1,temp*n)
