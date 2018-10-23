package lesson03.java;

public class FullTimeEmployee extends Employee {

    private final int FIXED_SALARY = 5000;

    public FullTimeEmployee(String name, int workingHours) {
        super(name, workingHours);
    }

    @Override
    int getSalary() {
        return FIXED_SALARY;
    }
}
