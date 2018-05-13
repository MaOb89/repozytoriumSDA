package WzorzecDekorator.Kawiarnia.Dodatki;

import WzorzecDekorator.Kawiarnia.Napoj;

public class Mleko extends SkladnikiDekorator {

    Napoj napoj;

    public Mleko (Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + " z mlekiem";
    }

    @Override
    public double koszt() {
        return 0.3 + napoj.koszt();
    }
}
