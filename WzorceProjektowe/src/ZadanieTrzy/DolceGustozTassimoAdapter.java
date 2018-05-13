package ZadanieTrzy;

public class DolceGustozTassimoAdapter implements TassimoInterfejs {

DolceGusto dolceGusto;
public DolceGustozTassimoAdapter(DolceGusto dolceGusto){
    this.dolceGusto=dolceGusto;
}

    @Override
    public void ZrobTassimo() {
        dolceGusto.ZrobDolceGusto();
    }
}
