package Homeworks.HW8;

public class Employee {
//    Задача №2
//Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
// Класс должен иметь метод - getSalary(Month[] monthArray),
// метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.

    String name;
    int age;
    String gender;
    double dailySalary;

    public double getSalary(Month[] monthArray) {
        double totalSalary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            totalSalary += dailySalary * monthArray[i].workdays;
        }
        return totalSalary;
    }

}
