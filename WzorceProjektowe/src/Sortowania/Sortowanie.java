package Sortowania;

import Sortowania.Sortowania.SortowanieInterfejs;

public class Sortowanie {
    private SortowanieInterfejs sortowanieInterfejs;

    public Sortowanie(SortowanieInterfejs sortowanieInterfejs) {
      setSortowanieInterfejs(sortowanieInterfejs);
    }

    public int[] wykonajSortowanie(int[] toSort) {
        return sortowanieInterfejs.sort(toSort);
    }
    public void setSortowanieInterfejs(SortowanieInterfejs sortowanieInterfejs){
        this.sortowanieInterfejs=sortowanieInterfejs;
    }
}


