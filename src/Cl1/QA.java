package Cl1;

public class QA extends Emloyee{

    public QA(String fName, String lName, int age, int id, int salary, boolean isManual, int salary1) {
        super(fName, lName, age, id, salary);
        this.isManual = isManual;
        this.salary = salary1;
    }

    boolean isManual ;
    int salary ;
}
