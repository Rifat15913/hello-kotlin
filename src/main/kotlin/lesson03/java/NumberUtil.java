package lesson03.java;

import java.util.List;

public class NumberUtil {
    private static NumberUtil sInstance;

    private NumberUtil() {

    }

    public static NumberUtil on() {
        if (sInstance == null) sInstance = new NumberUtil();
        return sInstance;
    }

    int addTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    void printNumberWithVoidReturnType(int number) {
        System.out.print(number);
        System.out.println();
    }

    void printNumber(int number) {
        System.out.print(number);
        System.out.println();
    }

    int sum(int... numbers) {
        int sum = 0;

        for (int currentNumber : numbers) {
            sum += currentNumber;
        }

        return sum;
    }

    int sum(List<Integer> numberList) {
        int sum = 0;

        for (int currentNumber : numberList) {
            sum += currentNumber;
        }

        return sum;
    }

    void max(int numberOne, int numberTwo) {
        NumberUtilCallback callback = System.out::println;
        callback.printNumber(numberOne >= numberTwo ? numberOne : numberTwo);
    }
}
