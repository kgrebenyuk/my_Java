package HW12;

import java.util.Random;
import java.util.Scanner;

public class HW12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Задаем размеры матрицы М*N");
        System.out.println("Введите М: ");
        int m = sc.nextInt();
        System.out.println("Введите N: ");
        int n = sc.nextInt();

        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = rd.nextInt(10);
            }
        }

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                arr2[j][i] = arr1[i][j];
            }
        }

        System.out.println("");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
