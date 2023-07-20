fun addNumbers(x:Double=0.0,y:Double=0.0){
    val temp:Double=x+y
    println("Add=$temp")
}
fun displayInfo(vararg names:String){
    for (name in names){
        println(name)
    }

}

fun main(){
    print("Start Main Function")
    var returnSub=  addNumbers(3.0,4.0)
    returnSub=addNumbers(5.0,12.0)
    returnSub=addNumbers(11.0,9.0)
    returnSub=addNumbers(7.0,4.0)
    //Default Argument x=0.0.
    returnSub= addNumbers(y=20.0)

    println("THe value of returnSUb:$returnSub")
    //when you want to pass more than one value in arguments.
    displayInfo(names=*arrayOf("Himanshu","Nirav","ketan"))
    print("End of Main Function")
}
