package Homeworks.HW11_3;

import java.util.Arrays;

public class Sequence {
// Build a function that returns an array of integers from n to 1 where n > 0.
//Example : n=5 --> [5,4,3,2,1]

public static int[] reverse(int n){
    int[] array = new int[n];
    for (int i = 0; i < n; i++){
        array[i] = n - i;
    }
    return array;
}

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }

}
