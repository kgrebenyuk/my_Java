package HW14;

public class Person {
    public String personInfo(String fName, String sName, String city, String fonNum) {
        return "Зателефонувати громадянину " + fName.toUpperCase() + " " + sName.toUpperCase()
                + " із міста " + city.toUpperCase() +
                " можна за номером " + fonNum.toUpperCase();
    }
}
