package ZadanieCztery;

public class Fasada {
    private Talk talk;
    private CukierPuder cukierPuder;
    private RikiTikiNark rikitiki;
    private RobotTeodozja robotTeodozja;

    public Fasada(Talk talk, CukierPuder cukierPuder, RikiTikiNark rikitiki, RobotTeodozja robotTeodozja){
        this.talk=talk;
        this.cukierPuder=cukierPuder;
        this.rikitiki=rikitiki;
        this.robotTeodozja=robotTeodozja;
    }

    public void przygotowanie(){
        robotTeodozja.SporzadzCalosc();
        talk.zmieszajWszystko();
        cukierPuder.zmieszajWszystko();
        rikitiki.zmieszajWszystko();
    }
}
