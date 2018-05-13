package WzorzecStrategia;

import WzorzecStrategia.SposobyKwakania.KwakanieInterfejs;
import WzorzecStrategia.SposobyLatania.LatanieInterfejs;

public abstract class Kaczka {
    protected LatanieInterfejs latanieInterfejs;
    protected KwakanieInterfejs kwakanieInterfejs;

    public void wykonajKwacz() {
        kwakanieInterfejs.kwacz();
    }
    public void plywaj(){
        System.out.println("pływu pływu");
    }
    public void wyswietl(){
        System.out.println("wyświetlam kaczkę");
    }

    public void setLatanieInterfejs(LatanieInterfejs latanieInterfejs){

    }
}
