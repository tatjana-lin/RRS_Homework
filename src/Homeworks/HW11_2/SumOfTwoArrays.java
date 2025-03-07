package Homeworks.HW11_2;

public class SumOfTwoArrays {
// I'm new to coding and now I want to get the sum of two arrays...
// Actually the sum of all their elements. I'll appreciate for your help.
//P.S. Each array includes only integer numbers. Output is a number too.

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int a : arr1) {
            sum += a;
        }
        for (int a : arr2) {
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(arrayPlusArray(new int[] {1, 2, 3}, new int[] {1, 2, 3}));
    }

}
