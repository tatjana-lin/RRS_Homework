package Homeworks.HW8;

public class MonthUtils {
    //        Задача №1
// Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
// Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).
    public static Month january = new Month();
    public static Month february = new Month();
    public static Month march = new Month();
    public static Month april = new Month();
    public static Month may = new Month();
    public static Month june = new Month();
    public static Month july = new Month();
    public static Month august = new Month();
    public static Month september = new Month();
    public static Month october = new Month();
    public static Month november = new Month();
    public static Month december = new Month();

    public static Month[] allMonths = {
            january, february, march, april, may, june,
            july, august, september, october, november, december
    };
    public static Month[] januaryArray = {
            january
    };
    public static Month[] firstQuarter = {
            january, february, march
    };
    public static Month[] secondQuarter = {
            april, may, june
    };
    public static Month[] thirdQuarter = {
            july, august, september
    };
    public static Month[] fourthQuarter = {
            october, november, december
    };


}
