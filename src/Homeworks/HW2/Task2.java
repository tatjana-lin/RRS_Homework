package Homeworks.HW2;

public class Task2 {

    public static void main(String[] args) {

        /*
        Задача №2
Необходимо создать целочисленные переменные a и b,
присвоить им произвольные значения,
а потом поменять значения местами (значение переменной a должно оказаться в переменной b и наоборот).
         */

        int a;
        int b;

        a = 10;
        b = 20;

        int temp;

        temp = a;

        a = b;
        System.out.println("a = " + a);

        b = temp;
        System.out.println("b = " + b);


    }

}
