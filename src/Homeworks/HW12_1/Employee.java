package Homeworks.HW12_1;

public final class Employee extends BaseEmployee {

    public Employee(String name, int age, String gender, double dailySalary) {
        super(name, age, gender, dailySalary);
    }

    public Employee(String name, double dailySalary) {
        super(name, dailySalary);
    }


    @Override
    public double getSalary(Month[] monthArray) {
        return getBaseSalary(monthArray);
    }

    public Manager convertToManager(int numberOfSubordinates) {
        return new Manager(getName(), getAge(), getGender(), getDailySalary(), numberOfSubordinates);
    }

}
