package Kolekcje;

import java.util.TreeSet;

public class SetsDemo {
    public static void main(String[] args) {
        TreeSet<String> zbior = new TreeSet<>();
        zbior.add("Nowak");
        zbior.add("Kowalski");
        zbior.add("Wiśniewski");
        zbior.add("Wójcik");
        zbior.add("Kowalczyk");

        for (String s :zbior) {
            System.out.println(s);
        }
    }
}
