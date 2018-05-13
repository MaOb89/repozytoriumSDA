package WzorzecDekorator.Kawiarnia.Dodatki;

import WzorzecDekorator.Kawiarnia.Napoj;

public class BitaSmietana extends SkladnikiDekorator {

    Napoj napoj;

    public BitaSmietana (Napoj napoj) {
        this.napoj = napoj;
    }
    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + " z bitą śmietaną";
    }

    @Override
    public double koszt() {
        return 0.6 + napoj.koszt();
    }
}
