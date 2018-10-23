package lesson03.java;

public class PartTimeEmployee extends Employee {

    private final int SALARY_PER_HOUR = 20;

    public PartTimeEmployee(String name, int workingHours) {
        super(name, workingHours);
    }

    @Override
    int getSalary() {
        return getWorkingHours() * SALARY_PER_HOUR;
    }
}
