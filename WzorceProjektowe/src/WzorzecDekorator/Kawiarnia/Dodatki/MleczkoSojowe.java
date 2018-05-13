package WzorzecDekorator.Kawiarnia.Dodatki;

import WzorzecDekorator.Kawiarnia.Napoj;

public class MleczkoSojowe extends SkladnikiDekorator {
    Napoj napoj;

    public MleczkoSojowe (Napoj napoj) {
        this.napoj = napoj;
    }
    @Override
    public String pobierzOpis() {
        return napoj.pobierzOpis() + "z mleczkiem sojowym";
    }

    @Override
    public double koszt() {
        return 0.5 + napoj.koszt();
    }
}
