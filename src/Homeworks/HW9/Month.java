package Homeworks.HW9;

public class Month {
//    Задача №1
//Создать неизменяемый (immutable) класс Month с полями:
// имя месяца, количеством дней и количеством рабочих дней.
// Поля должны быть спрятаны, для каждого поля создать getter.
//Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).

    private final String monthName;
    private final int days;
    private final int workdays;

    public Month(String monthName, int days, int workdays) {
        this.monthName = monthName;
        this.days = days;
        this.workdays = workdays;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getDays() {
        return days;
    }

    public int getWorkdays() {
        return workdays;
    }
}


