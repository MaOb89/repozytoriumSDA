package Adapter.KaczoIndyk;

public class Demo {
    public static void main(String[] args) {
        Indyk indyk = new DzikiIndyk();
        Kaczka udawanakaczka = new IndykAdapter(indyk);
        udawanakaczka.kwacz();
    }
}
