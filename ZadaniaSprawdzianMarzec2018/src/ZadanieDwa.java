import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ZadanieDwa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> lista = new ArrayList<Double>();

        for (int i = 1; i <11 ; i++) {
            System.out.println("podaj liczbę " + i);
            double liczby =sc.nextInt();
            lista.add(liczby);
        }
        System.out.println(lista);
        double max = Collections.max(lista);
        System.out.println("wartość maksymalna: "+max);
        double min = Collections.min(lista);
        System.out.println("wartość minimalna: " + min);
        double average = 0;
        double sum = 0;

        for (int i = 0; i <lista.size(); i++) {
            sum = lista.get(i);
        }
        average = sum/lista.size();
        System.out.println(average);
        System.out.println(average);

    }
}
