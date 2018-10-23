package lesson03.java;

abstract class Employee {

    private String mName;
    private int mWorkingHours;

    public Employee(String name, int workingHours) {
        mName = name;
        mWorkingHours = workingHours;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getWorkingHours() {
        return mWorkingHours;
    }

    public void setWorkingHours(int workingHours) {
        mWorkingHours = workingHours;
    }

    abstract int getSalary();
}
