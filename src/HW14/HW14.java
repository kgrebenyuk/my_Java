package HW14;

import HW14.Person;

public class HW14 {
    public static void main(String[] args) {

        Person person = new Person();

        String[] arrPeople =
                {
                        "Will,Smith,New York,2936729462846",
                        "Jackie,Chan,Shanghai,12312412412",
                        "Sherlock,Holmes,London,37742123513"
                };

        for (int i = 0; i < arrPeople.length; i++) {
            String[] str = arrPeople[i].split(",");
            System.out.printf(person.personInfo(str[0], str[1], str[2], str[3] ));;
        }
    }
}
