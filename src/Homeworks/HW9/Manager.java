package Homeworks.HW9;

public class Manager {
    //    Задача №3
// Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
// Поля должны быть спрятаны, для каждого поля создать getter.
//Класс должен иметь метод - getSalary(Month[] monthArray),
// метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
//К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
//В классе Employee создать метод convertToManager(int numberOfSubordinates).
// Этот метод создаст и вернет объект типа Manager с теми же личными данными, что были у Employee,
// и запишет переданное в него количество подчиненных.
    private final String name;
    private int age;
    private String gender;
    private double dailySalary;
    private int subordinates;

    public Manager(String name, int age, String gender, double dailySalary, int subordinates) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dailySalary = dailySalary;
        this.subordinates = subordinates;
    }

    public double getSalary(Month[] monthArray) {
        double baseSalary = 0;
        for (Month month : monthArray) {
            baseSalary += month.getWorkdays() * getDailySalary();
        }
        double bonus = baseSalary * (subordinates * 0.01);
        return baseSalary + bonus;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public int getSubordinates() {
        return subordinates;
    }
}
