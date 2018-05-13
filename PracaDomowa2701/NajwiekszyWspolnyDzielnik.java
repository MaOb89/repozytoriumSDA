package PracaDomowa2701;

public class NajwiekszyWspolnyDzielnik {
    public static void main(String[] args) {
        int n = 21;
        int k = 7;
        while (n != k){
            if (n > k)
                n -= k;
            else
                k -= n;
        }

        System.out.println("NWD "+n);
    }
}
