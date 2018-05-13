package Sortowania;

public class Babelkowe {
    public static void main(String[] args) {

    int sortBab[] = {10,1,9,2,8,3,7,4,5};

    for (int i = 0; i <sortBab.length ; i++) {
        for(int j=0;j<sortBab.length-1; j++)
        {
            if(sortBab[j]>sortBab[j+1])
            {
                int temp = sortBab[j];
                sortBab[j] = sortBab[j+1];
                sortBab[j+1] = temp;
            }
        }
    }
}
}


