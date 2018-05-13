package zajecia2701;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("podaj ilosć liczb");
        int n = 0;
        try {
            n = sc.nextInt();
        } catch (Exception ex) {
            System.out.println("podales bledne dane");
        }
        int suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("podaj liczbę");
            int a = sc.nextInt();
            suma += a;
            System.out.println(suma);
        }
    }
}
