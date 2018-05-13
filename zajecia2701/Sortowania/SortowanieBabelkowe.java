package zajecia2701.Sortowania;

public class SortowanieBabelkowe {
    public static void main(String[] args) {
        int[] liczby = {5, 4, 3, 2, 1};

        for (int i = 0; i <liczby.length ; i++) {
            for (int j = 0; j <liczby.length-1 ; j++) {
                if (liczby[j]>liczby[j+1]){
                    int temp=liczby[j];
                    liczby[j]=liczby[j+1];
                    liczby[j+1]=temp;
                }
            }
        }




//        for (int i = 0; i <liczby.length ; i++) {
//            if (i < i+1)
//                posortowanieliczby[i]=i;
//            else
//                posortowanieliczby[i]++;
//        }
//        for (int i = 0; i <posortowanieliczby.length ; i++) {
//            System.out.println(posortowanieliczby[i]);
//        }
    }
}
