package Homeworks.HW7_3;

public class Task2_4 {
//    https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
//    Given an array of integers your solution should find the smallest integer.
//For example:
//Given [34, 15, 88, 2] your solution will return 2
//Given [34, -345, -1, 100] your solution will return -345
//You can assume, for the purpose of this kata, that the supplied array will not be empty.

    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < args.length; i++){
            if(args[i] < min){
                min = args[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int[] array = {34, 15, 88, 2};
        System.out.println(findSmallestInt(array));
    }
}
