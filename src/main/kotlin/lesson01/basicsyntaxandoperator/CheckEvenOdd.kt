package lesson01.basicsyntaxandoperator


import java.util.Scanner

internal object CheckEvenOdd {
    @JvmStatic
    fun main(args: Array<String>) {
        val num: Int
        println("Enter an Integer number:")

        //The input provided by user is stored in num
        val input = Scanner(System.`in`)
        num = input.nextInt()

        /* If number is divisible by 2 then it's an even number
             * else odd number*/
        if (num % 2 == 0)
            println("Entered number is even")
        else
            println("Entered number is odd")
    }

}
