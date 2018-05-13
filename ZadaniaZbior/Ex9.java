package ZadaniaZbior;

import sun.font.FontRunIterator;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String nrdowodu = sc.nextLine();
        char[] nrDowodu = "00000000".toCharArray();

        int sum = 0;

        char[] letters = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O',
                'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int[] wagi = {7, 3, 1, 9, 7, 3, 1, 7, 3};

        int suma = 0;
        for (int i = 0; i < nrDowodu.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                if (nrDowodu[i] == letters[j]) {
                    suma += j * wagi[i];
                }
            }
        }
        if (sum % 10 == 0) {
            System.out.println("w porządku");
        } else {
            System.out.println("blad");
        }
    }
}
