package HW11;

import java.util.Random;

public class HW11 {
    public static void main(String[] args) {

        Random rd = new Random();
        int numPlayers = 25, maxAge = 40, minAge = 18;
        int team1Avr = 0, team2Avr = 0;

        int[] team1 = new int[numPlayers];
        int[] team2 = new int[numPlayers];

        for (int i = 0; i < numPlayers; i++) {
            team1[i] = rd.nextInt(maxAge - minAge) + minAge;
            team2[i] = rd.nextInt(maxAge - minAge) + minAge;
        }

        System.out.print("Team 1 age: ");
        for (int age : team1) {
            team1Avr += age;
            System.out.print(age + " ");
        }
        System.out.print(", average: " + team1Avr / numPlayers + "\n");

        System.out.print("Team 2 age: ");
        for (int age : team2) {
            team2Avr += age;
            System.out.print(age + " ");
        }
        System.out.print(", average: "+ team2Avr / numPlayers + "\n");
    }
}
