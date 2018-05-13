package ZadanieDwa;

public class Woda extends Nalewka {

    Nalewka nalewka;

    public Woda(Nalewka nalewka) {
        this.nalewka = nalewka;
    }

    @Override
    public double receptura() {
        return nalewka.receptura()-8;
    }
}
