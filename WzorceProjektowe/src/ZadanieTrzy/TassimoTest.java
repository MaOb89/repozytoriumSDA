package ZadanieTrzy;

public class TassimoTest {
    public static void main(String[] args) {
        DolceGusto dolceGusto = new DolceGusto();
        DolceGustozTassimoAdapter adapter = new DolceGustozTassimoAdapter(dolceGusto);
        adapter.ZrobTassimo();
    }
}
