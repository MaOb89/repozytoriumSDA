package ZadanieDwa;

public class SokMalinowy extends SkladnikiDoNalewki {
    Nalewka nalewka;

    public SokMalinowy(Nalewka nalewka){
        this.nalewka=nalewka;
    }

    @Override
    public double receptura() {
        return nalewka.receptura();
    }
}
