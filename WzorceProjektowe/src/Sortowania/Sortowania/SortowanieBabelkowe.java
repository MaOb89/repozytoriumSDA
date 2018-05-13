package Sortowania.Sortowania;

import Sortowania.Sortowania.SortowanieInterfejs;

public class SortowanieBabelkowe implements SortowanieInterfejs {

    @Override

   public int [] sort(int[] toSort){

        for(int i=0; i<toSort.length;i++) //idziemy po caĹ‚ej dĹ‚ugoĹ›ci tablicy do posortowania
        {
            for(int j=0;j<toSort.length-1; j++) //za kaĹĽdym razem zaczynamy od poczÄ…tku, aby mieÄ‡
            //pewnoĹ›Ä‡, ĹĽe zawsze uda nam siÄ™ dobrze posortowaÄ‡
            {
                if(toSort[j]>toSort[j+1]) //JeĹĽeli elementy sÄ… w zĹ‚ej kolejnoĹ›ci wykonaj SWAPa
                {
                    //SWAP - zamiana miejscami dwĂłch elementĂłw w tablicy
                    int temp = toSort[j]; //tworzymy zmiennÄ… tymczasowÄ… i od razu zapisujemy do niej pierwszÄ… wartoĹ›Ä‡
                    toSort[j] = toSort[j+1]; //zamieniamy miejscami wartoĹ›ci
                   toSort[j+1] = temp; //odzyskujemy wartoĹ›Ä‡ z temp i zapisujemy na nowym, tym razem odpowiednim miejscu
                }
            }
        }
        return toSort;
    }
}
