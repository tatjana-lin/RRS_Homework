package Homeworks.HW10;

public class Director extends Manager {

    //Класс Director должен вести себя как Manager, но давать надбавку к зарплате в 3% за каждого подчиненного.

    public Director(String name, double dailySalary, int subordinates) {
        super(name, dailySalary, subordinates);
    }

    public Director(String name, int age, String gender, double dailySalary, int subordinates) {
        super(name, age, gender, dailySalary, subordinates);
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double managerSalary = super.getSalary(monthArray);
        double baseSalary = managerSalary / (1 + super.getSubordinates() * 0.01);
        double bonus = baseSalary * (super.getSubordinates() * 0.03);
        return baseSalary + bonus;
    }
}
