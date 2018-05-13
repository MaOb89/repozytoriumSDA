package ZadanieDwa;

public class SokWisniowy extends Nalewka {

    Nalewka nalewka;

    public SokWisniowy(Nalewka nalewka){
        this.nalewka=nalewka;
    }


    @Override
    public double receptura() {
        return nalewka.receptura();
    }
}
