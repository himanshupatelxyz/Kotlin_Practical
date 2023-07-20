/**
 * Sort Array of Integer data type without using inbuilt function & with using inbuilt function
 */
fun main()
{
    // first //
    println("Create Array-1 by using arrayOf() method:")
    var array1= arrayOf(10,90,60,80,100) //function
    printArray(array1)
    println("Create Array-2 by using Array<>():")
    val array2=Array<Int>(5){0}
    printArray(array2)
    //array three by lambda function
    println("Create Array-3 by using Array<>() and lambda function:")
    val array3=Array(8) { i: Int -> i }
    printArray(array3)
    println("Create Array-4 by using IntArray():")
    var array4 = IntArray(5)
    printArray(nameArray = array4)
    println("Create Array-5 by using intArrayOf():")
    val array5 = intArrayOf(12,10,1,5,18,19)
    printArray(nameArray = array5)
    println("Create 2D Array-6 by using arrayOf() and intArrayOf():")
    val array6 = arrayOf(intArrayOf(1,3),intArrayOf(4,5),intArrayOf(6,7))
    printArray(nameArray = array6)
    println("Please enter Array Value:")
    for (i in array2.indices){
        print("a[$i]=")
        array2[i]= readLine()!!.toInt()
        var string = readLine()
        val integ = string?.toInt()

        //println(array2[i])
    }
    println("Entered Array:")
    printArray(array2)
    println("*************With Built-in Function***************")
    withSortFun(nameArray = array2.toIntArray())
    println("*************Without Built-in Function***************")
    withOutSortFun(nameArray = array2.toIntArray())
}
fun <T> printArray(nameArray:Array<T>){
    println(nameArray.contentDeepToString())
}
fun printArray(vararg nameArray:Int){
    println(nameArray.toTypedArray().contentDeepToString())
    println("")
}
fun withOutSortFun(vararg nameArray:Int){
    println("Before Sorting:")
    printArray(nameArray=nameArray)
    for (i in 0..nameArray.size-2){
        for (j in i+1 until nameArray.size){
            if(nameArray[i] > nameArray[j]){
                val temp=nameArray[i]
                nameArray[i]=nameArray[j]
                nameArray[j]=temp
            }
        }
    }
    println("After Sorting without built-in function:")
    printArray(nameArray=nameArray)
}
fun withSortFun(vararg nameArray: Int){
    println("After sorting by built-in function:")
    nameArray.sort()
    printArray(nameArray=nameArray)
}
