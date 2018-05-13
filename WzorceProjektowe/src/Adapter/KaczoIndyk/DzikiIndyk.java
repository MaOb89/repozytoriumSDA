package Adapter.KaczoIndyk;

public class DzikiIndyk implements Indyk {
    @Override
    public void gulgorz() {
        System.out.println("Gul gul gul");
    }

    @Override
    public void lec() {
        System.out.println("Nie lecę bo mam za duży brzuszek");
    }
}
