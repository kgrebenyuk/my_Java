package My_Package;

import java.util.Scanner;
import java.lang.String;

public class MyClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float[] score = new float[2];  //нулевые default значения
        String[] name = new String[2];

        System.out.println("Введите имя команды № 1");
        name[0] = sc.nextLine();
        System.out.println("Введите имя команды № 2");
        name[1] = sc.nextLine();

        for (int j = 0; j < 2; j++) {
            for (int i = 1; i < 6; i++) {
                System.out.println("Введите рузультат " + i + " игрока комманды № " + (j + 1));
                score[j] += sc.nextFloat();
            }
            score[j] /= 5; // среднее из 5 по j-й команде
        }
        if (score[0] > score[1])
            System.out.println("Перемогла команда '" + name[0] + "' набрала " + score[0] + " очків");
        else if (score[0] < score[1])
            System.out.println("Перемогла команда '" + name[1] + "' набрала " + score[1] + " очків");
        else
            System.out.println("Нiчья мiж '" + name[0] + "' и '" + name[1] + "' " + score[0] + " / " + score[1]);
    }
}
