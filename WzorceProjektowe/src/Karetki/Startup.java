package Karetki;

public class Startup {
    public static void main(String[] args) {
        OperatorAdam adam = new OperatorAdam();
        Ambulance1 amb1 = new Ambulance1(adam);
        Ambulance1 AMB2 = new Ambulance1(adam);
        Ambulance1 amb3 = new Ambulance1(adam);

        adam.notifyObservers("Wypadek samochodowy");
        adam.notifyObservers("Przejechanie walcem");
    }
}
