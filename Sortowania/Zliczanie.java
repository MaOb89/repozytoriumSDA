package Sortowania;

public class Zliczanie {

    public static void main(String[] args) {

        int[] SortPrzezZliczanie = {10,1,9,2,8,3,7,4,5};

        int max = -1;
        for (int i = 0; i < SortPrzezZliczanie.length; i++) {
            if(max < SortPrzezZliczanie[i])
                max = SortPrzezZliczanie[i];
        }
        int[] countingTable = new int[max+1];
        for (int i = 0; i < SortPrzezZliczanie.length; i++)
            countingTable[SortPrzezZliczanie[i]]++;

        for (int i = 0; i < countingTable.length; i++) {
            while (countingTable[i] > 0) {
                System.out.print(i + " ");
                countingTable[i]--;
            }
        }
    }
}
