package Refleksja.Zadania;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

public class DocumentRefleksja {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException {
//  ZADANIE 1
        Class BookDefinition = Book.class;
        Constructor bookConstructor = BookDefinition.getConstructor(String.class, Date.class);

        Object bookObject = (Book) bookConstructor.newInstance("Przemineło z wiatrem ", new Date());

//        Wypisanie pol for-each
        Field [] bookFields = BookDefinition.getFields();
        for (Field field :bookFields) {
            System.out.println(field.getName());
        }

        Field title = BookDefinition.getDeclaredField("title");
        title.setAccessible(true);
        title.set(bookObject, "Jednak nie to");

        Method getTitle = BookDefinition.getDeclaredMethod("getTitle");
        String returnValue = (String) getTitle.invoke(bookObject);
        System.out.println(returnValue);

//        ZADANIE 2
        Class emailDefinition = EMail.class;
        Constructor emailConstructor = emailDefinition.getConstructor(String[].class, String.class, Date.class);
        EMail emailObject = (EMail) emailConstructor.newInstance(new String[] {"A","B"}, "Test", new Date());

        Method addAuthor = emailDefinition.getMethod("AddAuthor", String.class);
        addAuthor.invoke(emailObject, "AAAAAAAAA");
        addAuthor.invoke(emailObject, "BBBBBBBBB");
        addAuthor.invoke(emailObject, "CCCCCCCCC");

        Method getAuthors = emailDefinition.getMethod("getAuthors");
        String [] authors = (String[]) getAuthors.invoke(emailObject);

        for (String s :authors) {
            System.out.println(s);
        }
        Class superClass = emailDefinition.getSuperclass();
        String[]doPodmiany ={"1","2","3","4","5","6","7","8","9","10"};
        Field autorzy = superClass.getDeclaredField("authors");
        autorzy.setAccessible(true);
        autorzy.set(emailObject, doPodmiany);
        authors =(String[]) getAuthors.invoke(emailObject);
        for (String s :authors) {
            System.out.println(s);

        }


    }
}
