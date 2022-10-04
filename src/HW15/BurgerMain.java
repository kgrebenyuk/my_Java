package HW15;

public class BurgerMain {
    public static void main(String[] args) {
        Burger bg1 = new Burger("Обычный бургер", 100, 150, 50, 25, 25);
        Burger bg2 = new Burger("Диетический бургер", 100, 150, 50, 25);
        Burger bg3 = new Burger("Дабл бургер", 100, 150, 50, 25, 25, true);
    }
}