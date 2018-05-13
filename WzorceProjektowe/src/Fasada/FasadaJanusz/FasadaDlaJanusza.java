package Fasada.FasadaJanusz;

import Fasada.KinoDomowe.FasadaKinaDomowego;

public class FasadaDlaJanusza {
    private Wstawanie wstawanie;
    private WykopDolek wykopDolek;
    private RozlozParawan rozlozParawan;
    private ZadzwonDoGrazy zadzwonDoGrazy;
    private NadmuchajPilke nadmuchajPilke;

    public FasadaDlaJanusza(Wstawanie wstawanie, WykopDolek wykopDolek, RozlozParawan rozlozParawan,
                            ZadzwonDoGrazy zadzwonDoGrazy, NadmuchajPilke nadmuchajPilke){
        this.wstawanie=wstawanie;
        this.wykopDolek=wykopDolek;
        this.rozlozParawan=rozlozParawan;
        this.zadzwonDoGrazy=zadzwonDoGrazy;
        this.nadmuchajPilke=nadmuchajPilke;
    }

    public void Dzialaj(){
        wstawanie.wstan();
        wykopDolek.wykopDolek();
        rozlozParawan.rozlozParawan();
        zadzwonDoGrazy.zadzwonDoGrazyny();
        nadmuchajPilke.namduchajPilke();
    }

}
