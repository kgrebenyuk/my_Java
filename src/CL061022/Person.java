package CL061022;

public class Person {
    public final String fName;
    private String lName;
    private int age;
    private String eMail;

    public Person(String fName, String lName, int age, String eMail) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.eMail = eMail;
    }


    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getAge() {
        return age;
    }

    public String geteMail() {
        return eMail;
    }
}
