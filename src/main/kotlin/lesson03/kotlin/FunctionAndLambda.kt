package lesson03.kotlin

fun main(args: Array<String>) {
    // Using basic functions
    var summation = NumberUtil.sum(1, 2, 3, 4, add = NumberUtil::addTwoNumbers)
    NumberUtil.printNumber(summation)

    // Using generic function
    DataUtil.printObject(FullTimeEmployee("Rockstar", 176))


    // Using lambda
    // 1st approach
    summation = NumberUtil.sum(5, 6, 7, add = { a, b -> a + b })
    NumberUtil.printNumber(summation)

    // 2nd approach
    summation = NumberUtil.sum(5, 6, 7) { a, b ->
        a + b
    }
    NumberUtil.printNumber(summation)
}