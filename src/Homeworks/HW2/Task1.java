package Homeworks.HW2;

public class Task1 {
/*
Задача №1
Необходимо создать целочисленные переменные a и b,
присвоить произвольные значения переменным на ваш выбор
и вывести результаты следующих операций с этими переменными:
сложение, умножение, вычитание, деление и остаток от деления.
Также сделать проверку на четность этих переменных и вывести результат.
*/

 public static void main(String[] args){

     int a;
     int b;

     a = 15;
     b = 8;

     System.out.println("a + b = " + (a + b));
     System.out.println("a * b = " + (a * b));
     System.out.println("a - b = " + (a - b));
     System.out.println("a / b = " + (a / b));
     System.out.println("a % b = " + (a % b));
     System.out.println("Really, a / b = " + (a * 1.0 / b));

     System.out.println("a is even - " + (a % 2 == 0));
     System.out.println("b is even - " + (b % 2 == 0));


 }

}
