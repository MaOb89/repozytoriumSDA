package ZadanieDwa;

public class NalewkaDemo {
    public static void main(String[] args) {
        Spirytus spir;
        spir = new Spirytus();
        Woda w1 = new Woda(spir);
        Woda w2 = new Woda(w1);
        Woda w3 = new Woda(w2);
        Woda w4 = new Woda(w3);
        Woda w5 = new Woda(w4);
        Woda w6 = new Woda(w5);
        Woda w7 = new Woda(w6);
        SokMalinowy ras = new SokMalinowy(w7);

        System.out.printf("%f", ras.receptura());
    }
}
