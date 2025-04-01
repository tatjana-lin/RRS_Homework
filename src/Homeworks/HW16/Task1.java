package Homeworks.HW16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task1 {
//    Задача №1
//Создать лист и добавить в него следующие слова:
//White.
//Tan.
//Yellow.
//Orange.
//Red.
//Pink.
//Purple.
//Blue.
//Затем удалить из этого списка все цвета в которых встречается буква “L”

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(List.of("White", "Tan", "Yellow", "Orange", "Red", "Pink", "Purple", "Blue"));
        System.out.println(colors);

        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().toLowerCase().contains("l")) {
                iterator.remove();
            }
        }
        System.out.println(colors);
    }
}
