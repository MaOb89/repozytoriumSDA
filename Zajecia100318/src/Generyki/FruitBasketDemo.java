package Generyki;

public class FruitBasketDemo {
    public static void main(String[] args) {
        FruitBasket<Jablko> koszyk = new FruitBasket<>();
        koszyk.setOwoc(new Jablko());
        koszyk.getOwoc().obierzOwoc();
    }
}
