package Karetki;

public interface Operator {
    void registerObserver(Ambulance ambulance);
    void removeObserver(Ambulance ambulance);
    void notifyObservers(String accident);
}
