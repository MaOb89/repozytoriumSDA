package Karetki;

public class Ambulance1 implements Ambulance {
    Operator operator;
    static int number;
    int ourNumber;
    public Ambulance1(Operator operator){
        this.operator=operator;
        this.operator.registerObserver(this);
        ourNumber=number++;

    }

    @Override
    public void update(String accident) {
        System.out.println("Ambulans: "+ourNumber + " jadę do: "+accident);
    }
}
