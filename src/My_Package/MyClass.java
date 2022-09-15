package My_Package;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Калькулятор вычисления суммы двух целых чисел :)");
        System.out.println("Введите первое число");
        int num_1 = sc.nextInt();
        System.out.println("Введите второе число");
        int num_2 = sc.nextInt();
        int sum = num_1 + num_2;
        System.out.println(num_1 + " + " + num_2 + " = " + sum);
    }
}
