package WzorzecDekorator.Kawiarnia.Dodatki;

import WzorzecDekorator.Kawiarnia.Napoj;

public class Czekolada extends SkladnikiDekorator {
    Napoj napoj;

    public Czekolada(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + "z czekoladą";
    }

    @Override
    public double koszt() {
        return 0.20 + napoj.koszt();
    }


}
