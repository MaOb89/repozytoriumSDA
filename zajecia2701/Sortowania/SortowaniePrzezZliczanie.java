package zajecia2701.Sortowania;

public class SortowaniePrzezZliczanie {
    public static void main(String[] args) {
        int[] toSort = {5, 5, 3, 8, 1, 2, 4, 4, 3};

//        max
        int max = -1;
        for (int i = 0; i < toSort.length; i++) {
            if (max < toSort[i])
                max = toSort[i];
        }
        int [] countingTable = new int [max+1];
//        zliczaneie
        for (int i = 0; i <toSort.length ; i++) {
            countingTable[toSort[i]]++;
        }
        for (int i = 0; i <countingTable.length; i++) {
            while (countingTable[i]>0){
                System.out.printf(i+" ");
                countingTable[i]--;
            }

        }
    }
}
