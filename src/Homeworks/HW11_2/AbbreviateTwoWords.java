package Homeworks.HW11_2;

public class AbbreviateTwoWords {
    // Write a function to convert a name into initials.
// This kata strictly takes two words with one space in between them.
//The output should be two capital letters with a dot separating them.
//It should look like this:
//Sam Harris => S.H
//patrick feeney => P.F

    public static String abbrevName(String name) {
        char a1 = name.charAt(0);
        int indexOfSpace = name.indexOf(" ");
        char a2 = name.charAt(indexOfSpace + 1);

        return (a1 + "." + a2).toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("john Doe"));
    }
}
