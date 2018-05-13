package Refleksja;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefleksjaDemo {
    public static void main(String[] args) {
        try {
            Class<?> definicjaPies = Class.forName("Refleksja.Pies");
// nowa instancja klasy
            Pies refleksyjnyBurek = (Pies) definicjaPies.newInstance();
//    tablice typów wejsciowych do metdoy setImie
            Class[] argumentyTypyWejsciowe = {String.class};
//            Zapisujemy
            Method metodaSetImieWZmiennej = definicjaPies.getDeclaredMethod("setImie", argumentyTypyWejsciowe);

// Przygotowanie argumentów wejściowych
            Object [] argumentyWejsciowe={"Burek"};
//            uruchomienie
            metodaSetImieWZmiennej.invoke(refleksyjnyBurek, argumentyWejsciowe);

//           System.out.println(refleksyjnyBurek.getImie());

//            dobranie sie do metody statycznej
            Method metodaStatycznaSzczekaj = definicjaPies.getMethod("Szczekaj");
            metodaStatycznaSzczekaj.invoke(null);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
