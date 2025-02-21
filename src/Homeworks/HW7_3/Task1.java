package Homeworks.HW7_3;

public class Task1 {

    public static int getSum(int a, int b){
        return a + b;
    }

    public static int getDifference(int a, int b){
        return a - b;
    }

    public static int getProduct(int a, int b){
        return a * b;
    }

    public static double getQuotient(int a, int b){
        return a * 1.0 / b;
    }

    public static void main(String[] args) {

//                Задача №1
//
//Необходимо написать 4 метода:
//сложение 2х чисел
//вычитание 2х чисел
//умножение 2х чисел
//деление 2х чисел

        System.out.println(getSum(10, 20));
        System.out.println(getDifference(10, 20));
        System.out.println(getProduct(10, 20));
        System.out.println(getQuotient(10, 20));

    }
}
