package Homeworks.HW9;

public class Main {
    public static void main(String[] args) {

        Employee john = new Employee("John Smith", 120);
        System.out.println("Employee " + john.getName() + " got salary in January " + john.getSalary(MonthUtils.januaryArray));
        Employee jane = new Employee("Jane White", 115);
        System.out.println("Employee " + jane.getName() + " got salary in January " + jane.getSalary(MonthUtils.januaryArray));
        Employee kate = new Employee("Kate Black", 19, "female", 110);
        System.out.println("Employee " + kate.getName() + " got salary in January " + kate.getSalary(MonthUtils.januaryArray));
        Employee jack = new Employee("Jack Green", 25, "male", 120);
        System.out.println("Employee " + jack.getName() + " got salary in January " + jack.getSalary(MonthUtils.januaryArray));

        Manager johnManager = john.convertToManager(10);
        System.out.println("New manager " + johnManager.getName() + " got salary in January " + johnManager.getSalary(MonthUtils.januaryArray));

    }
}
