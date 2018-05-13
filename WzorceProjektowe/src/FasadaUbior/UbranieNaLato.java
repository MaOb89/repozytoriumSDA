package FasadaUbior;

public class UbranieNaLato implements Ubior{
   private bielizna bieliz;
    private bluza bluz;
    private buty but;
    private skarpetki skarp;
    private spodnie spod;

public UbranieNaLato(bielizna bieliz, bluza bluz, buty but, skarpetki skarp, spodnie spod){
    this.bieliz=bieliz;
    this.bluz=bluz;
    this.but=but;
    this.skarp=skarp;
    this.spod=spod;
}

    @Override
    public void ubierzSie() {
    bieliz.zalozBielizne();
    bieliz.podajKolorBielizny("czarna");
    bluz.zalozBluze();
    but.zalozButy();
    skarp.zalozSkarpetki();
    spod.zalozSpodnie();
    }
}
