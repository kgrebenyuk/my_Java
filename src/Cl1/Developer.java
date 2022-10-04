package Cl1;

public class Developer extends Emloyee{
    public Developer(String fName, String lName, int age, int id, int salary, String primaryLanguage) {
        super(fName, lName, age, id, salary);
        this.primaryLanguage = primaryLanguage;
    }

    String primaryLanguage = "Eng";

}
