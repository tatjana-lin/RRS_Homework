package Homeworks.HW10;

public class MonthUtils {
    //Создать класс MonthUtils который бы хранил подготовленные месяцы или их массивы для использования (объекты класса Month).

    public static final Month january = new Month("January", 31, 23);
    public static final Month february = new Month("February", 28, 20);
    public static final Month march = new Month("March", 31, 21);
    public static final Month april = new Month("April", 30, 22);
    public static final Month may = new Month("May", 31, 21);
    public static final Month june = new Month("June", 30, 21);
    public static final Month july = new Month("July", 31, 23);
    public static final Month august = new Month("August", 31, 21);
    public static final Month september = new Month("September", 30, 21);
    public static final Month october = new Month("October", 31, 23);
    public static final Month november = new Month("November", 30, 20);
    public static final Month december = new Month("December", 31, 22);

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
