package Kolekcje;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
//        TreeSet treeSet = new TreeSet();
//        treeSet.add("element_1");
//        treeSet.add("element_3");
//        treeSet.add("element_2");
//        treeSet.add("element_4");
//        treeSet.add("element_5");
//
//        System.out.println("Highest value in TreeSet is : " + treeSet.last());

        TreeSet<Integer> zbiorint=new TreeSet<>();
        zbiorint.add(1);
        zbiorint.add(2);
        zbiorint.add(3);
        zbiorint.add(4);
        zbiorint.add(5);

        if (zbiorint.contains(new Integer(4))){
            System.out.println(4);
        }
        else {
            SortedSet<Integer> poddrzewo = zbiorint.tailSet(new Integer(4));
            System.out.println(poddrzewo.first());
        }
    }
}
