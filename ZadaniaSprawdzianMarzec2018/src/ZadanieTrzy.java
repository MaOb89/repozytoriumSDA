import java.util.Random;
import java.util.Scanner;

public class ZadanieTrzy {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("podaj ile liczb wylosować");
        int iloscLiczb = sc.nextInt();
        int liczby = 0;

        for (int i = 0; i < iloscLiczb; i++) {
            liczby = rand.nextInt(46) - 26;
            System.out.println(liczby);
            }
        }

    }

