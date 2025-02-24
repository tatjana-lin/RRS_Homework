package Homeworks.HW8;

public class Manager {
    //    Задача №3
//Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
// Класс должен иметь метод - getSalary(Month[] monthArray),
// метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
//К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
    String name;
    int age;
    String gender;
    double dailySalary;
    int subordinates;

    public double getSalary(Month[] monthArray) {
        double baseSalary = 0;
        for (int i = 0; i < monthArray.length; i++) {
            baseSalary += monthArray[i].workdays * dailySalary;
        }
        double bonus = baseSalary * (subordinates * 0.01);
        return baseSalary + bonus;
    }

}
