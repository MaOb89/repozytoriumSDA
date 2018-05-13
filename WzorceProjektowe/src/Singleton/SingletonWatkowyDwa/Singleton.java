package Singleton.SingletonWatkowyDwa;

public class Singleton {
    private static Singleton unikalnaInstancja = new Singleton();
    private Singleton(){
    }
    public static Singleton pobierzInstancje(){
        return unikalnaInstancja;
    }

}
