package Homeworks.HW11_2;

public class AlphabetPosition {
// When provided with a letter, return its position in the alphabet.
//Input :: "a"
//Output :: "Position of alphabet: 1"
//Note: Only lowercased English letters are tested

// Вариант 1 - через номер ASCII
// 'a' в ASCII = 97, 'b' = 98
//    public static String position(char alphabet) {
//        int position = alphabet - 'a' + 1; // Вычисляем позицию буквы в алфавите
//        return "Position of alphabet: " + position;
//    }

    // Вариант 2 - через indexOf()
    public static String position(char alphabet) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        return "Position of alphabet: " + (letters.indexOf(alphabet) + 1);
    }

    public static void main(String[] args) {
        System.out.println(position('b'));
    }

}
