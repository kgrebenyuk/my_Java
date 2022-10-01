package HW12;

import java.util.Arrays;
import java.util.Random;

public class HW12 {
    public static void main(String[] args) {

        int arrLength = 7;
        Random rd = new Random();

        int[] arr1 = new int[arrLength];
        int[] arr2 = new int[arrLength];

        for (int i = 0; i < arrLength; i++) {
            arr1[i] = rd.nextInt(9);
            arr2[i] = rd.nextInt(9);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int numEqual = 0;
        for (int i = 0; i < arrLength; i++) {
            if (arr1[i] == arr2[i]) {
                numEqual++;
            }
        }
        System.out.print("[ ");
        for (int i = 0; i < arrLength; i++) {
            if (i != arrLength - 1) {
                System.out.print(arr1[i] + ", ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println("]");

        System.out.print("[ ");
        for (int i = 0; i < arrLength; i++) {
            if (i != arrLength - 1) {
                System.out.print(arr2[i] + ", ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println("]");

        System.out.println("Cовпадений: " + numEqual);
    }
}
