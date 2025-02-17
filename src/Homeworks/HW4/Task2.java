package Homeworks.HW4;

public class Task2 {
    public static void main(String[] args) {
//        Задача №2
//Необходимо вывести все положительные степени числа 5 до тех пор,
// пока результат возведения в степень меньше 100000, вывести результат возведения в степень.

        int base = 5;

        for (int result = 1, power = 0; result < 100000; result *= base) {

            System.out.println(base + " ^ " + power + " = " + result);
            power++;
        }

    }
}
