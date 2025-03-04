package Homeworks.HW10;

public class Task3 {
//Разобраться с двумя вариантами работы switch в Джаве:
//switch statement и switch expression.
// Используя их, написать два разных метода приведения оценок к старорежимной системе:
//плохо
//неудовлетворительно
//удовлетворительно
//хорошо
//отлично
//Один метод должен принимать цифровую оценку от 1 до 5 и возвращать соответствующую строку из вышеприведенного списка.
// Второй — принимать “американскую” оценку в виде символа F, C, B, A.
//Один метод должен использовать switch statement, другой — switch expression.

    int numGrade;
    char americanGrade;
    static String oldGrade;

    // Switch Statement
    public static String getOldGrade(int numGrade) {
        switch (numGrade) {
            case 1:
                oldGrade = "плохо";
                break;
            case 2:
                oldGrade = "неудовлетворительно";
                break;
            case 3:
                oldGrade = "удовлетворительно";
                break;
            case 4:
                oldGrade = "хорошо";
                break;
            case 5:
                oldGrade = "отлично";
                break;
            default:
                oldGrade = "Invalid grade";
        }
        System.out.println(oldGrade);
        return oldGrade;
    }

    // Switch Expression
    public static String getOldGrade(char americanGrade) {
        oldGrade = switch (americanGrade) {
            case 'F' -> "неудовлетворительно";
            case 'C' -> "удовлетворительно";
            case 'B' -> "хорошо";
            case 'A' -> "отлично";
            default -> "Invalid grade";
        };
        System.out.println(oldGrade);
        return oldGrade;
    }

    public static void main(String[] args) {

        getOldGrade(5);

    }

}
