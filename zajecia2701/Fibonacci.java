package zajecia2701;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci(8));

    }
    public static int Fibonacci (int n) {
        if (n == 0)
        return 0;
        if (n ==1)
            return 1;
        else {
            return  Fibonacci(n-1)+ Fibonacci(n-2);
        }
    }
}
