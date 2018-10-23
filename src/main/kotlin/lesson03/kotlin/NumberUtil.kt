package lesson03.kotlin

object NumberUtil {
    fun addTwoNumbersWithSingleExpression(firstNumber: Int, secondNumber: Int): Int = firstNumber + secondNumber

    fun addTwoNumbers(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber + secondNumber
    }

    fun printNumberWithUnitReturnType(number: Int = 0): Unit {
        print(number)
        println()
    }

    fun printNumber(number: Int = 0) {
        print(number)
        println()
    }

    fun sum(numberList: List<Int>, add: (Int, Int) -> Int): Int {
        var sum = 0

        for (currentNumber in numberList) {
            sum = add(sum, currentNumber)
        }

        return sum
    }

    fun sum(vararg numbers: Int): Int {
        var sum = 0

        for (currentNumber in numbers) {
            sum += currentNumber
        }

        return sum
    }

    fun sum(vararg numbers: Int, add: (Int, Int) -> Int): Int {
        var sum = 0

        for (currentNumber in numbers) {
            sum = add(sum, currentNumber)
        }

        return sum
    }

    fun max(numberOne: Int, numberTwo: Int) {
        fun printNumber(number: Int) {
            println(number)
        }

        printNumber(if (numberOne >= numberTwo) numberOne else numberTwo)
    }
}