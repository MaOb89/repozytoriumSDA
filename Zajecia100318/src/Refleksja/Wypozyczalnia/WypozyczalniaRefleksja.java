package Refleksja.Wypozyczalnia;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WypozyczalniaRefleksja {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class rental = RentCar.class;
        System.out.println("pełna nazwa klasy: " + rental.getName());
        System.out.println("sama nazwa klasy: " + rental.getSimpleName());
        System.out.println("nazwa klasy canonical: " + rental.getCanonicalName());

        Package paczka = rental.getPackage();
        System.out.println("Nazwa paczki: " + paczka);


//       tworzenie obiektu z wykorzystaniem konstruktorów
//       1. pobieramy konstruktory
        Constructor[] constructors = rental.getConstructors();

//        Pobranie i zapisanie konkretnego konstruktora
        Constructor constructor = rental.getConstructor(Integer.TYPE);
//        Na podstawie kontruktora tworzymy obiekt
        RentCar rent = (RentCar) constructor.newInstance(123);
        System.out.println();

//        pobieranie metod - zwraca wszystkie metody, declared - tylko publiczne metody będące w klasie
        Method[] metody = rental.getMethods();
        for (Method methoda : metody) {
            System.out.println(methoda.getName());
        }
//        Pobieranie konkretnej metody po nazwie
        Method metoda = rental.getDeclaredMethod("computeRentalCost", int.class);
        System.out.println(metoda);

//        uruchomienie konkretnej metody
        metoda.invoke(rent, 45);//to samo co rent.computeRentalCost(45)

//        pobieranie typów wejściowych metody
        Class[] typyArgumentow = metoda.getParameterTypes();
//        pobieranie typów zwracanych
        Class zwracanyTyp = metoda.getReturnType();
        System.out.println(zwracanyTyp);

//        POLA
        Field[] pola = rental.getFields();
        for (Field field : pola) {
            System.out.println(field.getName());
            Object type = field.getType();
            System.out.println("Typ pola: " + type.toString());
            System.out.println("Wartość pola: " + field.get(rent));
        }
//        Pola prywatne
        Field prywatnePole = rental.getDeclaredField("type");
        prywatnePole.setAccessible(true);
        System.out.println(prywatnePole.get(rent));
        prywatnePole.set(rent, "Dupa");
        System.out.println(rent.getType());
    }
}
