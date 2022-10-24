package HW19;

public enum DrinksMachine {
    COFFEE(0), TEA(0), LEMONADE(0), MOJITO(0), MINERAL(0), COCA_COLA(0);

    private int price;

    DrinksMachine(int price){
        this.price = price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
