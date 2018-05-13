package Adapter.RadioAdapter;

public class DigitalRadio implements DigitalSignal {
    private int[] digit;

    public DigitalRadio(int signalLength) {
        digit = new int[signalLength];
    }

    @Override
    public int[] getDigit() {
        return digit;
    }

    @Override
    public void setDigit(int[] digit) {
        this.digit=digit;

    }

    @Override
    public void printDigit() {
        for (int i :digit) {
            System.out.printf("%d ",i);
        }
    }
}
