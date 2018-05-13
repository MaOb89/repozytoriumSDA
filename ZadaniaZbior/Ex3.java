package ZadaniaZbior;

public class Ex3 {
    public static void main(String[] args) {
        String slowo = "Jak sie ciesze";
        char[] array = slowo.toCharArray();
        boolean isUpper = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != ' ') {
                if (isUpper) {
                    System.out.print(Character.toUpperCase(array[i]));
                    isUpper = false;
                } else {
                    System.out.print(array[i]);
                }
            }
            else{
                isUpper = true;
            }
        }
    }
}
