package WzorzecDekorator.Kawiarnia.SkladnikiBazowe;

import WzorzecDekorator.Kawiarnia.Napoj;

public class MocnoPalona extends Napoj {
    @Override
    public String pobierzOpis() {
        return "Mocno palona";
    }

    @Override
    public double koszt() {
        return 15.00;
    }
}
