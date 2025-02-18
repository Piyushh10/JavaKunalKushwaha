package DSA

fun main(){
    println("Hello World")
    val myName = "Piyush" //immutable
//    myname = "papa" is not possible
    println(myName)
    var xyz = 69 //mutable
    xyz = 100
    println("The value of xyz is $xyz")

    var name : String = "Piyush Shivnani"
            /*
            or you can also do
            var name : String
            name = "Piyush Shivnani"

            same can be done for val
             */
    var marks : Int = 100
    println("My name is $name and i've got $marks marks in Mathematics")

    var fvtDrink : String
    fvtDrink = "Tea"
    println(fvtDrink)

    /*
    Integer types =>
    Int 32 bits
    Byte 8 bits
    Short 16 bits
    Long 64 bits
     */
    var myInteger : Int
    myInteger = 2147483647
    myInteger = -2147483648
    println(myInteger)

    var myByte : Byte
    myByte = 127
    myByte = -128

    var myShort : Short
    myShort = 32767

    var myLong : Long
    myLong = 9223372036854775807L

    /*
    Floating types =>
    Float 32 bits
    Double 32 bits
     */

    val myFloat : Float
    myFloat = 3.4028235E38f

    val myDouble : Double
    myDouble = 3.12412423422 // its not a limit, just a random double

    val myChar : Char
    myChar = 'S'

    val myBoolean : Boolean
    myBoolean = true

    val myString : String
    myString = "String"
}