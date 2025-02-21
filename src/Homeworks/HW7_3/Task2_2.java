package Homeworks.HW7_3;

public class Task2_2 {
    //        https://www.codewars.com/kata/555086d53eac039a2a000083/train/java
// Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each.
// If one of the flowers has an even number of petals
// and the other has an odd number of petals
// it means they are in love.
// Write a function that
// will take the number of petals of each flower
// and return true if they are in love
// and false if they aren't.

    public static boolean isLove(final int flower1, final int flower2) {
        boolean result = false;
        if(flower1 % 2 == 0 && flower2 % 2 != 0){
            result = true;
        } else if (flower1 % 2 != 0 && flower2 % 2 == 0) {
            result = true;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(isLove(199,212));

    }
}
