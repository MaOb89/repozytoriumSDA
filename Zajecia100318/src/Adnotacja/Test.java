package Adnotacja;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        Class klasaTestowa=Test.class;
        Method metodaZAdnotacja = klasaTestowa.getDeclaredMethod("annotationTest");
       FirstAnnotation adnotacja = metodaZAdnotacja.getAnnotation(FirstAnnotation.class);
        System.out.println();
    }

    @FirstAnnotation(id="1", wiek=12)
    public void annotationTest() {

    }
}
