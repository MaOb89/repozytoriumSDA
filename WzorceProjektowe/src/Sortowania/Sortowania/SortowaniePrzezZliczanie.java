package Sortowania.Sortowania;

import Sortowania.Sortowania.SortowanieInterfejs;

public class SortowaniePrzezZliczanie implements SortowanieInterfejs {
    @Override
    public int[] sort(int[] toSort) {

        int max = -1;
        for (int i = 0; i < toSort.length; i++) {
            if (max < toSort[i])
                max = toSort[i];
        }
        int[] countingTable = new int[max + 1];
        // zliczanie
        for (int i = 0; i < toSort.length; i++)
            countingTable[toSort[i]]++;

        int counter = 0;
        int[] sorted = new int[toSort.length];
        for (int i = 0; i < countingTable.length; i++) {
            while (countingTable[i] > 0) {
             sorted[counter]=i;
                countingTable[i]--;
                counter++;
            }
        }
        return sorted;
    }
}