package Homeworks.HW12_1;

public abstract class BaseEmployee {

    private String name;
    private int age;
    private String gender;
    private double dailySalary;

    public BaseEmployee(String name, double dailySalary) {
        this.name = name;
        this.dailySalary = dailySalary;
    }

    public BaseEmployee(String name, int age, String gender, double dailySalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dailySalary = dailySalary;
    }

    public double getBaseSalary(Month[] monthArray) {
        double totalSalary = 0;
        for (Month month : monthArray) {
            totalSalary += month.getWorkdays() * getDailySalary();
        }
        return totalSalary;
    }

    public abstract double getSalary(Month[] monthArray);

    public String getName() {
        return name;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
