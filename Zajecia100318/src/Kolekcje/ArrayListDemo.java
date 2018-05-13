package Kolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        int[] tab1 = new int[10];
        for (int i = 0; i < tab1.length; i++) {
            tab1[i] = i;
        }
        Integer[] tab2 = new Integer[10];
        for (int i = 0; i < tab2.length; i++) {
            tab2[i] = i;
        }
        List ArrayList1 = Arrays.asList(tab1);
//tablica prymitywow - jeden element
        List ArrayList2 = Arrays.asList(tab2);
//        miejsce a stercie - pokazuje gddzie sa wskazniki dlatego 10

        //Zadanie 2
        ArrayList copy = new ArrayList(ArrayList2);

//        Zadanie 3
       Collections.reverse(copy);

//       Zadanie 4
        ArrayList2.addAll(copy);

        System.out.println();

    }
}
