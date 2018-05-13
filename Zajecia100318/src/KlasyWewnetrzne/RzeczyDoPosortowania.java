package KlasyWewnetrzne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RzeczyDoPosortowania {
    public static void main(String[] args) {
        ArrayList<String> List = new ArrayList<>();
        List.add("Ania");
        List.add("Kasia");
        List.add("Martyna");
        List.add("Wojtek");
        List.add("Adam");
        System.out.println(List);

        Collections.sort(List, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();

            }
        });
        for (Object o : List) {
            System.out.println(o);
        }
    }
}
