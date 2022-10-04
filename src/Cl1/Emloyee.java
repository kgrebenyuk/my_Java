package Cl1;

public class Emloyee extends Person{
    int id =10, salary = 100;

    public Emloyee(String fName, String lName, int age, int id, int salary) {
        super(fName, lName, age);
        this.id = id;
        this.salary = salary;
    }
}
