package ZadanieDwa;

public class SokArganiowy extends Nalewka {

    Nalewka nalewka;

    public SokArganiowy(Nalewka nalewka){
        this.nalewka=nalewka;
    }

    @Override
    public double receptura() {
        return nalewka.receptura();
    }
}
