package Homeworks.HW12_1;

public class Month {
//    Продолжение задания из Tasks#10.
//Класс Month сделать неизменяемым (immutable)
//Статические поля с объектами месяцев должны быть финальными
//Создать статические методы возвращающие кварталы (массивы по 3 месяца соответственно), полугодия и год.
//Необходимо создать базовый абстрактный класс BaseEmployee как общего родителя
//Метод BaseEmployee.getSalary должен быть абстрактным
//Коэффициенты для расчета ЗП у Manager и Director должны быть константами (коэффициенты из формулы расчета ЗП)
//Классы Employee,Manager и Director должны быть финальными

    private final String monthName;
    private final int days;
    private final int workdays;

    public Month(String monthName, int days, int workdays) {
        this.monthName = monthName;
        this.days = days;
        this.workdays = workdays;
    }

    public int getWorkdays() {
        return workdays;
    }

}
