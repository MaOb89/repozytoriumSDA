package Kolekcje;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, String > hashMap = new HashMap<>();
        hashMap.put(null, "Test");
        hashMap.put("Test", null);
        hashMap.put(null, null);
    //TreeMap - nie działa, nie można klucza null
//        TreeMap<String, String> treeMap = new TreeMap<>();
//        treeMap.put(null, "Test");
//        treeMap.put("Test", null);
//        treeMap.put(null, null);

        //HashTable - nie można klucza lub wartości
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put(null, "Test");
        hashtable.put("Test", null);
        hashtable.put(null, null);

    }
}
