package Homeworks.HW12_1;

public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("John Smith", 120);

        Employee jane = new Employee("Jane White", 115);
        System.out.println("Employee " + jane.getName() + " got salary " + jane.getSalary(MonthUtils.quarter_1) + " in the first quarter");

        Employee kate = new Employee("Kate Black", 19, "female", 110);
        System.out.println("Employee " + kate.getName() + " got salary " + kate.getSalary(MonthUtils.quarter_1) + " in the first quarter");

        Employee jack = new Employee("Jack Green", 25, "male", 120);
        System.out.println("Employee " + jack.getName() + " got salary " + jack.getSalary(MonthUtils.quarter_1) + " in the first quarter");

        Manager johnManager = john.convertToManager(10);
        System.out.println("New manager " + johnManager.getName() + " got salary " + johnManager.getSalary(MonthUtils.quarter_1) + " in the first quarter");

        Director director = new Director("Donald Trump", 75, "male", 120, 100);
        System.out.println("Director " + director.getName() + " got salary " + director.getSalary(MonthUtils.quarter_1) + " in the first quarter");

        BaseEmployee[] employees = new BaseEmployee[]{jane, kate, jack, johnManager, director};
        double totalSalary = SalaryUtils.getTotalSalary(employees, MonthUtils.quarter_1);
        System.out.println("Total salary of all employees in the first quarter: " + totalSalary);
        System.out.println("Check: " + (totalSalary == jane.getSalary(MonthUtils.quarter_1)
                + kate.getSalary(MonthUtils.quarter_1)
                + jack.getSalary(MonthUtils.quarter_1)
                + johnManager.getSalary(MonthUtils.quarter_1)
                + director.getSalary(MonthUtils.quarter_1)));

    }

}
