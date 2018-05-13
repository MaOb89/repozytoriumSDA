package Adapter.KaczoIndyk;

public class DzikaKaczka implements Kaczka {

    @Override
    public void kwacz() {
        System.out.println("Kwa kwa");
    }
    @Override
    public void lec() {
        System.out.println("Fru fru");
    }
}

