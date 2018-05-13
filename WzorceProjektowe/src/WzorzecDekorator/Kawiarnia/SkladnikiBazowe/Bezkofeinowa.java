package WzorzecDekorator.Kawiarnia.SkladnikiBazowe;

import WzorzecDekorator.Kawiarnia.Napoj;

public class Bezkofeinowa extends Napoj {
    @Override
    public String pobierzOpis() {
        return "Bezkofeinowa";
    }

    @Override
    public double koszt() {
        return 11.00;
    }
}
