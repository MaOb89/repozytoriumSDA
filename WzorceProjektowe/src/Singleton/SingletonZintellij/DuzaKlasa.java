package Singleton.SingletonZintellij;

public class DuzaKlasa {
    private static DuzaKlasa ourInstance = new DuzaKlasa();

    public static DuzaKlasa getInstance() {
        return ourInstance;
    }

    private DuzaKlasa() {
    }
}
