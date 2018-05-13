package ZadaniaZbior;

public class Ex5 {
    public static void main(String[] args) {
        String [] dnitygodnia = {"Pn", "Wt", "Sr", "Czw", "Pt", "Sob", "Ndz"};
        int dni = 1;
        String dzien = "Pn";
        int indeksdnia=0;

        int wynikDzielenia = dni%7;
//        wynik 5

        for (int i = 0; i <dnitygodnia.length ; i++) {
            if (dnitygodnia[i]==dzien){
                indeksdnia+=i;
            }
        }
        indeksdnia=indeksdnia+wynikDzielenia;

            System.out.println(dnitygodnia[indeksdnia]);
    }
}
