package Fasada.KinoDomowe;

public class FasadaKinaDomowego {
    Ekran ekran;
    Projektor projektor;
    Wzmacniacz wzmacniacz;

    public FasadaKinaDomowego(Ekran ekran, Projektor projektor, Wzmacniacz wzmacniacz) {
        this.ekran = ekran;
        this.projektor = projektor;
        this.wzmacniacz = wzmacniacz;
    }

    public void rozpocznijSeans() {
        ekran.opusc();
        projektor.wlacz();
        projektor.ustawZrodlo("odtwarzacz");
        wzmacniacz.wlacz();
        wzmacniacz.ustawZrodlo("odtwarzacz");
        wzmacniacz.ustawGlosnosc(50);
    }

    public void zakonczSeans() {
        wzmacniacz.wylacz();
        projektor.wylacz();
        ekran.podnies();
    }

    }
