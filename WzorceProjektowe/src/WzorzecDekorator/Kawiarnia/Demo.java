package WzorzecDekorator.Kawiarnia;

import WzorzecDekorator.Kawiarnia.Dodatki.Mleko;
import WzorzecDekorator.Kawiarnia.SkladnikiBazowe.Bezkofeinowa;

public class Demo {
    public static void main(String[] args) {
        Napoj bezkofeinowaZmlekiem = new Mleko(new Bezkofeinowa());
        System.out.println(bezkofeinowaZmlekiem.pobierzOpis());
        System.out.println(bezkofeinowaZmlekiem.koszt());
    }
}
