package ZadanieDwaWczytywaniePliku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WczytywanieZpliku {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("plik.txt");
        Scanner in = new Scanner(file);
    }
}
