package Homeworks.HW10;

public class Main {
    public static void main(String[] args) {

        Employee john = new Employee("John Smith", 120);

        Employee jane = new Employee("Jane White", 115);
        System.out.println("Employee " + jane.getName() + " got salary " + jane.getSalary(MonthUtils.januaryArray) + " in January");

        Employee kate = new Employee("Kate Black", 19, "female", 110);
        System.out.println("Employee " + kate.getName() + " got salary " + kate.getSalary(MonthUtils.januaryArray) + " in January");

        Employee jack = new Employee("Jack Green", 25, "male", 120);
        System.out.println("Employee " + jack.getName() + " got salary " + jack.getSalary(MonthUtils.januaryArray) + " in January");

        Manager johnManager = john.convertToManager(10);
        System.out.println("New manager " + johnManager.getName() + " got salary " + johnManager.getSalary(MonthUtils.januaryArray) + " in January");

        Director director = new Director("Donald Trump", 75, "male", 120, 100);
        System.out.println("Director " + director.getName() + " got salary " + director.getSalary(MonthUtils.januaryArray) + " in January");

        Employee[] employees = new Employee[]{jane, kate, jack, johnManager, director};
        double totalSalary = SalaryUtils.getTotalSalary(employees, MonthUtils.januaryArray);
        System.out.println("Total salary of all employees in January: " + totalSalary);
        System.out.println("Check: " + (totalSalary == jane.getSalary(MonthUtils.januaryArray)
                + kate.getSalary(MonthUtils.januaryArray)
                + jack.getSalary(MonthUtils.januaryArray)
                + johnManager.getSalary(MonthUtils.januaryArray)
                + director.getSalary(MonthUtils.januaryArray)));
    }
}
