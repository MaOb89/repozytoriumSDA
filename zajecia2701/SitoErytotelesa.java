package zajecia2701;

public class SitoErytotelesa {
    public static void main(String[] args) {

        boolean[] array = new boolean[101];
        for (int i = 0; i <array.length ; i++) {
            array[i]=true;
        }
        array[2]=true;
        for (int i = 2; i <array.length ; i++) {
            if (array[i])
                for (int j = i + i; j < array.length; j += i) {
                    array[j] = false;
                }
            }
        for (int i = 0; i <array.length ; i++) {
            if (array[i])
            System.out.printf("%d ", i);
        }
        }
            }

