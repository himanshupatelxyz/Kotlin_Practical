fun main(){
    var a=10
    var b=20
    var temp:Int
    println("Before Swapping:")
    println("The value of a is:$a and Value of B is:$b")
    temp=a
    a=b
    b=temp
    println("After swapping")
    println("The value of a is:$a and Value of B is:$b")
    change()
}
fun change(){
    var a=10
    var b=20
    println("Before swapping")
    println("The value of a is:$a and b is $b")
    a=a+b
    b=a-b
    a=a-b
    println("The value of a is:$a and b is $b")
}
