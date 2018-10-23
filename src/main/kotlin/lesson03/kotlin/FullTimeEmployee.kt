package lesson03.kotlin

class FullTimeEmployee(name: String, workingTime: Int) : Employee(name, workingTime) {

    private val FIXED_SALARY = 5000

    override fun getSalary(): Int = FIXED_SALARY
}