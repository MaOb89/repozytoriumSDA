package Generyki;

public class Sweter extends Ubranie {


    public Sweter(String nazwa) {
        super(nazwa);
    }

    @Override
    public void zlozUbranie() {
        System.out.println("Składam");
    }
}

