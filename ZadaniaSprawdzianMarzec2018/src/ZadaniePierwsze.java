public class ZadaniePierwsze {
    public static void main(String[] args) {

        String slowo = "Ola ma kota";
        String slowoOdMalejLitery = slowo.toLowerCase();
        slowoOdMalejLitery = slowoOdMalejLitery.replace(".", "").replace(":","").replace(",","")
                .replace("!","").replace(" ","");

        int iloscLiter = slowoOdMalejLitery.length();
        System.out.println(iloscLiter);
        System.out.println(slowoOdMalejLitery);
    }
}
