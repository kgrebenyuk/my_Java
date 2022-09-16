package My_Package;

import java.util.Scanner;
import java.util.Random;

public class MyClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int in_number, random_mumber;

        while (true) {
            System.out.println("Введите целое число от 1 до 6 ( 0 - выход)");
            in_number = sc.nextInt();
            random_mumber = rd.nextInt(6) + 1;     // (0..5) + 1
            if (in_number == 0) break;
            if (in_number < 1 || in_number > 6) continue;
            if (in_number == random_mumber) {
                System.out.println("Угадал :), число: " + random_mumber);
            } else {
                System.out.println("Не угадал, число: " + random_mumber);
            }
        }
        System.out.println("Удачи :)");
    }
}
