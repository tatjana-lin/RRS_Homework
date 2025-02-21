package Homeworks.HW7_3;

public class Task2_5 {
//    https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
//    If you can't sleep, just count sheep!!//
//Task:
//Given a non-negative integer, 3 for example,
// return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
// Input will always be valid, i.e. no negative integers.

    public static String countingSheep(int num) {
        String murmur = "";

        for(int i = 1; i <= num; i++){
            murmur += i + " sheep...";
        }
        return murmur;
    }

    public static void main(String[] args) {

        System.out.println(countingSheep(5));
    }
}
