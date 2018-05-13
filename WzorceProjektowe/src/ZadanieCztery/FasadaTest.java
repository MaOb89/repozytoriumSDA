package ZadanieCztery;

public class FasadaTest {
    public static void main(String[] args) {
        Fasada fasada = new Fasada(new Talk(), new CukierPuder(),new RikiTikiNark(), new RobotTeodozja());
        fasada.przygotowanie();
    }
}
