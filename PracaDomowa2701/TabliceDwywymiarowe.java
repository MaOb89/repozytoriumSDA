package PracaDomowa2701;

import java.util.Scanner;

public class TabliceDwywymiarowe {
    public static void main(String[] args) {
        System.out.println("podaj kolor pierwszego pola: biały lub czarny");
        Scanner sc = new Scanner(System.in);
        String kolor = sc.nextLine();
            char tablica[][] = {{'C', 'B', 'C', 'B', 'C', 'B', 'C', 'B'},
                    {'B', 'C', 'B', 'C', 'B', 'C', 'B', 'C'},
                    {'C', 'B', 'C', 'B', 'C', 'B', 'C', 'B'},
                    {'B', 'C', 'B', 'C', 'B', 'C', 'B', 'C'},
                    {'C', 'B', 'C', 'B', 'C', 'B', 'C', 'B'},
                    {'B', 'C', 'B', 'C', 'B', 'C', 'B', 'C'},
                    {'C', 'B', 'C', 'B', 'C', 'B', 'C', 'B'},
                    {'B', 'C', 'B', 'C', 'B', 'C', 'B', 'C'}};

            char tablica1[][] = {{'B', 'C', 'B', 'C', 'B', 'C', 'B', 'C'},
                    {'C', 'B', 'C', 'B', 'C', 'B', 'C', 'B'},
                    {'B', 'C', 'B', 'C', 'B', 'C', 'B', 'C'},
                    {'C', 'B', 'C', 'B', 'C', 'B', 'C', 'B'},
                    {'B', 'C', 'B', 'C', 'B', 'C', 'B', 'C'},
                    {'C', 'B', 'C', 'B', 'C', 'B', 'C', 'B'},
                    {'B', 'C', 'B', 'C', 'B', 'C', 'B', 'C'},
                    {'C', 'B', 'C', 'B', 'C', 'B', 'C', 'B'}};

            if (kolor == "czarny") {
                for (int i = 0; i < tablica.length; i++) {
                    for (int j = 0; j < tablica[i].length; j++) {
                        System.out.print(tablica[i][j]);
                    }
                    System.out.println(" ");
                }
            }
            if (kolor == "biały"){
                for (int i = 0; i < tablica1.length; i++) {
                    for (int j = 0; j < tablica1[i].length; j++) {
                        System.out.print(tablica1[i][j]);
                    }
                    System.out.println(" ");
                }
            }
        }
    }