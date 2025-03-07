package Homeworks.HW11_3;

public class BasicOperations {
// Your task is to create a function that does four basic mathematical operations.
//The function should take three arguments - operation(string/char), value1(number), value2(number).
//The function should return result of numbers after applying the chosen operation.
//
//Examples(Operator, value1, value2) --> output
//('+', 4, 7) --> 11
//('-', 15, 18) --> -3
//('*', 5, 5) --> 25
//('/', 49, 7) --> 7

    public static Integer basicMath(String op, int v1, int v2) {

        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v2 != 0 ? v1 / v2 : null; // Защита от деления на 0
            default -> throw new IllegalArgumentException("Invalid operator");
        };

    }

    public static void main(String[] args) {

        System.out.println(basicMath("+", 1, 2));
    }

}
