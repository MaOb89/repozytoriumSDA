package Adapter.RadioAdapter;

import java.util.Random;

public class RadioFM implements AnalogSignal {
    private double [] analog;
    public RadioFM(int noSamples){
        analog=new double[noSamples];
        Random rand = new Random();
        analog = rand.doubles(noSamples,0,2.0).toArray();
//doubles generuje ciag
    }

    @Override
    public double [] getAnalog() {
        return analog;
    }

    @Override
    public void setAnalog(double[] analog) {
        this.analog=analog;

    }

    @Override
    public void printAnalog() {
        for (double i:analog) {
            System.out.printf("%f",i);
        }

    }
}
