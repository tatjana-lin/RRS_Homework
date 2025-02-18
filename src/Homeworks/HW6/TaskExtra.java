package Homeworks.HW6;

public class TaskExtra {
    public static void main(String[] args) {

//        Экстра задача
//
//Дан массив:
//String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

        String[][] array = {{"Привет", "всем", "кто" }, {"изучает", "язык", "программирования" }, {"java" }};

        for (int i = 0; i < array.length; i++) {
            int result = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")) {
                    result += 1;
                }
            }
            System.out.println("В массиве array [" + i + "] " + result + " строк, которые не содержат буквы “е”");
        }
    }
}
