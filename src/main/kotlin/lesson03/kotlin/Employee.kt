package lesson03.kotlin

abstract class Employee(var name: String, var workingTime: Int) {
    abstract fun getSalary(): Int
}