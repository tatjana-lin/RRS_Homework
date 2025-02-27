package Homeworks.HW9;

public class Employee {
//    Задача №2
//Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
//Имя и ЗП должны быть обязательными, остальные поля — нет.
//Создать необходимые конструкторы и / или setter-ы (по собственному разумению), чтобы было удобно создавать эти объекты.
//Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.

// В классе Employee создать метод convertToManager(int numberOfSubordinates).
// Этот метод создаст и вернет объект типа Manager с теми же личными данными, что были у Employee,
// и запишет переданное в него количество подчиненных.

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
