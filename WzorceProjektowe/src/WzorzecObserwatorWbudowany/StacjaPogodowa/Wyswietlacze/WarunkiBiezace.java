package WzorzecObserwatorWbudowany.StacjaPogodowa.Wyswietlacze;

import WzorzecObserwatorWbudowany.StacjaPogodowa.DanePogodowe;
import WzorzecObserwatorWbudowany.StacjaPogodowa.wyswietlElement;

import java.util.Observable;
import java.util.Observer;

public class WarunkiBiezace implements Observer, wyswietlElement {
    private Observable danePogodowe;
    private float temp;
    private float wilgotnosc;
    private float cisnienie;

    public WarunkiBiezace(Observable danePogodowe) {
        this.danePogodowe = danePogodowe;
        this.danePogodowe.addObserver(this);
    }

    @Override
    public void wyswietlElement() {
        System.out.printf("Temp: %f :: Ciśnienie: %f :: Wilgotność: %f", temp, cisnienie, wilgotnosc);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DanePogodowe) {
            DanePogodowe dp = (DanePogodowe) o;
            temp = dp.getTemp();
            wilgotnosc = dp.getWilgotnosc();
            cisnienie = dp.getCisnienie();
        }
    }
}
