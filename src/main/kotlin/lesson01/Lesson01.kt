package lesson01

var fullname: String = ""
fun main(args: Array<String>) {

    //variable declaration
    val firstName = "Rahima"
    val lastName: String = "Shapla"

    val firstDigit = "100"
    val lastDigit = "50"

    //calling  method and printing
    println(getFullName(firstName, lastName))
    println(typeConversion(firstDigit, lastDigit))

    val emptyList = emptyList<Int>()
    println("emptyList.any() is ${emptyList.any()}") // false

    val nonEmptyList = listOf(1, 2, 3)
    println("nonEmptyList.any() is ${nonEmptyList.any()}") // true

    receiveAny(firstName)

}

//variables declaring and type defination
fun just_a_block_to_show_variable_declaration() {
    // keyword val : constant , immutable
    //keyword var : mutable
/*
    val firstName: String = "Chike"
    val lastName = "Mgbemena" // will still compile

    val dateOfBirth = "29th March, 1709"
    dateOfBirth = "25th December, 1600" // cannot be changed

    var car = "Toyota Matrix"
    car = "Mercedes-Maybach" // can be changed

    //type mismatch
    var age = 12
    age = "12 years old" // Error: type mismatch

    val carName: String
    carName = "Toyota Matrix" // will compile

    val carName = "BMW", streetName = "Oke street" // this won't compile

// this will compile
    var carName = "BMW"
    var streetName = "Oke street"*/
}

//basic type in kotlin

//NUMBERS
val myInt = 55
val myLong = 40L
val myFloat = 34.43F
val myDouble = 45.78
val myHexadecimal = 0x0F
val myBinary = 0b010101

val myLongg = 19L
val myLongAgain: Long = 40

val myNumber = 400
//val myNumberAgain: Long = myNumber // throws Error: Type mismatch

//BOOLEAN
val myTrueBoolean = true
val myFalseBoolean = false

//STRING

//single line
val myString = "This is a String"
val escapeString = "This is a string with new line \n"

//multiple lines
val multipleStringLines = """
        This is first line
        This is second line
        This is third line """

//variables and expression into a string
val accountBalance = 200
val bankMessage = "Your account balance is $accountBalance" // Your account balance is 200

//with curly braces calling method
val name = "Chike"
val message = "The first letter in my name is ${name.first()}" // The first letter in my name is C

//logistic operation in curly brace
val age = 40
val anotherMessage = "You are ${if (age > 60) "old" else "young"}" // You are young


//return fullname by appending
fun getFullName(firstName: String, lastName: String): String {
    fullname = firstName + " " + lastName
    return fullname
}

//converting type
fun typeConversion(firstDigit: String, lastDigit: String): Int {
    return firstDigit.toInt() + lastDigit.toInt()
}

//any! as java.lang.Object

fun receiveAny(obj: Any?) {
    if (obj is String) {
        println("yes its stringssssssssssssssss")
    }


//unit as void

    fun typeConversion(firstDigit: String, lastDigit: String): Unit {
        //  return firstDigit.toInt() + lastDigit.toInt()
    }

    fun something(exec: Boolean, func: () -> Unit) {
        if (exec) {
            func()
        }
    }
    //Anonymous function
    something(true, fun() {
        println("blehhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh")
    })

/*
        //Lambda
        something(true) {
            println("bleh")
        }*/


}


