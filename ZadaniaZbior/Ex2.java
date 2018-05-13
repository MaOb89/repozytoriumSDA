package ZadaniaZbior;

public class Ex2 {
    public static void main(String[] args) {
        String slowo = "Jak sie ciesze";
        char[] array = slowo.toCharArray();

        for (int i = 0; i < slowo.length(); i++) {
            if (i % 2 == 0) {
                array[i] = Character.toUpperCase(array[i]);
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
