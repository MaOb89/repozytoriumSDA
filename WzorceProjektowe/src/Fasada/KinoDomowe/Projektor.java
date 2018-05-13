package Fasada.KinoDomowe;

public class Projektor {
    boolean wlaczony;
    String zrodlo;

    public void wlacz() {
        wlaczony = true;
    }

    public void wylacz() {
        wlaczony = false;
    }

    public void ustawZrodlo(String zrodlo) {
        this.zrodlo = zrodlo;
    }
}
