package Homeworks.HW6;

public class Task2 {
    public static void main(String[] args) {
//        Задача №2
//
//Дана строка:
//String s = “Перевыборы выбранного президента”;
//необходимо подсчитать количество букв “е” в строке.
//Для указанной строки ответ будет 4.

        String s = "Перевыборы выбранного президента";
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                result += 1;
            }
        }

        System.out.println(result);
    }
}
