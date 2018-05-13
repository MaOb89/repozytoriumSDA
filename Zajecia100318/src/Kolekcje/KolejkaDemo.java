package Kolekcje;

import java.util.ArrayDeque;
import java.util.Queue;

public class KolejkaDemo {
    public static void main(String[] args) {
        String pierwszyKlient = "Marta";
        String drugiKlient = "Adam";
        String trzeciKlient = "Tomek";
        String czwartyKlient = "Krystyna";
        String piatyklient = "Wiesław";

        ArrayDeque<String> kolejka = new ArrayDeque<>();
        kolejka.add(pierwszyKlient);
        kolejka.add(drugiKlient);
        kolejka.add(trzeciKlient);
        kolejka.add(czwartyKlient);
        kolejka.add(piatyklient);

        for (int i = 0; i <5 ; i++) {
            System.out.println(kolejka.remove());
        }

        //top wordsy

    }
}
