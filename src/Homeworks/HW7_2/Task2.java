package Homeworks.HW7_2;

public class Task2 {
    public static void main(String[] args) {
//        Задача №2
//
//0  1  2  3  4  5  6  7  8  9
//   0  1  2  3  4  5  6  7  8
//      0  1  2  3  4  5  6  7
//         0  1  2  3  4  5  6
//            0  1  2  3  4  5
//               0  1  2  3  4
//                  0  1  2  3
//                     0  1  2
//                        0  1
//                           0

//             Вариант 1

//        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//
//        for (int i = 0; i < array.length; i++) {
//            String spaces = "  ".repeat(i + 1);
//            for (int j = 0; j < array.length - i; j++) {
//                System.out.print(array[j] + " ");
//            }
//            System.out.println();
//            System.out.print(spaces);
//        }

//        Вариант 2

        int n = 9; // вводим переменную с максимальным числом

        // 1. внешний цикл обозначит количество строк 10 (от 0 до n включительно)
        // 2. цикл с числом пробелов, равным i
        // 3. цикл с возрастающей последовательностью чисел от 0 до n - i включительно.

        for(int i = 0; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }
            for(int j = 0; j <= n - i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
