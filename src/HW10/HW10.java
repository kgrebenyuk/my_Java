package HW10;

public class HW10 {
    public static void main(String[] args) {
        int num = 1, i = 1;
        System.out.println("Список 100 номеров без цифр '4' и '9'");
        while (num < 100) {
            if (i / 10 != 4 && i / 10 != 9 && i % 10 != 4 && i % 10 != 9 && (i / 10 % 10 != 4)) {
                if (i % 10 == 0) {
                    System.out.print("\n");
                }
                System.out.print(i + " ");
                num++;
            }
            i++;
        }
    }
}
