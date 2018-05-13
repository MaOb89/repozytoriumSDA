package Projekty.OneHundredCounting;
import java.util.Random;
import java.util.Scanner;

public class OneHundredCounting {
    public static void main(String[] args) {
        int Game = 100;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        while (Game > 1) {
            System.out.println("podaj liczbę od 1 do 10");
//            try{
            int UserInput = sc.nextInt();

//            catch (Exception ex) {
//                sc.next();
//                continue;
//            }
////        try - catch (continue)
            Game -= UserInput;
            int KomputerChoice = rand.nextInt(10) + 1;
            System.out.println("wylosowana przez komputer liczba: " + KomputerChoice);
            if (Game - KomputerChoice > 1) {
                Game -= KomputerChoice;
                System.out.println("Pozostała liczba: " + Game);
            } else {
                System.out.println("zle");
            }
        }
    }
}
