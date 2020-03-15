package encryption;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Initializing a scanner
        String text = s.nextLine(); // Reading a text from user
        s.close(); // closing the scanner


        String result = encrypted(text); // Initializing a variable that stores the encrypted text;

        System.out.println(result);

        String result_decrypted = decrypted(text); // Initializing a variable that stores the decrypted text;

        System.out.println(result_decrypted);
    }

    public static String encrypted(String text) {

        char[][] encryption = { // creating a two-dimensional character array that stores how is every letter or a symbol is encrypted.
                {
                        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                        'w', 'x', 'y', 'z', 'ä', 'ö', 'ü', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '#', '.', ',', '!', '?',
                },
                {
                        '?', '!', ',', '.', '#', '9', '8', '7', '6', '5', '4', '3', '2', '1', '0', 'ü', 'ö', 'ä', 'z', 'y', 'x', 'w',
                        'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',
                },
        };


        char[] translation = text.toCharArray(); // Initializing a simple array of characters that stores the encrypted ("translated") text

        for (int k = 0; k < text.length(); k++) { // creating a loop that checks every character of the text given by user
            for (int j = 0; j < encryption[0].length; j++) {  // a second loop is going to check each character of the user text to find a match it to the characters of the first dimension of the encryption array
                if (text.charAt(k) == encryption[0][j]) { // if the chosen character has a match in the first dimension
                    translation[k] = encryption[1][j]; // the new value from the second dimension is assigned to it. The value of the second dimension has the same position that the first dimension character.
                }
            }
        }
        String temp = new String(translation); // Initializing a string that stores all the characters from the translation array. That prevents any mistakes passing a value of an array of characters.

        return temp;
    }

    public static String decrypted(String text) {

        char[][] encryption = { // creating a two-dimensional character array that stores how is every letter or a symbol is encrypted.
                {
                        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
                        'w', 'x', 'y', 'z', 'ä', 'ö', 'ü', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '#', '.', ',', '!', '?',
                },
                {
                        '?', '!', ',', '.', '#', '9', '8', '7', '6', '5', '4', '3', '2', '1', '0', 'ü', 'ö', 'ä', 'z', 'y', 'x', 'w',
                        'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a',
                },
        };


        char[] translation = text.toCharArray(); // Initializing a simple array of characters that stores the decrypted ("translated") text

        for (int k = 0; k < text.length(); k++) { // creating a loop that checks every character of the text given by user
            for (int j = 0; j < encryption[0].length; j++) {  // a second loop is going to check each character of the user text to find a match it to the characters of the first dimension of the encryption array
                if (text.charAt(k) == encryption[1][j]) { // if the chosen character has a match in the first dimension
                    translation[k] = encryption[0][j]; // the new value from the second dimension is assigned to it. The value of the second dimension has the same position that the first dimension character.
                }
            }
        }
        String temp = new String(translation); // Initializing a string that stores all the characters from the translation array. That prevents any mistakes passing a value of an array of characters.

        return temp;
    }
}
