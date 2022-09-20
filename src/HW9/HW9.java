package HW9;

import java.util.Random;
import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int rdi;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Угадайте целое число от 0 до 10, ( 3 попытки )");
            rdi = rd.nextInt(10);

            for (int i = 1; i <= 3; i++) {
                if (sc.nextInt() == rdi) {
                    System.out.println("Угадал! с " + i + " попытки :) ");
                    break;
                } else if (i != 3) {
                    System.out.println("Пробуем еще ");
                } else {
                    System.out.println("Не угадал, число " + rdi);
                }
            }
            System.out.println("Поиграем еще? ( 1 / 0 )");
            if (sc.nextInt() != 1) {
                System.out.println("Удачи :)");
                isRunning = false;
            }
        }
    }
}