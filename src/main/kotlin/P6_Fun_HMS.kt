fun main() {
    val no1 = 111
    val no2 = 2222
    val no3 = -222

    println("Addition of 111, 2222, -222 is ${operation('+',no1,no2,no3)}")
    println("Subtraction of 111, 2222, -222 is ${operation('-',no1,no2,no3)}")
    println("Multiplication of 111, 2222, -222 is ${operation('*',no1,no2,no3)}")
    println("Division of 2222, 111 is ${operation('/',no2,no1)}")
}
fun operation(op:Char,vararg numbers:Int):Int{
    when(op)
    {
        '+'->{
            var sum =0
            for(num in numbers)
                sum+=num
            return (sum)
        }
        '*'->{
            var mul = 1
            for(num in numbers)
                mul *= num
            return (mul)
        }
        '-'->{
            var sub = numbers[0]
            for(i in 1 until numbers.count())
                sub -= numbers[i]
            return (sub)
        }
        '/'->{
            var sub = numbers[0]
            for(i in 1 until numbers.count())
                sub /= numbers[i]
            return (sub)
        }
        else->{
            print("Wrong Operators")
            return -1
        }
    }

}
