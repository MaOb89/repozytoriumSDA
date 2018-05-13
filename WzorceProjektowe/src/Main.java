import Sortowania.Sortowania.SortowanieBabelkowe;
import Sortowania.Sortowania.SortowaniePrzezZliczanie;
import Sortowania.Sortowanie;

public class Main {

    public static void main(String[] args) {

        int [] toSort = {9,2,7,3,6,4,5};
//             SortowaniePrzezZliczanie sortPrzezZlicz = new SortowaniePrzezZliczanie();
//        sortPrzezZlicz.sort(toSort);
//        KaczkaModel km = new KaczkaModel();
//        km.wykonajLec();
//        km.setLatanieInterfejs(new LotZnapedemRakietowym());
//        km.wykonajLec();

        Sortowanie sortowanie = new Sortowanie(new SortowanieBabelkowe());
        int [] poBabelkowym = sortowanie.wykonajSortowanie(toSort);
        for (int i : poBabelkowym) {
            System.out.println(i);
        }
        sortowanie.setSortowanieInterfejs(new SortowaniePrzezZliczanie());
        int[]poZliczaniu = sortowanie.wykonajSortowanie(toSort);
        for (int i: poZliczaniu) {
            System.out.println(i);
        }
       }
}
