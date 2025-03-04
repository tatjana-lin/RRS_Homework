package Homeworks.HW10;

public class Manager extends Employee {
//Класс Manager должен иметь все то, что имеет Employee, и вдобавок, хранить число подчиненных.
//Метод getSalary(Month[] monthArray) должен учитывать количество подчиненных, и давать надбавку к зарплате в 1% за каждого подчиненного.

    private int subordinates;

    public Manager(String name, double dailySalary, int subordinates) {
        super(name, dailySalary);
        this.subordinates = subordinates;
    }

    public Manager(String name, int age, String gender, double dailySalary, int subordinates) {
        super(name, age, gender, dailySalary);
        this.subordinates = subordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double baseSalary = super.getSalary(monthArray);
        double bonus = baseSalary * (subordinates * 0.01);
        return baseSalary + bonus;
    }

    public int getSubordinates() {
        return subordinates;
    }

}
