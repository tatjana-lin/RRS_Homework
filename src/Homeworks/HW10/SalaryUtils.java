package Homeworks.HW10;

public class SalaryUtils {
//    Задача №2
//Создать класс SalaryUtils, и в нем написать метод getTotalSalary(Employee[] employees, Month[] months),
// который подсчитает общую сумму к выплате на всех сотрудников — простых работников, менеджеров и директоров.

    public static double getTotalSalary(Employee[] employees, Month[] months) {
        double totalSalary = 0;

        for (Employee emp : employees) {
            totalSalary += emp.getSalary(months);
        }
        return totalSalary;
    }

}
