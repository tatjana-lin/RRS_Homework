package Homeworks.HW10;

public class Employee {
//    Задача №1
//Необходимо создать иерархию классов.
//Класс Employee должен иметь поля: имя, возраст, пол и ЗП в день.
//Имя и ЗП должны быть обязательными, остальные поля — нет.
//Класс должен иметь метод - getSalary(Month[] monthArray),
//метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
//Класс Manager должен иметь все то, что имеет Employee, и вдобавок, хранить число подчиненных.
//Метод getSalary(Month[] monthArray) должен учитывать количество подчиненных, и давать надбавку к зарплате в 1% за каждого подчиненного.
//Класс Director должен вести себя как Manager, но давать надбавку к зарплате в 3% за каждого подчиненного.

    private final String name;
    private int age;
    private String gender;
    private double dailySalary;

    public Employee(String name, double dailySalary) {
        this.name = name;
        this.dailySalary = dailySalary;
    }

    public Employee(String name, int age, String gender, double dailySalary) {
        this(name, dailySalary);
        this.age = age;
        this.gender = gender;
    }

    public double getSalary(Month[] monthArray) {
        double totalSalary = 0;
        for (Month month : monthArray) {
            totalSalary += month.getWorkdays() * getDailySalary();
        }
        return totalSalary;
    }

    public Manager convertToManager(int numberOfSubordinates) {
        return new Manager(name, age, gender, dailySalary, numberOfSubordinates);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }
}
