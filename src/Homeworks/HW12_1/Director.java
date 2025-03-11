package Homeworks.HW12_1;

public final class Director extends BaseEmployee {

    private final int subordinates;
    private static final double FACTOR = 0.03;

    public Director(String name, double dailySalary, int subordinates) {
        super(name, dailySalary);
        this.subordinates = subordinates;
    }

    public Director(String name, int age, String gender, double dailySalary, int subordinates) {
        super(name, age, gender, dailySalary);
        this.subordinates = subordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double bonus = getBaseSalary(monthArray) * subordinates * FACTOR;
        return getBaseSalary(monthArray) + bonus;
    }
}
