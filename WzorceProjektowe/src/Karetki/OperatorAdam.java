package Karetki;

import java.util.ArrayList;

public class OperatorAdam implements Operator {
    ArrayList<Ambulance> ambulances = new ArrayList<>();

    @Override
    public void registerObserver(Ambulance ambulance) {
        ambulances.add(ambulance);

    }

    @Override
    public void removeObserver(Ambulance ambulance) {
        ambulances.add(ambulance);
    }

    @Override
    public void notifyObservers(String accident) {
        for (Ambulance ambulance : ambulances) {
            ambulance.update(accident);
        }
    }
}
