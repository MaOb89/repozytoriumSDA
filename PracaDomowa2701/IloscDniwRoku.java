package PracaDomowa2701;

import java.util.Scanner;

public class IloscDniwRoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d1, m1, r1;
        System.out.println("Podaj date (DD MM RRRR)");
        d1 = sc.nextInt();
        m1 = sc.nextInt();
        r1 = sc.nextInt();

//        w bardzo dużym uproszczeniu...
        if (d1 > 31) {
            System.out.println("nie ma takiego dnia");
        } else {

            int liczbaDni[] = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

            int dzienRoku = d1 + liczbaDni[m1 - 1];
            System.out.println(dzienRoku);
        }
    }
}
