package DSA

fun main(){
    /*
    Arithmetic operators => +,-,*,/,%
    Concatenation of strings
    Assignment operators => =, +=, -=, *=, /=, %=
    Increment/Decrement operators => ++, --
    Comparison and Equality operators => >,<,<=, >=, ==, !=
    Logical Operators => ||, &&
     */

    val a = 12.0f
    val b = 5.0f
    val result : Float = (a / b)
    println(result)
    println("ABC" + 2)
    println("ABC" + "DEF")

    // If else
    val a1 = 5
    val a2 = 6
    if(a1 == a2){
        println("$a1 is equal to $a2")
    } else{
        println("$a1 is not equal to $a2")
    }

    val age = readLine()!!.toInt() // For taking user input
    val myHeight = 5.8
    val herHeight = 5.5
    val taller = if (myHeight > herHeight){
        "I am taller"
    } else{
        "She is taller"
    }
    println(taller)


    // When in Kotlin, difference between if else and when
    val myAge = readLine()!!.toInt()
    val result1 = myAge in 1..100     // Range function in Kotlin
    when(myAge){
        18 -> println("You are young")
        60 -> println("You are old")
        else -> println("Lund lele")
    }


}