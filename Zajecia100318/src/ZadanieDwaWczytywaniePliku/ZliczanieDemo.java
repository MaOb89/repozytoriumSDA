package ZadanieDwaWczytywaniePliku;

import java.io.FileNotFoundException;

public class ZliczanieDemo {
    public static void main(String[] args) {
        OdczytKsiazki ok = new OdczytKsiazki("./plik.txt");

        try{
            ok.czytaj();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
