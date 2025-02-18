package Homeworks.HW6;

public class Task3 {
    public static void main(String[] args) {
//        Задача №3
//
//Дана строка:
//String s = “Посмотрите как Рите нравится ритм”;
//необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//Для указанной строки ответ будет 6, 15, 29.

        String s = "Посмотрите как Рите нравится ритм";
        for (int i = 0; i < s.length(); i++){
            if(s.substring(i).toLowerCase().startsWith("рит")){
                System.out.println(i);
            }
        }
    }

}
