package Homeworks.HW12_1;

public class MonthUtils {

    public static final Month JANUARY = new Month("January", 31, 23);
    public static final Month FEBRUARY = new Month("February", 28, 20);
    public static final Month MARCH = new Month("March", 31, 21);
    public static final Month APRIL = new Month("April", 30, 22);
    public static final Month MAY = new Month("May", 31, 21);
    public static final Month JUNE = new Month("June", 30, 21);
    public static final Month JULY = new Month("July", 31, 23);
    public static final Month AUGUST = new Month("August", 31, 21);
    public static final Month SEPTEMBER = new Month("September", 30, 21);
    public static final Month OCTOBER = new Month("October", 31, 23);
    public static final Month NOVEMBER = new Month("November", 30, 20);
    public static final Month DECEMBER = new Month("December", 31, 22);

    public static Month[] year = {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
            JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    };

    public static Month[] halfYear_1 = {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE
    };

    public static Month[] halfYear_2 = {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
            JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    };

    public static Month[] quarter_1 = {
            JANUARY, FEBRUARY, MARCH
    };
    public static Month[] quarter_2 = {
            APRIL, MAY, JUNE
    };
    public static Month[] quarter_3 = {
            JULY, AUGUST, SEPTEMBER
    };
    public static Month[] quarter_4 = {
            OCTOBER, NOVEMBER, DECEMBER
    };
}
