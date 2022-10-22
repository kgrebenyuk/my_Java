package HW19;

public class Drinks {
    public static int allPrice = 0;
    //COFFEE(0), TEA(0), LEMONADE(0), MOJITO(0), MINERAL(0), COCA_COLA(0);
    public DrinksMachine drinkCoffee = DrinksMachine.COFFEE;
    public DrinksMachine drinkTea = DrinksMachine.TEA;
    public DrinksMachine drinkLemonade = DrinksMachine.LEMONADE;
    public DrinksMachine drinkMojito = DrinksMachine.MOJITO;
    public DrinksMachine drinkMineral = DrinksMachine.MINERAL;
    public DrinksMachine drinkCoca_cola = DrinksMachine.COCA_COLA;

    public Drinks(int priceCoffee, int priceTea, int priceLemonade, int priceMojito, int priceMineral, int priceCoca_cola) {
        this.drinkCoffee.setPrice(priceCoffee);
        this.drinkTea.setPrice(priceTea);
        this.drinkLemonade.setPrice(priceLemonade);
        this.drinkMojito.setPrice(priceMojito);
        this.drinkMineral.setPrice(priceMineral);
        this.drinkCoca_cola.setPrice(priceCoca_cola);
    }

}
