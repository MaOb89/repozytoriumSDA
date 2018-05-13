package Singleton;

public class Singleton {
    private static Singleton unikalnaInstancja;

    private Singleton() {
    }

    //    logika
    public static Singleton pobierzInstancje() {
        if(unikalnaInstancja==null)
            unikalnaInstancja=new Singleton();
        return unikalnaInstancja;
    }
    public void wyswietlKomunikat(){
        System.out.println("Komunikat z singletona");
    }

}
