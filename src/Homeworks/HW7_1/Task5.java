package Homeworks.HW7_1;

public class Task5 {
    public static void main(String[] args) {
//        Задача №5
//
//Дан массив:
//int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//необходимо вывести сумму элементов массива.

        int sum = 0;
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                sum += array[i][j];
            }
        }
        System.out.println(sum);
    }
}
