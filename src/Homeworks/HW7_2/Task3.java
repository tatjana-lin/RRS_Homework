package Homeworks.HW7_2;

public class Task3 {
    public static void main(String[] args) {
//        Задача №3
//
// 9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
//   8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
//     7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
//       6 5 4 3 2 1 0 1 2 3 4 5 6
//         5 4 3 2 1 0 1 2 3 4 5
//           4 3 2 1 0 1 2 3 4
//             3 2 1 0 1 2 3
//               2 1 0 1 2
//                 1 0 1
//                   0

//        решил ChatGPT

        int n = 9; // Максимальное число в первой строке

        for (int i = 0; i <= n; i++) {
            // Вывод пробелов в начале строки
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // Вывод убывающей последовательности
            for (int j = n - i; j >= 0; j--) {
                System.out.print(j + " ");
            }

            // Вывод возрастающей последовательности
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }

            System.out.println(); // Переход на новую строку
        }

    }
}
