package lesson03.kotlin

class PartTimeEmployee(name: String, workingTime: Int) : Employee(name, workingTime) {

    private val SALARY_PER_HOUR = 20

    override fun getSalary(): Int = workingTime * 20
}