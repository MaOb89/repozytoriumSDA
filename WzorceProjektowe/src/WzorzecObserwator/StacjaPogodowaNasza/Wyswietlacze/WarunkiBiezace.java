//package WzorzecObserwator.StacjaPogodowa.Wyswietlacze;
//
//import WzorzecObserwator.StacjaPogodowa.Obserwator;
//import WzorzecObserwator.StacjaPogodowa.Podmiot;
//import WzorzecObserwator.StacjaPogodowa.wyswietlElement;
//
//public class WarunkiBiezace implements Obserwator, wyswietlElement {
//    private Podmiot danePogodowe;
//    private float temp;
//    private float wilgotnosc;
//    private float cisnienie;
//
//    public WarunkiBiezace(Podmiot danePogodowe){
//        this.danePogodowe = danePogodowe;
//        this.danePogodowe.dodajNaListeSubskrybentow(this);
//    }
//
//
//    @Override
//    public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
//        this.temp=temp;
//        this.wilgotnosc=wilgotnosc;
//        this.cisnienie=cisnienie;
//    }
//    @Override
//    public void wyswietlElement(){
//        System.out.printf("Temp: %f :: Ciśnienie: %f :: Wilgotność: %f",temp,cisnienie,wilgotnosc);
//    }
//
//}
