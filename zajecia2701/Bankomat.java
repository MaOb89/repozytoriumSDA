import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        System.out.printf("podaj ilość zl");
        Scanner sc = new Scanner(System.in);
        int[] nominalzl = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] nominalZuzycie = new int[nominalzl.length];
        int kwotaZlote = sc.nextInt();

        int aktualnynominal = 0;
        while (kwotaZlote > 0) {
            if (kwotaZlote >= nominalzl[aktualnynominal]) {
                kwotaZlote -= nominalzl[aktualnynominal];
                nominalZuzycie[aktualnynominal]++;
            } else {
                aktualnynominal++;
            }
        }
        for (int i = 0; i < nominalzl.length; i++) {
            if (nominalZuzycie[i] > 0)
                System.out.printf("kwota: %d x %d\n", nominalzl[i], nominalZuzycie[i]);
        }


        System.out.printf("podaj ilość groszy");
        int[] nominalgr = {50, 20, 10, 5, 2, 1};
        int[] nominalZuzycieGrosze = new int[nominalgr.length];
        int kwotaGrosze = sc.nextInt();

        int aktualnynominalGrosze = 0;
        while (kwotaGrosze > 0) {
            if (kwotaGrosze >= nominalgr[aktualnynominalGrosze]) {
                kwotaGrosze -= nominalgr[aktualnynominalGrosze];
                nominalZuzycieGrosze[aktualnynominalGrosze]++;
            } else {
                aktualnynominalGrosze++;
            }
        }
        for (int i = 0; i < nominalgr.length; i++) {
            if (nominalZuzycieGrosze[i] > 0)
                System.out.printf("kwota grosze: %d x %d\n", nominalgr[i], nominalZuzycieGrosze[i]);
        }
    }
}
