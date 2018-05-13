package Refleksja.Wypozyczalnia;

public class RentCar {
    private int rate;
    private String type;

    public int price;

    public RentCar(int length) {
        if (length < 455) {
            type = "Small";
            rate = 35;
        } else if (length >= 455 && length < 495) {
            type = "Mid-size";
            rate = 45;
        } else {
            type = "Large";
            rate = 55;
        }
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void computeRentalCost(int numberDays) {
        price = numberDays * rate;
        System.out.println(price);
    }
}
