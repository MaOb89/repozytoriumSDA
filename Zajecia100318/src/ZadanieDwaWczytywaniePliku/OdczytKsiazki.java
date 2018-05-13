package ZadanieDwaWczytywaniePliku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

public class OdczytKsiazki {
    TreeMap<String, Integer> slowa = new TreeMap<>();
    File ksiazka;

    public OdczytKsiazki(String path) {
        ksiazka = new File(path);
    }

    public void czytaj() throws FileNotFoundException {
        Scanner sc = new Scanner(ksiazka);

        while (sc.hasNext()) {
            String linijka = sc.nextLine().toLowerCase();
            linijka = linijka.replace(".", "").replace(":","").replace(",","")
            .replace("!","").replace(" ","");
            for (int i = 0; i < linijka.length(); i++) {
                String znak = linijka.substring(i, i + 1);
                if (!slowa.containsKey(znak)) {
                    slowa.put(znak, 0);
                }
                slowa.put(znak, slowa.get(znak)+1);
            }
        }
        for (String s : slowa.keySet()) {
            System.out.println(s+": "+slowa.get(s));
        }


    }
}
