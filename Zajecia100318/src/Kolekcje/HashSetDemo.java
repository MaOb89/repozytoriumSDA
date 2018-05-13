package Kolekcje;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<String>();
        hset.add("Nowak");
        hset.add("Kowalski");
        hset.add("Wiśniewski");
        hset.add("Wójcik");
        hset.add("Kowalczyk");


        HashSet<String> hset2 = new HashSet<String>();
        hset2.add("Przybylski");
        hset2.add("Kowalski");
        hset2.add("Markiewicz");
        hset2.add("Wójcik");
        hset2.add("Kowalczyk");

        hset.retainAll(hset2);
        System.out.println(hset);
    }
}
