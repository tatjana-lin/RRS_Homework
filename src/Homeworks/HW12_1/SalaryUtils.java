package Homeworks.HW12_1;

public class SalaryUtils {

    public static double getTotalSalary(BaseEmployee[] employees, Month[] months) {
        double totalSalary = 0;

        for (BaseEmployee emp : employees) {
            totalSalary += emp.getSalary(months);
        }
        return totalSalary;
    }

}
