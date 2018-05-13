package WzorzecDekorator.Kawiarnia.SkladnikiBazowe;

import WzorzecDekorator.Kawiarnia.Napoj;

public class Espresso extends Napoj {
    @Override
    public String pobierzOpis() {
        return "Espresso";
    }

    @Override
    public double koszt() {
        return 5.00;
    }
}
