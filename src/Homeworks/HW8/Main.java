package Homeworks.HW8;

public class Main {
    public static void main(String[] args) {

        MonthUtils.january.monthName = "january";
        MonthUtils.january.days = 31;
        MonthUtils.january.workdays = 23;

        MonthUtils.february.monthName = "february";
        MonthUtils.february.days = 28;
        MonthUtils.february.workdays = 20;

        MonthUtils.march.monthName = "march";
        MonthUtils.march.days = 31;
        MonthUtils.march.workdays = 21;

        MonthUtils.april.monthName = "april";
        MonthUtils.april.days = 30;
        MonthUtils.april.workdays = 22;

        MonthUtils.may.monthName = "may";
        MonthUtils.may.days = 31;
        MonthUtils.may.workdays = 21;

        MonthUtils.june.monthName = "june";
        MonthUtils.june.days = 30;
        MonthUtils.june.workdays = 21;

        MonthUtils.july.monthName = "july";
        MonthUtils.july.days = 31;
        MonthUtils.july.workdays = 23;

        MonthUtils.august.monthName = "august";
        MonthUtils.august.days = 31;
        MonthUtils.august.workdays = 21;

        MonthUtils.september.monthName = "september";
        MonthUtils.september.days = 30;
        MonthUtils.september.workdays = 21;

        MonthUtils.october.monthName = "october";
        MonthUtils.october.days = 31;
        MonthUtils.october.workdays = 23;

        MonthUtils.november.monthName = "november";
        MonthUtils.november.days = 30;
        MonthUtils.november.workdays = 20;

        MonthUtils.december.monthName = "december";
        MonthUtils.december.days = 31;
        MonthUtils.december.workdays = 22;

        Employee employee1 = new Employee();
        employee1.name = "Kate Green";
        employee1.age = 28;
        employee1.gender = "female";
        employee1.dailySalary = 120;

        Manager manager1 = new Manager();
        manager1.name = "John Grey";
        manager1.age = 35;
        manager1.gender = "male";
        manager1.dailySalary = 160;
        manager1.subordinates = 10;

        System.out.println("Employee's salary in january: " + employee1.getSalary(MonthUtils.januaryArray));
        System.out.println("Manager's salary in january: " + manager1.getSalary(MonthUtils.januaryArray));
        System.out.println("=====================================");
        System.out.println("Employee's salary in the first quarter: " + employee1.getSalary(MonthUtils.firstQuarter));
        System.out.println("Manager's salary in the first quarter: " + manager1.getSalary(MonthUtils.firstQuarter));

    }
}
