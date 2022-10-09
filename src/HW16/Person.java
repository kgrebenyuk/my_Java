package HW16;

import java.time.LocalDate;

public class Person {
    public final String fName, birthDay, birthMonth, birthYear, eMail, fonNum;
    public String sName;
    public int weight, pressure, stepNum;
    private int age;

    LocalDate current_date = LocalDate.now();

    public Person(String fName, String birthDay, String birthMonth, String birthYear, String eMail, String fonNum,
                  String sName, int weight, int pressure, int stepNum) {
        this.fName = fName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.eMail = eMail;
        this.fonNum = fonNum;
        this.sName = sName;
        this.weight = weight;
        this.pressure = pressure;
        this.stepNum = stepNum;
        this.age = current_date.getYear() - Integer.parseInt(birthYear);
    }

    public void printAccountInfo() {
        System.out.println("\nФИО :"     + fName + " " + sName);
        System.out.println("ДР  :"       + birthDay + "." + birthMonth + "." + birthYear);
        System.out.println("Лет       :" + age);
        System.out.println("Вес       :" + weight);
        System.out.println("Давление  :" + pressure);
        System.out.println("Шагов/день:" + stepNum);
        System.out.println("E-Mail    :" + eMail);
        System.out.println("тел.      :" + fonNum);
    }

    public String getfName() {
        return fName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public String geteMail() {
        return eMail;
    }

    public String getFonNum() {
        return fonNum;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getStepNum() {
        return stepNum;
    }

    public void setStepNum(int stepNum) {
        this.stepNum = stepNum;
    }

    public int getAge() {
        return age;
    }

}
