package zajecia2701;

import java.util.Scanner;

public class DeSzyfrCezara {
    public static void main(String[] args) {
        char[] letters = new char[]{'A', 'B', 'C', 'D', 'E', 'F',
                'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'W', 'X', 'Y', 'Z'};

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj slowo lub ciag liter do zdekodowania");
        char[] toDecode = sc.next().toUpperCase().toCharArray();
        System.out.println("podaj klucz do zdekodowania");
        int key = sc.nextInt();
        for (int i = 0; i < toDecode.length; i++) {
            int letter = 0;
            for (int j = 0; j < letters.length; j++) {
                if (letters[j] == toDecode[i]) {
                    letter = j;
                    break;
                }
            }
            System.out.println(letters[(letter - key) % 26]);
        }
    }
}
