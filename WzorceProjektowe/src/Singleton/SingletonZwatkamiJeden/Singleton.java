package Singleton.SingletonZwatkamiJeden;

public class Singleton {
    private static Singleton unikalnaInstancja;

    private Singleton() {
    }

    public static synchronized Singleton pobierzInstancje() {
        if (unikalnaInstancja == null)
            unikalnaInstancja = new Singleton();
        return unikalnaInstancja;
    }
}
