package Adapter.RadioAdapter;

public class Demo {
    public static void main(String[] args) {
        AnalogSignal radioFM = new RadioFM(24);
        DigitalSignal radioFMadapter = new AnalogToDigitalAdapter(radioFM);
        radioFMadapter.printDigit();


    }
}
