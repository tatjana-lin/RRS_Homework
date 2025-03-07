package Homeworks.HW11_3;

import java.util.Arrays;

public class Solution {
    //Write a function to split a string and convert it into an array of words.
//Examples (Input ==> Output):
//"Robin Singh" ==> ["Robin", "Singh"]
//
//"I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]

    public static String[] stringToArray(String s) {
        // учитывает любые отступы между словами, напр.двойной пробел или таб.
        // \\s — это специальное регулярное выражение (regex), которое обозначает пробельный символ
        return s.trim().split("\\s+");

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("Today is   Friday!")));
    }

}
