package zajecia2701.Sortowania;

import java.util.Scanner;

public class OdlegloscOdSrodka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] input = new int[n][3];
        double[][] sort = new double[n][2];

        for (int i = 0; i < n; i++) {
            String inputUzytkowania = sc.nextLine();
            String[] inputSplitted = inputUzytkowania.split(" ");
            input[i][0] = Integer.parseInt(inputSplitted[0]); //tu jest nazwa
            input[i][1] = Integer.parseInt(inputSplitted[1]); //x
            input[i][2] = Integer.parseInt(inputSplitted[2]); //y

            sort[i][0] = input[i][0]; //nazwa
            sort[i][1] = policzOdlegosc(input[i][1], input[i][2]); //odleglosc
        }
        for (int i = 0; i < sort[0].length; i++) {
            for (int j = 0; j < sort[0].length - 1; j++) {
                if (sort[j][1] > sort[j + 1][1]) {
                    //SWAP
                    double temp = sort[j][0];
                    sort[j + 1][0] = sort[j][0];
                    sort[j][0] = temp;
                    //pierwsza czesc

                    temp = sort[j][1];
                    sort[j + 1][1] = sort[j][1];
                    sort[j][1] = temp;
                    //druga czesc
                }
            }
        }
        for (int i = 0; i < input[0].length; i++) {
            int nazwa = (int)sort[i][0];
            for (int j = 0; j <input[0].length; j++) {
                if (nazwa==input[j][0]) {
                    System.out.printf("%d %d %d\n", input[j][0], input[j][1], input[j][2]);
                    break;
                }
            }
        }
    }

    public static double policzOdlegosc(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
