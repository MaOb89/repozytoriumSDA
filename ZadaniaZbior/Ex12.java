package ZadaniaZbior;

public class Ex12 {
    public static void main(String[] args) {
        char[] nrPESEL = "000000000".toCharArray();
        char[] letters = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int[] wagi = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};

        int suma = 0;
        for (int i = 0; i < nrPESEL.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                if (nrPESEL[i] == letters[j]) {
                    suma += j * wagi[i];
                }
            }
        }
        System.out.println("suma = "+suma);
        if (suma%10==0){
            System.out.println("PESEL jest prawidlowy");
        }
        else {
            System.out.println("PESEL jest błędny");
        }
    }
}
