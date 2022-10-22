package HW19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner choice = new Scanner(System.in);
        String[] order = new String[100];
        int orderNumber = 0;
        int choiceNumber;

        Drinks drinks = new Drinks(20, 25, 25, 30, 15, 15);

        do {
            System.out.println("\nChoose a drink: ");
            System.out.printf("%s %-9s %d \n", "    1: ", drinks.drinkCoffee.name(), drinks.drinkCoffee.getPrice());
            System.out.printf("%s %-9s %d \n", "    2: ", drinks.drinkTea.name(), drinks.drinkTea.getPrice());
            System.out.printf("%s %-9s %d \n", "    3: ", drinks.drinkLemonade.name(), drinks.drinkLemonade.getPrice());
            System.out.printf("%s %-9s %d \n", "    4: ", drinks.drinkMojito.name(), drinks.drinkMojito.getPrice());
            System.out.printf("%s %-9s %d \n", "    5: ", drinks.drinkMineral.name(), drinks.drinkMineral.getPrice());
            System.out.printf("%s %-8s %d \n", "    6: ", drinks.drinkCoca_cola.name(), drinks.drinkCoca_cola.getPrice());
            System.out.println("    0:  Finish the order");

            choiceNumber = choice.nextInt();

            switch (choiceNumber) {
                case (0):
                    break;
                case (1):
                    Drinks.allPrice += drinks.drinkCoffee.getPrice();
                    order[orderNumber] = drinks.drinkCoffee.name();
                    orderNumber++;
                    break;
                case (2):
                    Drinks.allPrice += drinks.drinkTea.getPrice();
                    order[orderNumber] = drinks.drinkTea.name();
                    orderNumber++;
                    break;
                case (3):
                    Drinks.allPrice += drinks.drinkLemonade.getPrice();
                    order[orderNumber] = drinks.drinkLemonade.name();
                    orderNumber++;
                    break;
                case (4):
                    Drinks.allPrice += drinks.drinkMojito.getPrice();
                    order[orderNumber] = drinks.drinkMojito.name();
                    orderNumber++;
                    break;
                case (5):
                    Drinks.allPrice += drinks.drinkMineral.getPrice();
                    order[orderNumber] = drinks.drinkMineral.name();
                    orderNumber++;
                    break;
                case (6):
                    Drinks.allPrice += drinks.drinkCoca_cola.getPrice();
                    order[orderNumber] = drinks.drinkCoca_cola.name();
                    orderNumber++;
                    break;
                default:
                    System.out.println("Incorrect choice, not taken into order\n");
            }

            System.out.println("Your order:  ");
            for (int i = 0; i < orderNumber; i++) {
                System.out.print(order[i]);
                if (i < orderNumber - 1) System.out.print(", ");
            }

            System.out.println("\nTotal drinks: " + orderNumber + "\nprice:  " + Drinks.allPrice);
            //   System.out.println("\nWould You like to add a drink to order ( 1/0 )");

        } while (choiceNumber != 0);

    }
}
