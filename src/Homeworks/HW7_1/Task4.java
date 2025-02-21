package Homeworks.HW7_1;

public class Task4 {
    public static void main(String[] args) {
//        Задача №4
//
//Дан массив:
//int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//необходимо вывести среднее арифметическое всех значений массива.

        int sum = 0;
        int i = 0;

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum * 1.0 / i);
    }
}
