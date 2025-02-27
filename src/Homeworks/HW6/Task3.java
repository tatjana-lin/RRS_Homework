package Homeworks.HW6;

public class Task3 {
    public static void main(String[] args) {
//        Задача №3
//
//Дана строка:
//String s = “Посмотрите как Рите нравится ритм”;
//необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//Для указанной строки ответ будет 6, 15, 29.

//        String s = "Посмотрите как Рите нравится ритм";
//        for (int i = 0; i < s.length(); i++){
//            if(s.substring(i).toLowerCase().startsWith("рит")){
//                System.out.println(i);
//            }
//        }

//        Вариант 2 (review)
//        String s = "Посмотрите как Рите нравится ритм";
//        s = s.toLowerCase();// выносим за пределы цикла, чтобы не повторять
//        for(int i = 0; i < s.length(); i++){
//            int index = s.indexOf("рит", i);
//            if(index > -1){
//                i = index;
//                System.out.println(index);
//            }else {
//                break;
//            }
//        }

        //        Вариант 3 (review)
        String s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase();
        int index = 0;
        do {
            index = s.indexOf("рит", index);
            if (index > -1) {
                System.out.println(index++);
            }
        } while (index != -1);


    }

}
