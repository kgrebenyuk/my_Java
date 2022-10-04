package HW15;

public class Burger {
    String nameOfBurger;
    int bread, meat, cheese, salad, mayonnaise;
    boolean isDoubleMeat;

    public Burger(String nameOfBurger, int bread, int meat, int cheese, int salad, int mayonnaise) {
        this.nameOfBurger = nameOfBurger;
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;

        printComposition(nameOfBurger, bread, meat, cheese, salad, mayonnaise);
    }

    public Burger(String nameOfBurger, int bread, int meat, int cheese, int salad) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;

        printComposition(nameOfBurger, bread, meat, cheese, salad, 0);
    }

    public Burger(String nameOfBurger, int bread, int meat, int cheese, int salad, int mayonnaise, boolean isDoubleMeat) {
        this.bread = bread;
        this.meat = meat;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        this.isDoubleMeat = isDoubleMeat;

        printComposition(nameOfBurger, bread, meat * 2, cheese, salad, mayonnaise);
    }

    public void printComposition(String nameOfBurger, int bread, int meat, int cheese, int salad, int mayonnaise) {
        System.out.println(nameOfBurger + " (состав в гр.)");
        System.out.println("    булочка - " + bread);
        System.out.println("    мясо    - " + meat);
        System.out.println("    сыр     - " + cheese);
        System.out.println("    зелень  - " + salad);
        System.out.println("    майонез - " + mayonnaise + "\n");
    }
}


