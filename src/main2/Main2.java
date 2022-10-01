package main2;

import com.api.Person;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);
        Person person = new Person();

        System.out.println("fname: ");
        person.fname = sc.nextLine();

        System.out.println("sname: ");
        person.sname = sc.nextLine();

        System.out.println("age: ");
        person.age = sc.nextInt();

        if (person.age <= 0){
            System.out.println("age again: ");
            person.age = sc.nextInt();
            if (person.age <= 0){
                System.out.println("Error input age");

        }

/*

            Scanner scanner = new Scanner(System.in);
            System.out.println("Type your name: ");
            String name = scanner.nextLine();
            System.out.println("Type your age: ");
            int age = scanner.nextInt();
            if (age <= 0) {
                System.out.println("Incorrect value, try again: ");
                age = scanner.nextInt();
            }

            if (age <= 0) {
                System.out.println("Error");
            } else {
                System.out.println("Type count of money for this person: ");
                int money = scanner.nextInt();
                Person person = new Person(name, money, age);
                System.out.println(person);
            }
        }
*/
 /*
     System.out.println("Inpet Person's name: ");
        person.name = sc.nextLine();

        System.out.println("Inpet Person's age: ");
        person.age = sc.nextInt();

        System.out.println("Person 1, name: " + person.name + ", age: " + person.age);

        System.out.println(person.getSalary());


        if (person.isAdult(20)){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }

        System.out.println("'"+ person.fname +" " + person.sname + "'");

        System.out.println(person.toString());



  */
    }
}
