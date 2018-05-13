package FasadaUbior;

public class UbranieNaZime implements Ubior {
    private bielizna bieliz;
    private bluza bluz;
    private buty but;
    private skarpetki skarp;
    private spodnie spod;
    private czapka czap;

    public UbranieNaZime(bielizna bieliz, bluza bluz, buty but, skarpetki skarp, spodnie spod, czapka czap) {
        this.bieliz = bieliz;
        this.bluz = bluz;
        this.but = but;
        this.skarp = skarp;
        this.spod = spod;
        this.czap = czap;
    }

        @Override
        public void ubierzSie () {
        bieliz.zalozBielizne();
        bluz.zalozBluze();
        but.zalozButy();
        skarp.zalozSkarpetki();
        spod.zalozSpodnie();
        czap.zalozCzapke();;
        }

    }