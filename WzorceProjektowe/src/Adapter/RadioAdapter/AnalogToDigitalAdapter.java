package Adapter.RadioAdapter;

public class AnalogToDigitalAdapter implements DigitalSignal {
    AnalogSignal radioFM;

    public AnalogToDigitalAdapter(AnalogSignal analogSignal) {
        radioFM = analogSignal;
    }

    @Override
    public int[] getDigit() {
        int counter=0;
        int sum = 0;
        int[]temp=new int[radioFM.getAnalog().length/8];
        for (int i = 0; i <radioFM.getAnalog().length/8 ; i++) {
            for (int j = 0; j < 8; j++) {
                if(radioFM.getAnalog()[counter] > 1.0)
                    sum += Math.pow(2.0, j);
                counter++;
            }
            temp[i] = sum;
            sum = 0;
        }
        return temp;
    }

    @Override
    public void setDigit(int[] digit) {

    }

    @Override
    public void printDigit() {
        int[]digits=getDigit();
        for (int i:digits) {
            System.out.printf("%d",i);
        }
    }
}
