package Homeworks.HW16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2and3 {
//    Задача №2
//Создать лист со значениями от 100 до 1000.

//    Задача №3
//    Удалить из листа, созданного в предыдущей задаче, все четные элементы.

//Экстра задача
//Попробуйте изменить тип итерационной переменной из цикла,
//в третьей задаче, на Integer (не int, а Integer) и добиться такого же результата как и с типом int.

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 100; i <= 1000; i++) {
            integers.add(i);
        }

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println(integers);
    }
}
